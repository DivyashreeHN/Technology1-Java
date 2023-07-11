import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter minute");
		int minute=scan.nextInt();
		System.out.println(convertHours(minute));
		scan.close();

	}
public static double convertHours(int minute)
{
	return minute/60.0;
}
}
