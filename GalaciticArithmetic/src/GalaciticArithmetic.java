import java.util.Scanner;

public class GalaciticArithmetic {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 long num1=scan.nextLong();
		 long num2=scan.nextLong();
		 System.out.println(galaciticAddition(num1,num2));
		scan.close();
	}
		public static long galaciticAddition(long num1,long num2)
		{
			
		return num1+num2;
	}

}
