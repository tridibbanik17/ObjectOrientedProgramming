
/*Author: Tridib Banik, Student Number: 400514461, MacID: banikt 
 *This program matches the number that the user entered with a randomly generated number.
  User needs to guess the number within 10 attempts to be successful.
 */

package assignment03q4_package;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame
{
    //The randomly generated number or the maximum number of attempts cannot be modified by the user.
	private int randomNumber;
	private int maximumAttempts = 10;

	//Constructor method
	public GuessNumberGame()
	{
		this.randomNumber = randomNumberGenerator();
	}

	//randomNumberGenerator() generates an integer number between 0 and 100.
	private int randomNumberGenerator()
	{
		Random randomNumberObject = new Random();
		int random = randomNumberObject.nextInt(101);
		return random;
	}

    //numberMatch() method finds out if the user input and randomly generated number match.
	public void numberMatch()
	{
		//try-catch block to catch invalid user input type.
        try
		{
			System.out.println("Enter a number between 0 and 100 and press enter.");
            //Create and declare a new Scanner object.
			Scanner userInputObject = new Scanner(System.in);
            //Initialize numberOfAttempts.
			int numberOfAttempts = 0;
            //While loop to run a maximum of 10 times.
			while ((numberOfAttempts < maximumAttempts))
			{
                //Read the user input as an integer value and store it to userInput.				
                int userInput = userInputObject.nextInt();
                
				if (userInput > randomNumber)
				{
					System.out.println("The number is lower than " + userInput + ".");
				}

				else if (userInput < randomNumber)
				{
					System.out.println("The number is higher than " + userInput + ".");
				}

                //If userInput is equal to randomNumber, the loop terminates.
				else 
				{
					System.out.println("You successfully guessed the number!");
					break;
				}

                //increment of numberOfAttempts by 1.
				numberOfAttempts += 1;
				
                //If maximum number of attempts is completed, an appropriate message is printed.
				if (numberOfAttempts == 10)
				{
					System.out.println("You have exhausted your trials.");
				}
			}
		}
	
		catch (InputMismatchException e)
		{
			System.out.println("Error: You didn't enter an integer.");
		}
	}

	public static void main(String[] args)
	{
        //Create a new instance of GuessNumberGame class.
		GuessNumberGame newClassObject = new GuessNumberGame();
        //Call numberMatch() method.
		newClassObject.numberMatch();
	}
	
}