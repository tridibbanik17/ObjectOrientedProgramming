package assignment02q3_package;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Author: Tridib Banik, Student Number: 400514461, MacID: banikt 
 *This program prints a right-angle triangle corresponding to the user entered integer.
 */

public class RightAngleTriangle {
    //triangleGenerator() method takes userInput as an integer and returns a right-angle triangle corresponding to the value of userInput.
    private String triangleGenerator(int userInput)
    {
        //initialize newOutputForThree string.
        String userOutput = "";
        //For loop to catch every single integer within a range of 1 and user input.
        for (int i = 1; i <= userInput; i++)
        {
            //Nested for loop to catch every single integer within a range of 1 and i.
            for (int j = 1; j <= i; j++)
            {
                //Appnd all integers from 1 to i.
                userOutput += j;
            }
            //Go to a new line after each recursion.
            userOutput += "\n";
        }
        //Return the entire right-angle triangle as a string.
        return userOutput;
    }

    public static void main(String[] args) 
    {
        System.out.println("Input an integer and press enter.");

        //If the user doesn't input an integer, it gets caught and the user receives an appropriate error message.
        try 
        {
            //Create and declare a new Scanner object.
            Scanner userInputObject = new Scanner(System.in);
            //Store the user input in an integer n.
            Integer n = userInputObject.nextInt();
            //Check if the user input is between 1 and 200.
            if ((n >= 1) && (n <= 200))
            {
                //Create and declare a new RightAngleTriangle object instance.
                RightAngleTriangle userOutput = new RightAngleTriangle();
                //Call method triangleGenerator() and store the value in finalOutput string.
                String finalOutput = userOutput.triangleGenerator(n);
                System.out.println(finalOutput);
            }
            else
            {
                //If the user inputs anything outside the range of [0, 200], output this message.
                System.out.println("Input an integer between 1 and 200.");
            }
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Error: You did not enter an integer.");
        }
    }
}
