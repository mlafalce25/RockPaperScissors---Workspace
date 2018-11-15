/*/********************************************************************************************************
 * @author Matthew LaFalce
 * ********************************************************************************************************
 * ********************	Algorithm**************************************************************************
 * Prompt the user to enter player 1's name.
 * Read the input.
 * Store name to player1
 * Prompt the user to enter player 2's name.
 * Read the input.
 * Store name to player2
 * Prompt the user that the game is starting.
 * Start the game.
 * Prompt Player 1 to enter their choice of Rock, Paper, or Scissors.
 * Read the input.
 * Prompt Player 2 to enter their choice of Rock, Paper, or Scissors.
 * Read the input.
 * Figure out the winner.
 * Prompt the user with the winner.
 * increase win counter for the winner.
 * increase the loss counter for the loser.
 * calculate each players' win/loss ratio.
 * Display the players' win/loss ratios.
 **********************************************************************************************************
 **************************Algorithm to Determine the Winner***********************************************
 *First test to see if the users entered the same input, if so print out it is a tie
 *then set a switch case, one for when player 1 chooses rock, one for scissors, and one for paper
 *for each case test the first condition, if true print out the winner, if not print out the other player
 *break when a condition is met
 **************************UML Diagrams********************************************************************
 *Game                                             |*Player                      |*GamePlayer
 *_________________________________________________|_____________________________|_________________________
 *-s(static):Scanner                               |-name:String                 |
 *+player1:Player                                  |-choice:String               | 
 *+player2:Player                                  |-loss:int                    |
 *+x:int                                           |-win:int                     |
 *+w:int                                           |                             |
 *+ROCK:final static int                           |                             |
 *+SCISSOR:final static int                        |                             |
 *+PAPER:final static int                          |                             |
 *+name:String                                     |                             |
 *_________________________________________________|_____________________________|_________________________
 *+StartGame():void                                |+getName():String            |*main-creates a game
 *+StartGame2():void                               |+getChoice():int             |
 *+input():void                                    |+getWin():int                |
 *+choose():void                                   |+setWin(amount:int):void     |
 *+judge(y,z:int):void                             |+getLoss():int               |
 *+winner(y:int):void                              |+setLoss(amount:int):void    |
 *+counter:void                                    |+chose(pick:int):void        |
 ***********************************************************************************************************/
public class GamePlayer {
	
	public static void main(String[] args) {
		Game rockPaperScissors = new Game();
		rockPaperScissors.StartGame();
		
		//calculate each players' win/loss ratio.
		//Display the players' win/loss ratios.
		
	}

}
 