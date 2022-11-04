import java.util.*;
class CentiToInchAndViceVersa{
	public static void main(String []args){
		double input;
		int option;
		double output;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input for the conversion");
		input = in.nextDouble();
		System.out.println("Enter 1. Centimeter to inch conversion 2. Inch to Centimeter conversion");
		option = in.nextInt();
		switch(option)
		{
		case 1: {
			output = input/2.54;
			System.out.println(input+" Centimeter is equals to "+ output+ " Inches" );
			break;
		}
		case 2: {
			output = 2.54*input;
			System.out.println(input+" Inches is equals to "+ output+ " Centimeters" );
			break;
		}
		default:
			System.out.println("Enter the valid option");
		}

	}
}