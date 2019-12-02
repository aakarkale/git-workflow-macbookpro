/*
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
With the use of inheritance the information is made manageable in a hierarchical order.

So Basically a SubClass inherits everything except for the Constructor.
 */

class SuperClass
{
    int z;
    private double l;
    int num = 20;

    // display method of superclass
    public void display()
    {
        System.out.println("This is the display method of SuperClass\n");
    }

    void addition(int x, int y)
    {
        z = x + y;
        System.out.println("\nThe sum of the given numbers: "+z);
    }

    void Subtraction(int x, int y)
    {
        z = x - y;
        System.out.println("\nThe difference between the given numbers: "+z);
    }

    void myGPA(double x, double y, double z, double g)
    {
        l = (x+y+z+g)/4;
        System.out.println("\nYour GPA for this Semester is: "+l);
    }
}