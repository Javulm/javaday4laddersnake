package laddersnake;

import java.util.Random;

class gamePlayer {
	
	Random rand = new Random();
	
    int currentPosition = 0;
    
    final int noPlay = 0, ladder = 1, snake = 2;
    
    int dieRoll = rand.nextInt(6)+1;
    
    int gameCheck = rand.nextInt(3);

}
public class LadderSnake {
	public static void main(String[] args) {
		System.out.println("welcome to snake and ladder games");
		
	}
}
