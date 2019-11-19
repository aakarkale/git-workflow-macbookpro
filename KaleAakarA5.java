import java.lang.Math;
public class KaleAakarA5
{
    private double side1;
    private double side2;
    private double side3;

    KaleAakarA5(double s1, double s2, double s3)
    {
        side1=s1;
        side2=s2;
        side3=s3;
    }

    public boolean checkLength()               // check the validity of sides
    {
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2)
            return true;
        else
            return false;
    }

    public int checkType()
    {                     // check the triangle type
        if(side1==side2 && side2==side3)
            return 1;
        else if(side1==side2 || side2==side3 || side1==side3)
            return 2;
        else if(side1!=side2 && side2!=side1 && side1!=side3)
            return 3;
        else
        return 0;
    }
    double getPerimeter(){                      // calculating perimeter
        return side1+side2+side3;

    }
    double getArea(){                           // calculating area
        double s=(side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    public void print()
    {                        // printing the results
        boolean check=checkLength();
        if(check)
        {   String Ttype=null;
            int type= checkType();
            if(type==1)
                Ttype=" Equilateral Triangle";
            else if(type==2)
                Ttype=" Isosceles Triangle";
            else if(type==3)
                Ttype=" Scalene Triangle";
            System.out.println("("+ side1+","+side2+","+side3+ ")"+"is an"+ Ttype);

            double perimeter= getPerimeter();
            System.out.println("The Perimeter is "+ perimeter);
            double area1 = getArea();
            System.out.println("The Area is "+ area1);
            System.out.println();
        }
        else
            System.out.println("("+side1+","+side2+","+side3+")"+" these sides cannot form a Triangle\n");
    }
    public static void main(String args[])
    {
        KaleAakarA5 obj1= new KaleAakarA5(3.2,2.2,9.2);
        KaleAakarA5 obj2= new KaleAakarA5(8,5.1,8);
        KaleAakarA5 obj3= new KaleAakarA5(3,3,3);
        KaleAakarA5 obj4= new KaleAakarA5(7,8,11);

        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();
        System.out.println("Program Completed");
    }
}