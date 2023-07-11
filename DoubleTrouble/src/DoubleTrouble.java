import java.util.Scanner;

public class DoubleTrouble {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number to be doubled");
	int num=scan.nextInt();

	int result=doubleTheNumber(num);
		System.out.println(result);
		scan.close();
}
		public static int doubleTheNumber(int num)
		{
			return num*2;
		}
	}
	
	


