import  java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
			
			System.out.println("----------Swap Two Numbers-----------");
			System.out.println("Enter First Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			int a = Firstvalue.nextInt();
			System.out.println("Enter Second Number : ");
			int b = Firstvalue.nextInt();
			int temp = a;
			a = b;
			b = temp;
			System.out.println("Current Number :" +a);
			System.out.println("Current Number :" +b);
			Firstvalue.close();
	}
}