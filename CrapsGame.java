import java.util.Scanner;
public class CrapsGame{

	private static int wager;
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		while ( Player.getBankBalance() < 10000000 ){

		System.out.println("Welcome To The Craps Game" );
		System.out.println("");

		System.out.println("Your Current Bank Balance is: $" + Player.getBankBalance());
		Player.PlaceBet();
		System.out.println("You Are Betting: $" + Player.getWager());

		System.out.println("");

		Die.RollDice();
		Dealer.ShowResult(Die.getSum());
		Crowd.CrowdReaction(Die.getSum());
		Dealer.NewBalance();
		Dealer.bankrupt();

		while(Player.getBankBalance() > 0){

			Scanner confirmNextGame = new Scanner(System.in);
			System.out.println("Would You Like To Roll Again? Enter 'y' for yes or 'n' for no:");
			String confirm = confirmNextGame.nextLine();
			
			
			if (confirm.equals("y")){
				Player.NewBet();

				Die.RollDice();
				Dealer.ShowResult(Die.getSum());
				Crowd.CrowdReaction(Die.getSum());
				Dealer.NewBalance();
				Dealer.bankrupt();

			}	
			else{
				if(confirm.equals("n")){
					System.out.println("Thanks For Playing The Craps Game");
					break;
			}
		}
	}
	System.out.println("");	
	break;

		}
	}
}
