import  java.util.Scanner;
public class HarmonicSeries {
	
	public static double harmonicValue(double n)
	{
		double val = 0.0;
		for (int i=1; i<=n;i++){
			val = val +(1.0/i);
			
			
		}
	return val;
	}
	public static void main(String[] args) {
			
			System.out.println("----------Harmonic Number -----------");
			System.out.println("Enter Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			double h = Firstvalue.nextInt();
			double Result = harmonicValue(h);
			if(h>0){
					System.out.println("Harmonic value of number is: " + Result);
			
			}
			else{
				System.out.println("Number is greater than Zero ");
			
			}
			Firstvalue.close();
	}
}