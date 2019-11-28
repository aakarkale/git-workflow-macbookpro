import java.util.Scanner;

public class DecisionMaking
{
    public static void main(String[] args)
    {
        System.out.println("\nDecision Making in Java includes 3 things:\n" +
                "1. if Statement\n" +
                "2. if....else Statement\n" +
                "3. nested if Statements\n");

        int x =10;

        if(x<20)
        {
            System.out.println("Hi There\n");
        }

        /*
        As you can see the only difference between while and if statement
        is the fact that if statements execute only once.
        */

        // If.....Else Statements


        System.out.print("Enter the value of y: ");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();

        if(y>=1 && y<=5)
        {
            System.out.println("\nWelcome\n");
        }
        else
        {
            System.out.println("\nGoodbye, See you next time.\n");
        }

        // Also, practice "Nested If....Else" Statements thoroughly...
    }
}
