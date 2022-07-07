import  java.util.Scanner;
public class FilpCoin {
			int Coinchoice;
			public static void main (String[] args){
			CoinToss test = new CoinToss(); 
			System.out.println("----------------Filp Coins-----------------");
			do
			{
				System.out.println("Enter '1' to filp Coin OR Enter '0' to Quit: ");
				Scanner Firstvalue = new Scanner(System.in);
				Coinchoice = Firstvalue.nextInt();
				if(Coinchoice == 1)
				{
					test.filp();
				
				}
				else if (Coinchoice > 1)
				{
					System.out.println("Enter valid - like 1 OR 0");
					Coinchoice= Firstvalue.nextInt();
				
				}
				Firstvalue.close();
			}
		while(Coinchoice!=0);
	}
}