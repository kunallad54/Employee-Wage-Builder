public class EmpWageBuilderUC1{
	public static void main(String [] args){
		int IS_ABSENT = 0;
		int IS_FULLTIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY = 8;
		int HALF_DAY = 4;
		int wageCalculator;
		int salary = 0;
		int presentCount = 0;
		int absentCount = 0;
		int halfDayCount = 0;
		int totalWorkingHours = 0;
		int i=1;
		while(i<=20){
			int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
			if(empCheck == IS_ABSENT)
				absentCount++;
			else if(empCheck == IS_FULLTIME){
                                wageCalculator = WAGE_PER_HOUR * FULL_DAY;
				salary = salary + wageCalculator;
				presentCount++;
				totalWorkingHours += FULL_DAY;
				if(totalWorkingHours == 100)
					i=20;
			}
			else if(empCheck == IS_PART_TIME){
                        	wageCalculator = WAGE_PER_HOUR * HALF_DAY;
				salary = salary + wageCalculator;
				halfDayCount++;
				totalWorkingHours += HALF_DAY;
				if(totalWorkingHours == 100)
					i=20;
			}
			else{
				System.out.println("ERROR OCCURED");
			}
			i++;
		}
		System.out.println("Employee was present for : "+presentCount+" days");
		System.out.println("Employee was absent for : "+absentCount+" days");
		System.out.println("Employee was present for half day for: "+halfDayCount+" days");
		System.out.println("Total Working Hours: "+totalWorkingHours);
		System.out.println("Salary for the month is : "+salary+ " Rs/-");
	}
}
