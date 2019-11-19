import java.util.Arrays;
import java.util.Scanner;

public class KaleAakarA2
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of elements for first array");
        int na=input.nextInt();

        //declaring first array
        int a[]=new int[na];

        System.out.println("Enter the number of elements for second array");
        int nb=input.nextInt();

        //declaring second array
        int b[]=new int[nb];

        System.out.println("Enter the values in first array");
        for(int i=0;i<=na;i++)
        {
            //System.out.println("Element at index: "+i);
            a[i]=input.nextInt();
        }

        System.out.println("Enter the values in second array");
        //entering the inputs in second array
        for(int i=0;i<=nb;i++)
        {
            b[i]=input.nextInt();
        }

        System.out.println("Array_1: "+ Arrays.toString(a));

        System.out.println("Array_2: "+ Arrays.toString(b));

        //System.out.println("Length of array "+ a.length);

        KaleAakarA2 obj=new KaleAakarA2();

        if(a.length==b.length)
        {
            System.out.println("\nLength is Equal");
            if( obj.isIdentical(a,b))
            {
                System.out.println("\nBoth Arrays are Same");
                System.out.println("\nProgram Completed");
            }
            else
            {
                System.out.println("\nArrays are Not same");
                //calling method to calculate sum
                obj.sum(a,b);
            }

        }
        else
        {
            System.out.println("\nLength is NOT Equal");
            obj.sum(a,b);

        }
    }

    public boolean isIdentical(int a[], int b[])
    {
        for(int i=0;i<a.length;i++)
        {

            if(a[i]!=b[i])
            {
                System.out.println("\nElements of the array are not identical");
                return false;
            }

        }
        return true;
    }

    public void sum(int a[],int b[])
    {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];

        }
        System.out.println("\nSum Of Array_1: "+sum1);
        for(int i=0;i<b.length;i++)
        {
            sum2=sum2+b[i];
        }
        System.out.println("Sum Of Array_2: "+sum2);
        if(sum1==sum2)
        {
            //this means sum is equal
            System.out.println("\nSum is equal");

        }
        else if(sum2>sum1)
        {
            //this means sum of array 2 is greater
            System.out.println("\nArray_2 is Greater");
        }
        else
        {
            //this means sum of array 1 is greater
            System.out.println("\nArray_1 is Greater");
        }
        System.out.println("\nProgram Completed");
    }
}