import java.util.Scanner;

class SubClass extends SuperClass
{
    int num = 10;

    // display method of sub class
    public void display()
    {
        System.out.println("This is the display method of Subclass\n");
    }

    public void my_method()
    {
        // Instantiating subclass
        SubClass sub = new SubClass();

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in SubClass: "+ sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in SuperClass: "+ super.num);
    }





    public void multiplication(int x, int y)
    {
        z = x * y;    /* Here, as you can see we haven't initialized the variable "z" but it's already
                         initialized because we have inherited it from the SuperClass  */

        System.out.println("\nThe product of the given numbers: "+z);
    }


    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("\nDemonstrating SuperClass & SubClass Relationship by displaying the following: \n");

        SubClass obj = new SubClass();
        obj.my_method();




        System.out.println("\nEnter the two Numbers tha you want to Add/Subtract/Multiply: ");
        int a = input.nextInt();
        int b = input.nextInt();

        SuperClass objSuper = new SuperClass(); /* As you can see here we created an Object of the SuperClass named "objSuper" to
                                              access the methods created in the class */

        SubClass objSub = new SubClass(); /* Same as above, here we created object of the SubClass named "objSub" to
                                           access the methods of the SubClass. */
        objSuper.addition(a, b);
        objSuper.Subtraction(a, b);
        objSub.multiplication(a, b);

        System.out.println("\nEnter the GPA in the 4 Subjects that you took this Semester : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        double g = input.nextDouble();
        objSuper.myGPA(x,y,z,g);
    }
}