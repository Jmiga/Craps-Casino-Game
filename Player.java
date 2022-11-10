/**
 * @(#)Player.java
 *
 *
 * @author
 * @version 1.00 2019/12/8
 */

import java.util.Scanner;
public class Player {

private static int NewBankBalance = 0;
private static String playerName;
private static int bankbalance;
private static int wager;
private static int newbalance;

public Player(String playerName){
}


    public static void PlaceBet(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Bank Balance: ");
			bankbalance = sc.nextInt();

        System.out.println("Enter the amount you would like to bet: ");
        wager = sc.nextInt();

        while(wager > bankbalance){
            System.out.println("Wager more than bank balance. " + "Enter wager again");
            wager = sc.nextInt();
            wager = wager;

}
}


	public static void NewBet(){
		Scanner sc = new Scanner(System.in);

		bankbalance = Dealer.NewBalance();
		System.out.println("Enter the amount you would like to bet: ");
		wager = sc.nextInt();
		while(wager > bankbalance){
			System.out.println("Wager more than bank balance. " + "Enter wager again");
			wager = sc.nextInt();
			wager = wager;
		}
		
	}


	public static int getWager(){
		return wager;
	}

	public static int getBankBalance(){
		return bankbalance;
	}

	public static int getNewBankBalance(){
		return NewBankBalance;
	}

}