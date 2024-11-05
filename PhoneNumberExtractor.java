
/*Author: Tridib Banik, Student Number: 400514461, MacID: banikt 
 *This program displays the telephone number with any alphabetic characters that appeared in the original 
  translated to their numeric equivalent.
 */

package assignment03q2_package;

import java.util.Scanner;

public class PhoneNumberExtractor
{
	private String userInput;
	private String userOutput;

	//Constructor method
    public PhoneNumberExtractor(String userInput) 
	{
		//Refer to the instance variable belonging to the object of the PhoneNumberExtractor class.
	    this.userInput = userInput;
        this.userOutput = "";
    }

	//letterToNumber() method converts any alphabetic character to their numeric equivalent.
	private char letterToNumber(char letter)
	{
		//Converts any lowercase alphabetic character to uppercase to avoid case-sensitivity.
		char upperCaseLetter = Character.toUpperCase(letter);

		//A, B, and C = 2
		if (upperCaseLetter == 'A' || upperCaseLetter == 'B' || upperCaseLetter == 'C')
		{
			char number = '2';
			return number;
		}

		//D, E, and F = 3
		else if (upperCaseLetter == 'D' || upperCaseLetter == 'E' || upperCaseLetter == 'F')
		{
			char number = '3';
			return number;
		}

		//G, H, and I = 4
		else if (upperCaseLetter == 'G' || upperCaseLetter == 'H' || upperCaseLetter == 'I')
		{
			char number = '4';
			return number;
		}

		//J, K, and L = 5
		else if (upperCaseLetter == 'J' || upperCaseLetter == 'K' || upperCaseLetter == 'L')
		{
			char number = '5';
			return number;
		}

		//M, N, and O = 6
		else if (upperCaseLetter == 'M' || upperCaseLetter == 'N' || upperCaseLetter == 'O')
		{
			char number = '6';
			return number;
		}

		//P, Q, R, and S = 7
		else if (upperCaseLetter == 'P' || upperCaseLetter == 'Q' || upperCaseLetter == 'R' || upperCaseLetter == 'S')
		{
			char number = '7';
			return number;
		}

		//T, U, and V = 8
		else if (upperCaseLetter == 'T' || upperCaseLetter == 'U' || upperCaseLetter == 'V')
		{
			char number = '8';
			return number;
		}

		//W, X, Y, and Z = 9
		else if (upperCaseLetter == 'W' || upperCaseLetter == 'X' || upperCaseLetter == 'Y' || upperCaseLetter == 'Z')
		{
			char number = '9';
			return number;
		}

		//if a number is input, that same number is returned.
		else if ((letter == '0') || (letter == '1') || (letter == '2') || (letter == '3') || (letter == '4') || (letter == '5') || (letter == '6') || (letter == '7') || (letter == '8') || (letter == '9'))
		{
			return letter;
		}

		//if the input is non-alphanumeric, character '!' is returned to indicate that an invalid character is entered as an input.
		else 
		{
			char number = '!';
			return number;
		}
	}


    //Method to convert the phone number to their numeric equivalent.
    public String convertPhoneNumber() 
    {
        //Check if the userInput is 10-character-long or not.
        if (userInput.length() != 10) 
        {
            return "Please enter exactly 10 characters.";
        }

        //For loop to access each character of userInput.
        for (int i = 0; i < userInput.length(); i++) 
        {
            char numberChar = letterToNumber(userInput.charAt(i));

            //check if any character is invalid.
            if (numberChar == '!') 
            {
                return "Error: you entered non-alphanumeric character(s).";
            }
            userOutput += numberChar;
            if (i == 2 || i == 5) 
            {
                //Add hyphen after 3rd and 6th digits
                userOutput += "-"; 
            }
        }

        //Only return the converted phone number if 10 valid characters are entered.
        return "The phone number for " + userInput + " is " + userOutput + ".";
    }

	public static void main(String[] args)
	{
		System.out.println("Please enter a 10-character telephone number and press enter.");
		//Create and declare a new Scanner object.
		Scanner userInputObject = new Scanner(System.in);
		//Read the user input as a string value and store it to userInput.
		String userInput = userInputObject.nextLine();

        //Create a new instance of PhoneNumberExtractor class.
		PhoneNumberExtractor newExtractor = new PhoneNumberExtractor(userInput);
        //Calling convertPhoneNumber() method.
		String finalResult = newExtractor.convertPhoneNumber();
		System.out.println(finalResult); 

	}
}