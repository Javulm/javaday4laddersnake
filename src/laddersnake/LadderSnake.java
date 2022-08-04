package laddersnake;

import java.util.Random;

class gamePlayer {
	
	Random rand = new Random();
	
    int currentPosition = 0;
    
    final int noPlay = 0, ladder = 1, snake = 2;
    
    int endGame = 0;
    
    int attempts = 0;
    
    public void gameStart(String playerName) {
    	
        while (endGame <= 100) {
        	
            int rollDie = rand.nextInt(6) + 1;
            
            System.out.println("rollDie is :" + rollDie);
            
            int gameCheck = rand.nextInt(3);
            
            System.out.println("game Check is " + gameCheck);

            if (gameCheck == noPlay) {
            	
                currentPosition = currentPosition;
                
                System.out.println("This is no play.");
                
                System.out.println(playerName + "'s current position is : " + currentPosition);
                
                attempts++;
                
            } else if (gameCheck == ladder) {
            	
                currentPosition = currentPosition + rollDie;
                
                System.out.println("You got promoted by " + rollDie);
                
                System.out.println(playerName + "'s current position is : " + currentPosition);
                
                attempts++;
                
            } else {
            	
                if (currentPosition < rollDie) {
                	
                    currentPosition = 0;
                    
                    System.out.println("You got snake of " + rollDie + " star again from zero.");
                    
                    System.out.println(playerName + "'s current position is : " + currentPosition);
                    
                } else {
                	
                    currentPosition = currentPosition - rollDie;
                    
                    System.out.println("you got snake of " + rollDie);
                    
                    System.out.println(playerName + "'s current position is : " + currentPosition);
                }
                
                attempts++;
                
            }
            endGame = currentPosition;
        }

    }
}
public class LadderSnake {
	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder games");
		gamePlayer play1 = new laddersnake.gamePlayer();
		 play1.gameStart("Player 1");
	        
	        System.out.println("Congratulation Player1 completed the game in " + play1.attempts + " attempts.");
	}
}
