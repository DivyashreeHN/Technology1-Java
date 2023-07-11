import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int result1=subtractNumber(20,5);
		int result2=multiplyNumber(4,5);
		double result3=divideNumbers(22,10);
		int result4=findRemainder( 10,3);
		System.out.println("result of subtract:"+result1);
		System.out.println("result of mul:" + result2);
		System.out.printf("result of div: %.2f\n" ,result3);
		System.out.println("result of remainder:" + result4);
		scan.close();
	}
	


public static int subtractNumber(int num1,int num2)
{
	return num2-num1;
}
public static int multiplyNumber(int num1,int num2)
{
	return num1*num2;
}
public static int divideNumbers(int num1, int num2)
{
	return num1/num2;
}
public static int findRemainder(int num1, int num2)
{
	return num2%num1;
}
}