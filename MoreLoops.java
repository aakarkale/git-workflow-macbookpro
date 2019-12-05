import java.util.Scanner;

public class MoreLoops
{
    public static void main(String[] args)
    {
        int x=1;
        int y=12;

        while(x<=20)
        {
            System.out.println("Hi There: " +x);
            x++;
        }

        System.out.println();
        System.out.println("Trying Do...While Loops:- ");
        System.out.println();


        do
            {
                System.out.println("WhatUp: "+y);
                y++;
            }
            while (y<20);


        System.out.println();
        System.out.println("For...Each Loop in Java:- ");
        System.out.println();


        /*
        Here is the Syntax:-

        for(data_type item : collection)
        {
        ............
        }
         */

        int arr[] = {1,2,3,4,5,6,7};

        for(int item: arr)
        {
            System.out.println(item);
        }

        System.out.println("Trying the same with a String DataType");
        String fam[] = {"Aakar","Manasvi","Arun","Manisha"};

        for(String item: fam)
        {
            System.out.println(item);
        }


        System.out.println();
        System.out.println();
        System.out.println("The Switch Case:- ");
        System.out.println();

        /*  SWITCH Statements
        Here is the Syntax:-

        switch (variable/expression)
        {
        case value1:
           // statements
           break;
        case value2:
           // statements
           break;
           .. .. ...
           .. .. ...
        default:
           // statements
        }


         */

        Scanner input = new Scanner(System.in);

        System.out.print("Input the Day Number from 1 to 7: ");
        int dayoftheweek = input.nextInt();

        String day;

        switch (dayoftheweek)
        {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "an Invalid Entry";
                break;
        }
        System.out.println("It\'s "+day);
        System.out.println();

    }
}