public class EmpWageBuilderUC1{
	public static void main(String [] args){
		//int IS_ABSENT = 0;
		//int IS_FULLTIME = 1;
		//int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY = 8;
		int HALF_DAY = 4;
		int wageCalculator;
		int salary = 0;
		int presentCount = 0;
		int absentCount = 0;
		int halfDayCount = 0;
		for(int i=1;i<=20;i++){
			int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
			switch(empCheck){
				case 0:
					absentCount++;
                                	break;
				case 1:
                                	wageCalculator = WAGE_PER_HOUR * FULL_DAY;
					salary = salary + wageCalculator;
					presentCount++;
					break;
				case 2:
                        		wageCalculator = WAGE_PER_HOUR * HALF_DAY;
					salary = salary + wageCalculator;
					halfDayCount++;
					break;
				default:
					System.out.println("ERROR OCCURED");
					break;
			}
		}
		System.out.println("Employee was present for : "+presentCount+" days");
		System.out.println("Employee was absent for : "+absentCount+" days");
		System.out.println("Employee was present for half day for: "+halfDayCount+" days");
		System.out.println("Salary for the month is : "+salary+ " Rs/-");
	}
}
