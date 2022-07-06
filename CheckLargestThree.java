import  java.util.Scanner;
public class CheckLargestThree {

	public static void main(String[] args) {
			
			System.out.println("----------Check Largest Among Three Number -----------");
			System.out.println("Enter First Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			int a = Firstvalue.nextInt();
			System.out.println("Enter Sceond Number : ");
			int b = Firstvalue.nextInt();
			System.out.println("Enter Third Number : ");
			int c = Firstvalue.nextInt();
			
			if(a >= b){
				if(a >= b)
					System.out.println("This is largest Number : "+a );
				else
					System.out.println("This is largest Number : "+c);
			
			}
			else{
				if(b >= c)
					System.out.println("This is largest Number : "+b);
				else
					System.out.println("This is largest Number: "+c);
			}
			Firstvalue.close();	
	}
}