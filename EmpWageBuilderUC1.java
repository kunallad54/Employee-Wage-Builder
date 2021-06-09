public class EmpWageBuilderUC1{
	public static void main(String [] args){
		int IS_FULLTIME = 1;
		int empCheck =(int) (Math.floor(Math.random() * 10)) % 2;
		if (empCheck == IS_FULLTIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
