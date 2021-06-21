package com.company.day9;

/**
 * Ability to manage Employee Wage of multiple companies
 * - Note: Refactor to have one EmpWageBuilder to manage for Wage for multiple Company
 * - Create CompanyEmpWage class and let EmpWageBuilder has array of many CompanyEmpWage Object
 *
 * @author Krunal Lad
 * @Since 21-06-2021
 */

public class EmployeeWageBuilder implements EmployeeWageInterface{

    static EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
    // declaring instance variables
    private static final int ABSENT = 0;
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    // created array of type CompanyEmpWage
    public EmployeeWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    @Override
    public void addCompanyEmpWage(String companyName,int wagePerHour,int numberOfWorkingDays,int maxWorkingHours){
        companyEmpWageArray[numOfCompany]=new CompanyEmpWage(companyName,wagePerHour,numberOfWorkingDays,maxWorkingHours);

        numOfCompany++;
    }

    @Override
    public void computeEmpWage(){
        for (int i = 0; i < numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    @Override
    public int computeEmpWage(CompanyEmpWage companyEmpWage){
        int absentCount = 0;
        int fullTimeCount = 0;
        int partTimeCount = 0;
        int totalWorkingHours = 0;
        int totalEmpWage = 0;

        // checks attendance and calculates salary for month or total working days
        for (int i = 1; i <= companyEmpWage.numberOfWorkingDays; i++) {

            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {

                case ABSENT -> {
                    absentCount++;
                    empHrs = 0;
                }

                case FULL_TIME -> {
                    fullTimeCount++;
                    empHrs = 8;
                }

                case PART_TIME -> {
                    partTimeCount++;
                    empHrs = 4;
                }
            }
            totalWorkingHours += empHrs;

            if (totalWorkingHours >= companyEmpWage.maxWorkingHours) {
                totalWorkingHours = companyEmpWage.maxWorkingHours;
                break;
            }

            int wageForTheDay = wageCalculator(companyEmpWage.wagePerHour, empHrs);
            totalEmpWage += wageForTheDay;
        }
        System.out.println();
        displayInfo(companyEmpWage.companyName, absentCount, fullTimeCount, partTimeCount, totalWorkingHours);
        return totalEmpWage;
    }

    // displays all information on console
    @Override
    public void displayInfo(String cName, int aCount, int fTCount, int pTCount, int tHours) {

        System.out.println("Following gives the Employee Wage Details for the company : " + cName);
        System.out.println("Employee Absent : " + aCount + " days");
        System.out.println("Employee Full Time : " + fTCount + " days");
        System.out.println("Employee Part Time : " + pTCount + " days");
        System.out.println("Total Working Hours : " + tHours + " hours");

    }

    // returns wage for the day
    @Override
    public int wageCalculator(int hourlyWage, int empHrs) {
        return hourlyWage * empHrs;
    }

    //main method
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program !!! ");

        employeeWageBuilder.addCompanyEmpWage("D-MART",20,20,100);
        System.out.println();
        employeeWageBuilder.addCompanyEmpWage("Reliance Retail",10,30,200);
        employeeWageBuilder.computeEmpWage();
    }
}

