package hellojava;

public class emphours {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		//variables
		int emphrs = 0;
		int empWage = 0;
		//computation
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		  switch ((int)empCheck) {
		  case IS_FULL_TIME:
		emphrs = 8;
		break;
		     case IS_PART_TIME:
		emphrs = 4;
		break;
		default:
		emphrs = 0;
		}
		empWage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :" +empWage);
	}

}


