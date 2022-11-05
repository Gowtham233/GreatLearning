import java.util.*;
class Factorial
{
	public static void main(String []args){
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to identify the factorial");
		num = input.nextInt();
		int factorial = 1;
		for (int i=num ;i>0; i-- )
		{
			factorial = factorial*i;
		}
		System.out.println("The fatorial of "+num+ " is "+ factorial );
	}
}