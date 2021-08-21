
public class WageUC3 {
	public static void main(String[] args) {
		int IS_FULLTIME = 1;
		int IS_PARTTIME = 2;
		int EMP_WAGE_PER_HR = 20;
		int attendance =  (int) (Math.floor(Math.random()*10)%3);
		if (attendance == IS_FULLTIME) {
			int WORKING_HRS = 16;
			int EmpWage = WORKING_HRS*EMP_WAGE_PER_HR;
			System.out.println("Full time wage :" +EmpWage);
		}
		else if (attendance == IS_PARTTIME) {
			int WORKING_HRS = 8;
			int EmpWage = WORKING_HRS*EMP_WAGE_PER_HR;
			System.out.println("Part time wage :" +EmpWage);
		}
		else {
			System.out.println("employee is absent");
		}
	}

}