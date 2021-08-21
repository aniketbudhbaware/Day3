
public class WageUC5 {
	
	public static void main(String[] args) {
		int IS_FULLTIME = 1;
		int IS_PARTTIME = 2;
		int Tdays = 20;
		int EMP_WAGE_PER_HR = 20;
		int sumofsalary=0;
		int wage=0;
		for (int i = 1; i <=Tdays; i++) {
			int attendance =  (int) (Math.floor(Math.random()*10)%3);
			if (attendance == IS_FULLTIME) {
				int WORKING_HRS = 16;
				wage=EMP_WAGE_PER_HR*WORKING_HRS;
				sumofsalary = sumofsalary+wage;
			}
			else if (attendance == IS_PARTTIME) {
				int WORKING_HRS = 8;
				wage=EMP_WAGE_PER_HR*WORKING_HRS;
				sumofsalary = sumofsalary+wage;
			}
			else {
				sumofsalary = sumofsalary+wage;
			}
		}
		System.out.println("total salary:" +sumofsalary);
	}
}