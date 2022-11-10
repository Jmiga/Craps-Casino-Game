/**
 * @(#)Die.java
 *
 *
 * @author
 * @version 1.00 2019/12/8
 */

import java.util.Random;
public class Die{

	private static final Random randomNumbers = new Random(); // create random number for use in method rollDice
	public static int sum;

	public static int RollDice(){
		int die1 = 1 + randomNumbers.nextInt(6); //first die roll
		int die2 = 1 + randomNumbers.nextInt(6); // second die roll

		int sum = die1 + die2; // sum of rolls

		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		Die.sum = sum;
		return sum;
	}


	public static int getSum(){
        return sum;
	}

}

