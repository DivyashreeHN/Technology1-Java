import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal,interest,time");
		double principal=scan.nextDouble();
		double interest=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator financecalculator=new FinanceCalculator();
		System.out.printf("%.2f",financecalculator.financeCalculate( principal, interest, time));
		scan.close();
				}

}
