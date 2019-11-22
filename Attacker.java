public class Attacker extends Player {
    private int GoalsScored;
    private int GoalsMissed;
    public Attacker(String name, int age, int scored, int missed){
        super(name,age);
        this.GoalsScored=scored;
        this.GoalsMissed=missed;
    }
    public void AttackerPoints(){
        int l=(GoalsScored*4)+(GoalsMissed*(-2));
        super.setTotalPoints(l);
    }
    public void printInfo(){
        System.out.println("Name: " +getName());
        System.out.println("Age: " +getAge());
        System.out.println("Type: Attacker");
        System.out.println("Goals Scored: "+GoalsScored);
        System.out.println("Goals Missed: "+GoalsMissed);
        System.out.println("Total Points: " +getTotalPoints());
    }

}
