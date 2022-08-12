package snakeandladderproblem;

import java.util.Random;

class gamePlayer {
	Random rand = new Random();
    int endGame = 0, attempts = 0, currentPosition = 0;
    final int noPlay = 0, ladder = 1, snake = 2;
    public void gameStart(String playerName) {
            int rollDie = rand.nextInt(6) + 1;
            System.out.println("rollDie is :" + rollDie);
            int gameCheck = rand.nextInt(3);
            System.out.println("game Check is " + gameCheck);
            if (gameCheck == noPlay) {
                System.out.println("This is no play."); 
                System.out.println(playerName + "'s current position is : " + currentPosition);
                attempts++;
                endGame = currentPosition; 
            } else if (gameCheck == ladder) {	
                currentPosition = currentPosition + rollDie;
                System.out.println("You got promoted by " + rollDie);
                System.out.println(playerName + "'s current position is : " + currentPosition);        
                attempts++;
                endGame = currentPosition;                
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
                endGame = currentPosition;
        }
    }    
    public class LadderSnake{
	public static void main(String[] args) {	
		System.out.println("welcome to snake and ladder games");		
		gamePlayer play1 = new gamePlayer();		
		snakeandladderproblem.gamePlayer play2 = new gamePlayer();		 
        while (play1.endGame <= 100 && play2.endGame <= 100) {        	
            play1.gameStart("Player1");            
            play2.gameStart("Player2");           
        }        
        if (play1.endGame > play2.endGame) {        	
            System.out.println("Congratulation player1 you have won the game.");            
        } else if (play1.endGame < play2.endGame) {        	
            System.out.println("Congratulation player2 you have won the game.");     
        } else { 	
            System.out.println("match draw");      
        }
    }
}
}