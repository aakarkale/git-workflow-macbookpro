import java.util.Objects;

public class NumCharString
{
    // This code sample will explain how to use Number, Character & String

    public static void main(String[] args)
    {
        //Numbers

        int i =20;
        int j =12;
        double percentile = 89.4;
        float gpa = 3.89f;

        System.out.println(Objects.equals(i, j));
        String lmn = Objects.toString(i);
        System.out.println("If this prints......");
        System.out.println(lmn);


        //Character
        char ch ='a';
        char [] charArray = {'a','b','c','d','e'};


       // Strings
        String greet = "Good Morning";
        String myName = " Aakar";
        String[] stringArray = {"Aakar","Arun","Kale"};

        System.out.println(greet.length());
        System.out.println(greet.concat(myName));
        System.out.println(greet.toUpperCase());
        System.out.println(greet.endsWith("g"));
        System.out.println(greet.replace("Good","Very Good"));
        System.out.println(greet.indexOf("M"));
        System.out.println(greet.regionMatches(false,0,"Good",0,4));

    }

}
