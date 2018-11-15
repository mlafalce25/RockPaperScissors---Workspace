/**
 * 
 * @author Matthew LaFalce
 *This class is used to create different players for the rockPaperScissors game, and hold their information.
 */
public class Player {
	
	private String name;
	private int choice;
	private int win;
	private int loss;
	
	/**
	 * This method will return the name of the specified player when called.
	 * @return name of the player
	 */
	public String getName(){
		
		return name;
	}
	
	/**
	 * This method will set the name of a specified player to the name that they provided in the input method.
	 * @param names is the input provided by the user
	 */
	public void setName(String names){
		
		name = names;
	}
	
	/**
	 * This method will return the number of games that the given player has won.
	 * @return the value that is stored in 'win'; the amount of games won. 
	 */
	public int getWin(){
		
		return win;
	}
	
	/**
	 * This method will return the number of games that the given player has lost.
	 * @return the value that is stored in 'loss'; the amount of games lost
	 */
	public int getLoss(){
		
		return loss;
	}
	
	/**
	 * This method will allow the number of wins that a player has to be changed as directed
	 * @param wins the new value that will be stored in 'win'.
	 */
	public void setWin(int wins){
		
		win=wins;
	}
	/**
	 * This method will allow the number of losses that a player has to be changed as directed
	 * @param losses the new value that will be stored in 'loss'.
	 */
	public void setLoss(int losses){
		
		loss=losses;
	}
	
	/**
	 * This method stores the choice that the player picked, either Rock, Paper, or Scissors as ints, 1,2,3.
	 * @param pick the value that the player chose to be his move in the game.
	 */
	public void choose(int pick){
		
		choice = pick;
	}
	
	/**
	 * This method will return the choice that player had chosen when called.
	 * @return the choice that the player picked
	 */
	public int getChoice(){
		
		return choice;
	}
}
