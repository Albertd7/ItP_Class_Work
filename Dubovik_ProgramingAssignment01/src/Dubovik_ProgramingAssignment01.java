import java.util.Scanner;

/** Created by Albert Dubovik on 9/6/2016.
 */
public class Dubovik_ProgramingAssignment01
{
    public static void main(String[] args)
    {

        //PART I. TEMPERATURE CONVERSION

        // 1. declare any constants

        final int freezing = 32;

        // 2. declare temperature in Fahrenheit as an int

        int tempF = 81;

        //3. calculate equivalent Celsius temperature

        double tempC = ((5.0/9)*(tempF-freezing));

        //4. output the temperature in Celsius

        System.out.println(tempC);

        // 5. convert Celsius temperature back to Fahrenheit


        tempF = (int)(tempC * (9.0/5) + freezing);

        // 6. output Fahrenheit temperature to check correctness

        System.out.println(tempF);

        //PART II. COFFEE CONSUMPTION

        double coffDrinkers = 17000*.62;
        System.out.println("# of customers drinking 1 or more coffee's per week: "+ coffDrinkers);

        double mocha = coffDrinkers*.38;
        System.out.printf("# of customers who prefer Mocha-flavored coffee drinks: %.1f\n", mocha);

        //Part III.

        System.out.println("   /\\      /\\ ");
        System.out.println("  //\\\\    //\\\\");
        System.out.println(" //__\\\\  //_//");
        System.out.println("//    \\\\/___/");

    }
}