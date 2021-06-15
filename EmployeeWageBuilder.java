public class EmployeeWageBuilder{

    public static final int ABSENT = 0;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    // main method
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Problem !!!");
        System.out.println();
        employeeAttendanceChecker();

    }

    // checks employee attendance and  displays salary of employee
    public static void employeeAttendanceChecker() {

        int numberOfWorkingDays = 0;
        int totalWorkingHours = 0;
        int salary =0;
        int fulTimeCount = 0;
        int partTimeCount = 0;
        int absentCount = 0;

        while (numberOfWorkingDays != 20) {

            int empHours = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case ABSENT ->{
                    absentCount++;
                    empHours = 0;
                }

                case FULL_TIME -> {
                    fulTimeCount++;
                    empHours = 8;
                }

                case PART_TIME -> {
                    partTimeCount++;
                    empHours = 4;
                }

            }

            totalWorkingHours += empHours;

            if(totalWorkingHours >= 100){

		totalWorkingHours = 100;
                break;

	    }

            int wage = wageCalculator(empHours);
            salary += wage;
            numberOfWorkingDays++;

        }

        System.out.println("Absent : "+absentCount+" Days");
        System.out.println("Full Time Present : "+fulTimeCount+" Days");
        System.out.println("Part Time Present : "+partTimeCount+" Days");
        System.out.println("Employee total working hours : "+totalWorkingHours);
        System.out.println("Employee Salary for the month is : " + salary + " Rs /-");

    }

    // returns the wage of employee per day
    public static int wageCalculator(int workingHours) {

        int WAGE_PER_HOUR = 20;
        return WAGE_PER_HOUR * workingHours;

    }
}
