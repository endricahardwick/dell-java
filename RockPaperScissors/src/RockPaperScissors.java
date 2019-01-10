
import java.util.Scanner;
import java.util.Random; 

public class RockPaperScissors {

	public static void main(String[] args) {
		
		//User's play -- "R", "P", or "S" 
		String personPlay; 
		
		//Computer's play -- "R", "P", or "S"
	    String computerPlay = "";  
	    
	    //Randomly generated number used to determine computer's play 
	    int computerInt; 
	    
	    Scanner reader = new Scanner(System.in); 
	    Random randNumGenerator = new Random(); 
	    
	    System.out.println("Hello, let's play Rock, Paper, Scissors!\n" + 
	                       "Please enter a move.\n" + "Rock = R, Paper= P, and Scissors = S.");
	    
	    System.out.println();
	    
	    //Generate computer's play (0,1,2) 
	    computerInt = randNumGenerator.nextInt(3)+1; 
	    
	    //Translate computer's randomly generated play to string
	    if (computerInt == 1) 
	        computerPlay = "R"; 
	     else if (computerInt == 2) 
	        computerPlay = "P"; 
	     else if (computerInt == 3) 
	        computerPlay = "S"; 
	    
	     //Get player's play from input
	     System.out.println("Enter your play: "); 
	     personPlay = reader.next();
	     
	     //Make player's play uppercase 
	     personPlay = personPlay.toUpperCase(); 
	     reader.close();
	     
		 writePersonPlay(personPlay);
		 writeComputerPlay(computerPlay);
		 checkForWin(personPlay, computerPlay);

	}
	
	 public static void writePersonPlay(String personPlay) {
		 
		 //Print Player's play
		 System.out.println("Your play is: " + personPlay);
	    }
	 
	 public static void writeComputerPlay(String computerPlay) {
	     
	     //Print computer's play 
	     System.out.println("Computer play is: " + computerPlay); 

	    }
	 
	 public static void checkForWin(String personPlay, String computerPlay) {
		 
	     //See who won
	     if (personPlay.equals(computerPlay)) 
	        System.out.println("It's a tie!"); 
	     else if ((personPlay.equals("R")) && (computerPlay.equals("S")))
	           System.out.println("Rock crushes scissors. You win!!");
	     else if ((personPlay.equals("R")) && (computerPlay.equals("P")))
	             System.out.println("Paper eats rock. You lose!!"); 
	     else if ((personPlay.equals("P")) && (computerPlay.equals("S")))
	        System.out.println("Scissor cuts paper. You lose!!"); 
	     else if ((personPlay.equals("P")) && (computerPlay.equals("R")))
	             System.out.println("Paper eats rock. You win!!"); 
	     else if ((personPlay.equals("S")) && (computerPlay.equals("P")))
	          System.out.println("Scissor cuts paper. You win!!"); 
	     else if ((personPlay.equals("S")) && (computerPlay.equals("R"))) 
	             System.out.println("Rock breaks scissors. You lose!!"); 
	     else 
	          System.out.println("Invalid user input."); 
		 
	 }
	 

}
