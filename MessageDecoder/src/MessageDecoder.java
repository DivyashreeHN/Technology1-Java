import java.util.Scanner;

public class MessageDecoder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character to decode");
			char ch=scan.next().charAt(0);
			System.out.println(messageDecoder(ch));
scan.close();
	}
public static int messageDecoder(char ch)
{
	return ch;
}
}
