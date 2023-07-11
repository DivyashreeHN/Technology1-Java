import java.util.Scanner;

public class SurfaceAreaApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a radius");
		double num=scan.nextDouble();
		SurfaceArea surfacearea=new SurfaceArea();
		surfacearea.radiusCalculate(num);
		System.out.printf("%.2f",surfacearea.radiusCalculate(num));
		scan.close();
	}

}
