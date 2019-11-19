public class KaleAakarA6
{
    public static void main(String[] args)
    {
        Attacker a = new Attacker("Lionel Messi", 29, 3, 0);
        GoalKeeper g = new GoalKeeper("Petr Cech", 34, 5, 1);

        KaleAakarA6 obj = new KaleAakarA6();

        a.calc();
        a.printInfo();
        g.printInfo();
        int receive = obj.difference(a,g);


        if (a.isLeading(g))
        {
            System.out.println(a.getName() +" " + "leads " + g.getName() +" "+"by" +" "+ receive+" points");

        }
        else
        {
            System.out.println(g.getName() + " "+ "leads " + a.getName() +" "+"by" + receive+" points");
        }

        System.out.println("\nProgram Completed");

    }

    int difference(Attacker a, GoalKeeper g)
    {
        int difference = Math.abs(a.getTotalPoints() - g.getTotalPoints());
        return difference;
    }
}