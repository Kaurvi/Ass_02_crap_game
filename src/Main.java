import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        Random rnd = new Random ();
        boolean play = true;
        String playAgain= "Y/N";
        while (play)
        {
           int die1 = rnd.nextInt ( 6 ) + 1;
           int die2 = rnd.nextInt ( 6 ) + 1;
            int sum = die1 + die2;
            int point = 0;
            System.out.println ( "Roll:       Die1 Die2 Sum" );
            System.out.println ( "-------------------------" );
            System.out.printf ( "Roll: %d +%d = %d\n", die1, die2, sum );
            if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println ( " Its Craps ! , game is over with a loose" );
                play = false;
            } else if (sum == 7 || sum == 11)
            {
                System.out.println ( "its a natural, game is over with a win" );
                play = false;
            } else
            {
                point = sum;
                while (play) {die1 = rnd.nextInt ( 6 ) + 1;
                    die2 = rnd.nextInt ( 6 ) + 1;
                    sum = die1 + die2;
                    System.out.println ("Let's roll dies again!");
                    System.out.printf ( "Rolls: %d +%d = %d\n", die1, die2, sum );
                    if (sum == point)
                    {
                        System.out.println ( "You made your point. U Win" );
                        play = false;
                        break;
                    }
                    else if (sum == 7) {System.out.println ( "You got 7!. You lost!" );
                        play = false;
                        break;
                    }
                }
            }
            System.out.println ( "Do u want to play again?" );
            playAgain = in.nextLine ();
            if (playAgain.equalsIgnoreCase ( "y" ))
                play = true;
            else {
                playAgain.equalsIgnoreCase ( "n" );
                play = false;
            }
        }
    }
}