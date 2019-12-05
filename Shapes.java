public class Shapes extends Box
{
    int a;
    public void surfaceArea(int w,int h)
    {
        a = w*h;
        System.out.println("The area is: "+a);
    }

    public static void main(String[] args) {
        Shapes demo = new Shapes();

        //Box(2.5,3.3,4.2)

        demo.surfaceArea(3,5);
        demo.Volume();
    }
}
