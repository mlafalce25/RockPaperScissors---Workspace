import java.util.Scanner;

/**
 * This class creates the game rockPaperScissors.
 * @author Matthew
 *
 */
public class Game {
		final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
		private static Scanner s;
		String name;
		Player player1 = new Player();
		Player player2 = new Player();
		int x=0;
		int w;
		
		/**
		 * This method is essentially the main method of the game, it calls different methods that are called in a sequential order in effort to create the game rockPaperScissors.
		 */
		public void StartGame() {
			input();
			choose();
			judge(player1.getChoice(),player2.getChoice());	
			ratios();
			StartGame2();
		}
		
		/**
		 * This method becomes the main after the first round of the game is played. It functions the same as StartGame(), but it eliminates the need for the user to have to re-enter their name at the beginning of each round.
		 */
		public void StartGame2(){
			choose();
			judge(player1.getChoice(),player2.getChoice());	
			ratios();
			StartGame2();
		}
		 /**
		  * This method prompts both of the players to enders their name, then stores it to their player classes.
		  */
		public void input(){
			s = new Scanner(System.in); 
			
			//Prompt the user to enter player 1's name.
			System.out.println("Player 1 Please Enter Your Name: ");
			
			//Read the input.
			name = s.next();
			
			//Store name to player1
			player1.setName(name);
			
			//Prompt the user to enter player 2's name.
			System.out.println("Player 2 Please Enter Your Name: ");
			
			//Read the input.
			name = s.next();
			
			//Store name to player2
			player2.setName(name);
		}
		
		/**
		 * This method prompts the user with their game options, then stores each player's choice to their player class.
		 */
		public void choose(){		
			System.out.println("Choose (1) - Rock, (2) - Scissors, or (3) - Paper: "); 
			x = s.nextInt(); 
			player1.choose(x);
			
			System.out.println("Choose (1) - Rock, (2) - Scissors, or (3) - Paper: "); 
			x = s.nextInt(); 
			player2.choose(x);
		}		
		
		/**
		 * This method brings in the two choices that the players had picked and uses a switch case to decide who the winner is.
		 * @param y This is the choice that player 1 chose.
		 * @param z This is the choice that player 2 chose.
		 */
		public void judge(int y, int z){
			if (y == z){		
				System.out.print("It is a tie ");
				w=100;
            } 
			else {				
	            switch (y){
	            case ROCK:
	                if (z == SCISSOR){ w = y; break;}
	                else{  	w = z; break;}
	                
	            case SCISSOR:
	                if (z == PAPER){w = y; break;}
	                else{w = z; break;}
	                
	            case PAPER:
	                if (z == ROCK){w = y; break;}
	                else{w = z; break;}	                
	            }
			}
			winner(w);
		}
		
		/**
		 * This method tells the players which one had won the game.
		 * @param y This is the int passed from the judge class that is either a 1 or a 2. if it is 1, than player1 won, if it is 2, player2 won.
		 */
		public void winner(int y){
			if(w == 100){return;}
			else if(y == player1.getChoice()){
				
				System.out.println(player1.getName()+ " Wins!");
				counter(1);
			}
			
			else{
				
				System.out.println(player2.getName()+" Wins!");
				counter(2);
			}
		}
		
		/**
		 * This method bumps up the winners win counter and the losers loss counter.
		 * @param winner If winner = 1 than player1 had won the game and will adjust the counters to that out come, if not, the counters are adjusted as if he lost.
		 */
		public void counter(int winner){
			
			if(winner == 1){
				player1.setWin(player1.getWin()+1);
				player2.setLoss(player2.getLoss()+1);
 			}
			
			else{
				player2.setWin(player2.getWin()+1);
				player1.setLoss(player1.getLoss()+1);
			}
		}
		
		/**
		 * This method determines the win/loss ratio for both of the players and presents it to the players.
		 */
		public void ratios(){
			System.out.println(player1.getName()+"'s Win/Loss Ratio is "+player1.getWin()+":"+player1.getLoss());
			System.out.println(player2.getName()+" 's Win/Loss Ratio is "+player2.getWin()+":"+player2.getLoss());
		}
}


		