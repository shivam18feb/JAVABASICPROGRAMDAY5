import  java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
			
			System.out.println("----------Quotient Remainder-----------");
			System.out.println("Enter Dividend Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			int DividendValue = Firstvalue.nextInt();
			System.out.println("Enter Divisor Number : ");
			int DivisorValue = Firstvalue.nextInt();
			int QuotientAns = DividendValue / DivisorValue;
			int RemainderAns = DividendValue % DivisorValue;
			System.out.println("Quotient :" + QuotientAns);
			System.out.println("Remainder :" + RemainderAns);
			Firstvalue.close();
	}
}