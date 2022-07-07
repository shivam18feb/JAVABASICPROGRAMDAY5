import  java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
			
			System.out.println("----------Check Year its Leap Or not -----------");
			System.out.println("Enter a year : ");
			Scanner Firstvalue = new Scanner(System.in);
			int year = Firstvalue.nextInt();
			boolean Leap = false;
			
			if(year%4==0){
				if(year % 100 == 0){
					if(year % 400 == 0)
						Leap = true;
					else
						Leap =false;
				
				}
				else
					Leap= true;
			}
			else
				Leap =false;
			if(Leap)
				System.out.println(year + "is a leap year");
			else
				System.out.println(year + "is not a leap year");
			
			Firstvalue.close();
	}
}