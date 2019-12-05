public class Test
{

    public static void main(String []args)
    {
        //This is the start of code execution

        /* Object creation-
        Here we are creating an object of the class Puppy named myPuppy*/

        Puppy myPuppy = new Puppy( "Monil" );

        /* Call class method to set puppy's age */
        myPuppy.setAge(2);

        /* Call another class method to get puppy's age */
        System.out.println("Puppy's Age is: " + myPuppy.getAge());

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
}