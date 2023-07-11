import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a height");
		
		double height=scan.nextDouble();
		HeightConverter heightconverter=new HeightConverter();
		System.out.printf("%.2f",heightconverter.convertHeight(height));
		scan.close();
		}

}
