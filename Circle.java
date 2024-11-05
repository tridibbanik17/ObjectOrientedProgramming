  package assignment01q2_package;
import java.util.Scanner; //import the Scanner class to get the user input.


public class Circle{
    public static void main(String[] args) {
        //Enter the radius of the circle and press Enter.
        System.out.println("Enter the radius value of the circle");


        //Get the user input.
        Scanner objectRadius = new Scanner(System.in);


        //Convert the input to 'Double' data type.
        Double radius = objectRadius.nextDouble();


        /* If the radius value is equal to or below 0 or radius value is above 10,
        the user will be asked to enter a valid input. */
        if (radius <= 0 || radius > 10) {
        System.out.println("Please enter a value between 0 and 10 (excluding 0 and including 10).");


        /* If the input value is between 0 and 10 excluding the value 0, the input is valid.
        Therefore, the calculated output of area and perimeter will be shown. */
    } else  {


        //Get the value of pi using the Java Math class.
        Double area = Math.PI*radius*radius;
       
        //Round down the input value of radius to two decimal places using the Math class.
        area = Math.round(area*100.0) / 100.0;


        //Get the value of pi using the Java Math class.
        Double perimeter = 2*Math.PI*radius;


        //Round down the input value of radius to two decimal places using the Math class.
        perimeter = Math.round(perimeter*100.0) / 100.0;


        //Print out the calculated values of the area and the perimeter of the circle.
        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);
    }
       
    }
}
