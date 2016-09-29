// Simple grader program
// September 2nd, 2015
// Author: Alicia McNett

import static java.lang.Math.*;

public class Grader 
{
  public static void main(String[] args)
  {
    int grade1 = 79;
    int grade2 = 80;
    int grade3 = 80;
    double average = (grade1 + grade2 + grade3) / 3.0;
    int roundedAverage = (int)round(average);
    System.out.println("The average is " + roundedAverage);

    if (roundedAverage < 60)
      System.out.println("sorry, F");
    else if (roundedAverage < 70)
      System.out.println("sorry, D");
    else if (roundedAverage < 80)
      System.out.println("looking better, C");
    else if (roundedAverage < 90)
      System.out.println("not bad, B");
    else
      System.out.println("Exellent, A");
  }
}
