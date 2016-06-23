import javax.swing.*; 

public class Guess
{
public void opening_message()
{
     System.out.println("hello, this is the guessing game");
}
    
public void play_game()
{
       	Display Menu
       	If option is equal to play then
                 	Enter player name
                 	Generate random number
                                	Computer generates a number between 1 and 50       	
                  	While found equals false do
      	        	        	enter lucky guess from player
                   	        	if guess equals random number then
                               	        	set found to true
                   	        	else if guess is less than random number then
                	        	        	display a less than message
    	        	        	else
                 	        	        	display a more than message
                 	        	end if
     	        	end while
                	Display results
     	else
                	quit game
     	end if

}

public void closing_message()
{
    
}
}
