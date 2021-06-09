public class EmpWageBuilderUC1{
	public static void main(String [] args){
		int IS_FULLTIME = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY = 8;
		int wageCalculator;
		int empCheck =(int) (Math.floor(Math.random() * 10)) % 2;
		if (empCheck == IS_FULLTIME){
			System.out.println("Employee is Present");
			wageCalculator = WAGE_PER_HOUR * FULL_DAY;
			System.out.println("Employee Wage for the day is : "+wageCalculator);
		}
		else{
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for the day is zero");
		}
	}
}
