
public class WageUC2 {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int EMP_WAGE_PER_HR = 20;
		int attendance =  (int) (Math.floor(Math.random()*10)%2);
		if (attendance == IS_PRESENT) {
			System.out.println("employee is present");
			int WORKING_HRS = 8;
			int EmpWage = WORKING_HRS*EMP_WAGE_PER_HR;
			System.out.println(EmpWage);
		}
		else {
			System.out.println("employee is absent");
		}
	}
}
	
