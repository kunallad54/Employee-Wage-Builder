package com.company.day9;

public interface EmployeeWageInterface {
    void addCompanyEmpWage(String companyName, int wagePerHour, int numberOfWorkingDays, int maxWorkingHours);

    void computeEmpWage();

    int computeEmpWage(CompanyEmpWage companyEmpWage);

    void displayInfo(String cName, int aCount, int fTCount, int pTCount, int tHours);

    int wageCalculator(int hourlyWage, int empHrs);
}
