/* There are 3 types of Loops in Java:-

1. While
2. Do....While
3. For

In this Java file we will practice each one of them individually and thoroughly.
 */

public class Loops
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Here are a few programs which display variations of STAR Pattern using Java");
        System.out.println();

        //This loop is for the rows.
        for(int i=1; i<= 5; i++)
        {
            //This loop is for columns.
            for(int j=1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();


        for(int i=1; i<= 5; i++)
        {
            //This loop is for columns and always remember that when the control comes here it re-initializes j to 5.
            for(int j=5; j>= i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();


        for(int i=1; i<= 5; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<= 5; i++)
        {
            for(int j=5; j>= i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        for(int i=1; i<= 5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();


        for(int i=1; i<= 5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("*");
            }

            System.out.println();

            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        for(int i=1; i<= 5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        for(int i=1; i<= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<= 5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=4; k>=i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        for(int i=1; i<= 5; i++)
        {
            for (int j = 5; j >=i; j--) //For Spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) //For Stars in 1st right-angled triangle
            {
                System.out.print("*");
            }
            for(int l=2; l<=i; l++)  //For Stars in 2nd right-angled triangle
            {
                System.out.print("*");
            }
            System.out.println();
        }





        System.out.println();
        System.out.println("----------------------------");
        System.out.println();



    }
}