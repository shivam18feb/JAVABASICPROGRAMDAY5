import  java.util.Scanner;
public class EvenOddCheck {

	public static void main(String[] args) {
			
			System.out.println("----------Check The Number Even or Odd-----------");
			System.out.println("Enter a Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			int a = Firstvalue.nextInt();
			if(a % 2 == 0)
				
			
			
				System.out.println("Is Even :"+a);
			else
				System.out.println("Is Odd :" +a);
			Firstvalue.close();
	}
}