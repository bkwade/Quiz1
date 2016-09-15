import java.util.Scanner;
import java.lang.Math;

public class qbrating_method {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double ATT;
		//Number of passing attempts
		double COMP;
		//Number of completions thrown
		double TD;
		//Number of touchdowns thrown
		double YDS;
		//Number of passing yards
		double INT;
		//Number of interceptions thrown
		
		Scanner scanner = new Scanner(System.in); 
		//Enter user values
		System.out.print("Number of Passing Attempts (ATT): ");
		ATT = scanner.nextDouble();
		System.out.print("Number of Completions (COMP): ");
		COMP = scanner.nextDouble();
		System.out.print("Number of Touchdowns Thrown (TD): ");
		TD = scanner.nextDouble();
		System.out.print("Passing Yards (YDS): ");
		YDS = scanner.nextDouble();
		System.out.print("Number of Interceptions Thrown (INT): ");
		INT = scanner.nextDouble();
		
		//Calculate QB Rating
		double a = (((COMP / ATT) - 0.3) * 5);
		double b = (((YDS / ATT ) - 3) * 0.25);
		double c = ((TD / ATT) * 20);
		double d = 2.375 - ((INT / ATT) * 25);
		
		double qbrating = (((a + b + c + d) / 6)) * 100;
		
		//Print QB Rating for User
		System.out.println("QB Rating is " + qbrating);
		
		

		
				
		
		
	}

}
