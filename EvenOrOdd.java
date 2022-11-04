import java.util.*;

class EvenOrOdd{
	public static void main(String []args){

		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the natural number to check if the number is odd or even");
		number = input.nextInt(); 
		if (number%2==0)
		{
			System.out.print("The number" + number + " is Even");
		}
		else{
			System.out.print("The number" + number + " is Odd");
		}

	}

}