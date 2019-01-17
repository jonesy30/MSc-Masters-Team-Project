import java.util.Random;

/*
 * AI player randomly selecting category from 1 to 5
 * @author Ifigenia Temesio
 * @version 1
 * */

public class AIPlayer extends PlayerAbstract{
	private String choice = "";
	private Random r = new Random();
	
	// Random selection of 5 deck headers. 
	public String decideOnCategory() {
		
		int choiceNum = r.nextInt(5);
		choice = currentDeck.get(0).getHeaders()[choiceNum];
		
		return choice;
	}
}


