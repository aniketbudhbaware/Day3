
public class UsingSwitchcase {
	public static void main(String[] args) {
		int EMP_WAGE_PER_HR = 20;
		int attendance =  (int) (Math.floor(Math.random()*10)%3);
		switch (attendance) {
		case 1:
			int WORKING_HRS = 16;
			int EmpWage = WORKING_HRS*EMP_WAGE_PER_HR;
			System.out.println("Full time wage :" +EmpWage);
		break;
		case 2:
			int WORKING_HRS2 = 8;
			int EmpWage2 = WORKING_HRS2*EMP_WAGE_PER_HR;
			System.out.println("Part time wage :" +EmpWage2);
		break;
		default:
		System.out.println("employee is absent");
		}
	}

}
