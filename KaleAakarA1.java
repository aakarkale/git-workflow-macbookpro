
public class KaleAakarA1
{
    static int Subtract(int x, int y)
    {
        return x-y;
    }

    static int Add(int x, int y)
    {
        return x+y;
    }

    static int Multiply(int x, int y)
    {
        return x*y;
    }

    public static void main(String args[])
    {
        //dec
        int a = 10;
        int b = 5;
        int c;
        int d;
        int e;

        //method calls
        c= Subtract(a,b);
        d= Add(a,b);
        e= Multiply(a,b);

        //print op
        System.out.println("The value of a is : " +a);
        System.out.println("The value of b is : " +b);
        System.out.println("The value of c is : " +c);
        System.out.println("The value of d is : " +d);
        System.out.println("The value of e is : " +e);

    }

}