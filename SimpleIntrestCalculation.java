import java.util.Scanner;
class SimpleIntrestCalculation{
	public static void main (String []args){
		double simpleIntrest;
		int noOfYears;
		double intrest;
		long principleAmount;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter no of years");
		noOfYears = input.nextInt();
		System.out.println("Enter Rate of intrest");
		intrest = input.nextDouble();
		System.out.println("Enter Principle Amount");
		principleAmount = input.nextLong();

		simpleIntrest = (principleAmount*intrest*noOfYears)/100;
		System.out.println("Simple interest rate for the given details is"+ simpleIntrest +" %");


	}

}