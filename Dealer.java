/**
 * @(#)Dealer.java
 *
 *
 * @author
 * @version 1.00 2019/12/8
 */

import java.util.Scanner;
public class Dealer extends Die {

	public enum Status{ CONTINUE, WON, LOST };

	public static final int SNAKE_EYES = 2;
	public static final int TREY = 3;
	public static final int SEVEN = 7;
	public static final int YO_LEVEN = 11;
	public static final int BOX_CARS = 12;


	static int PointTotal = 0;
	static int dice;
	static Status gameStatus;
	static Die die2 = new Die();
	static int newbalance;

	static int NewBankBalance;
	static int Newbank;
	static int bank;


	public static void ShowResult(int dice){
		switch (dice){
			case SEVEN:
			case YO_LEVEN:
			gameStatus = Status.WON;
			System.out.println("Player Wins!");
			break;

			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
			gameStatus = Status.LOST;
			System.out.println("Player Lost!");
			break;

			default:
				gameStatus = Status.CONTINUE;

			PointTotal = dice;
			System.out.printf("Players Point is: %d%n", PointTotal);
			System.out.println("");
			break;


		}

		while (gameStatus == Status.CONTINUE)
		{
			dice = die2.RollDice();
			if(dice == PointTotal){
				gameStatus = Status.WON;
				System.out.println("The Next Roll is: " + die2.getSum() +  ( "\n" + "Player Wins!"));
			}

			else{
				if (dice == SEVEN) {
					gameStatus = Status.LOST;
					System.out.println("The Next Roll is: " + die2.getSum() + ( "\n" + "Player Loses!"));
				}
			}
}
}

	public static int NewBalance(){
		if(gameStatus == Status.WON){
			bank = (Player.getWager() + Player.getBankBalance());
			System.out.println("Your new balance is: $" + (bank));
		}

		else if(gameStatus == Status.LOST){
			//System.out.println("Your new balance is: $" + (Player.getBankBalance() - Player.getWager()));
			bank = (Player.getBankBalance() - Player.getWager());
			System.out.println("Your new balance is: $" + (bank));
		}
		
		return bank;
	}



	public static void bankrupt(){
		if(bank <= 0) {
			System.out.println("");
			System.out.println("BANKRUPT!, You Have Lost All Your Money GO HOME!");
			System.exit(sum);
			
			}
	}


	public int getNewBalance(){
		return NewBalance();
	}
}