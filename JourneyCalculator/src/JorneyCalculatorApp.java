import java.util.Scanner;

public class JorneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
 JourneyCalculator journeyCalculator =new JourneyCalculator ();
 System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
 
 scan.close();
	}
}
