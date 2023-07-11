import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a amount");
		double amount=scan.nextDouble();
		
		System.out.printf("%.2f",halveIt( amount));
		scan.close();
	}
public static double halveIt(double amount)
{
	return amount/2.0;
}
}
