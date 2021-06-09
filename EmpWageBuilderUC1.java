public class EmpWageBuilderUC1{
	public static void main(String [] args){
		int IS_ABSENT = 0;
		int IS_FULLTIME = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY = 8;
		int HALF_DAY = 4;
		int wageCalculator;
		int empCheck =(int) (Math.floor(Math.random() * 10)) % 3;
		if (empCheck == IS_FULLTIME){
			System.out.println("Employee is Present");
			wageCalculator = WAGE_PER_HOUR * FULL_DAY;
			System.out.println("Employee Wage for the day is : "+wageCalculator);
		}
		else if( empCheck == IS_ABSENT){
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for the day is zero");
		}
		else{
			System.out.println("Employee was present for half day");
			wageCalculator = WAGE_PER_HOUR * HALF_DAY;
			System.out.println("Employee wage for part time is : "+wageCalculator);
		}
	}
}
