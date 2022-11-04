import java.util.*;

class Palindrome{
	public static void main(String []args){
		long number;
		long revNumber = 0L;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome");
		number = input.nextLong();
		long temp = number;
		while(number>0){
		revNumber = revNumber*10 + number%10;
		number = number/10;
		}
		if(temp == revNumber )
		{
			System.out.println("The number "+temp+" is a Palindrome number");
		}
		else{
			System.out.println("The number "+temp+" is not a Palindrome number");
		}
	}
}

