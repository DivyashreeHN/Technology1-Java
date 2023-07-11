import java.util.Scanner;

public class MarksAverage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks1=scan.nextInt();
		int marks2=scan.nextInt();
		int marks3=scan.nextInt();
		int marks4=scan.nextInt();
		int marks5=scan.nextInt();
		int marks6=scan.nextInt();
		int marks7=scan.nextInt();
		int marks8=scan.nextInt();
		
		System.out.printf("%.2f",marksAverage( marks1,marks2, marks3, marks4, marks5, marks6, marks7, marks8));
	scan.close();
	}
public static double marksAverage(int marks1,int marks2,int marks3,int marks4,int marks5,int marks6,int marks7,int marks8)
{
	return (marks1+marks2+marks3+marks4+marks5+marks6+marks7+marks8)/8.0;
}
}
