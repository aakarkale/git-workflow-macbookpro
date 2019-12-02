import java.util.Arrays;
import java.util.Scanner;

public class ArraySuperClass
{


    public void displayArray()
    {
        Scanner arraylen = new Scanner(System.in);
        System.out.println("Enter the Length of Array you want: ");
        int len = arraylen.nextInt();

        System.out.println("Enter the values you want to input in your Array : ");
        int arr1[] = new int[len];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<len;i++)
        {
            int x = sc.nextInt();
            arr1[i] = x;
        }

        System.out.println("Array: "+ Arrays.toString(arr1));
    }

}