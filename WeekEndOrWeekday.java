import java.util.*;
class WeekEndOrWeekday{
	public static void main(String []args){
		
		String day;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the day to check in captial Letters");
		day = input.next();
		switch(day)
		{
			case "MONDAY" :
			case "TUESDAY" :
			case "WEDNESDAY" :
			case "THURSDAY" :
			case "FRIDAY" :
			{
				System.out.println("The day "+ day+" is Weekday");
				break;
			}
			case "SATURDAY" :
			case "SUNDAY" :
			{
				System.out.println("The day "+ day+" is Weekend");
				break;
			}
			default :{
				System.out.println("Enter the valid day");
			}
		}
	}
}