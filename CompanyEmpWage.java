package com.company.day9;

public class CompanyEmpWage {

    public final String companyName;
    public final int wagePerHour;
    public final int numberOfWorkingDays;
    public final int maxWorkingHours;
    public int totalEmpWage;

    public CompanyEmpWage(String companyName, int wagePerHour, int numberOfWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString(){
        return "Total Employee Wage for Company "+companyName+" is : "+totalEmpWage;
    }
}
