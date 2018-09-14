import java.util.Random;
import java.util.Scanner;

public class Important
{
   public static void main(String[] args)
   {

      int count = 0;

      Scanner keyboard = new Scanner(System.in);
      Random randomNumber = new Random();

      int number = randomNumber.nextInt(1000) + 1;
      int guess;
      do
      {
         System.out.println("Guess a number between 1-1000");
         guess = keyboard.nextInt();

         if (guess > number)
         {
            System.out.println("too high");
            count++;

         }
         if (guess < number)
         {
            System.out.println("too low");
            count++;
         }
         if (guess == number)
         {
            System.out.println("correct! you guessed: " + count + " times");
         }
         if (count == 10)
         {
            System.out.println("No more guesses");
            break;
         }
      }
      while (number != guess);
   }

}

}
