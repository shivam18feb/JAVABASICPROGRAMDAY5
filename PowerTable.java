import  java.util.Scanner;
public class PowerTable {


    public static void main(String[] args) {
			
			System.out.println("----------Power of Table -----------");
			System.out.println("Enter Number : ");
			Scanner Firstvalue = new Scanner(System.in);
			int power = Firstvalue.nextInt();
			System.out.println("Power of 2" +power+ "is : "+(Math.pow(2, power)));
			System.out.println();
			System.out.println("Print all power Values :" +power);
			
			for(int i=1;i<=power;i++){
				System.out.println("Power of 2"+i+"is:"+(Math.pow(2, i)));
			}
	Firstvalue.close();
	}
}