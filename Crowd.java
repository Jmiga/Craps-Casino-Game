/**
 * @(#)Crowd.java
 *
 *
 * @author
 * @version 1.00 2019/12/8
 */


public class Crowd extends Die {

	public static final int SNAKE_EYES = 2;
	public static final int TREY = 3;
	public static final int SEVEN = 7;
	public static final int YO_LEVEN = 11;
	public static final int BOX_CARS = 12;

    public static void CrowdReaction(int Die){
    	switch(Die){
			case SEVEN:
			case YO_LEVEN:
				System.out.println("");
				System.out.println("ONLOOKERS: AHH Better Luck Next Time!");
				break;

			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				System.out.println("");
				System.out.println("ONLOOKERS: Nice Roll!");
				break;


    	}
    }

}