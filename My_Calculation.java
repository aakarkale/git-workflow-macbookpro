/*
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
With the use of inheritance the information is made manageable in a hierarchical order.
*/

//https://www.tutorialspoint.com/java/images/types_of_inheritance.jpg
// This is the most basic Inheritance code which has the SuperClass and the SubClass in the same file.

class Calculation
{
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("\nThe sum of the given numbers: "+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("\nThe difference between the given numbers: "+z);
    }
}




public class My_Calculation extends Calculation
{
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("\nThe product of the given numbers: "+z);
    }

    public static void main(String args[])
    {
        // Here we are manually inputting the variable values.
        int a = 20, b = 10;

        My_Calculation demo = new My_Calculation();

        /* As you can see here you don't need to create an Object "demo" of the SuperClass "Calculation"
           as the superclass is in the same java file as the SubClass
         */
        System.out.println();

        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
        System.out.println();
    }
}