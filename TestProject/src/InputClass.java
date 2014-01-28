import java.util.Scanner;
public class InputClass {
	public static void main (String args[])
	{
		int a;
		int b;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number ");
		a=input.nextInt();
		System.out.println("Enter second number");
		b=input.nextInt();
		int c=a+b;
		System.out.println("The sum of these nubmers are " + c);
	}

}
