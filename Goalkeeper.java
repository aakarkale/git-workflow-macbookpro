public class Goalkeeper extends Player {
    private int GoalsSaved;
    private int GoalsConceded;
    public Goalkeeper(String name, int age, int saved, int conceded){
        super(name,age);
        this.GoalsSaved=saved;
        this.GoalsConceded=conceded;
    }
    public void GoalkeeperPoints(){
        int l=(GoalsSaved*2)+(GoalsConceded*(-2));
        super.setTotalPoints(l);
    }
    public void printInfo(){
        System.out.println("Name: " +getName());
        System.out.println("Age: " +getAge());
        System.out.println("Type: Goalkeeper");
        System.out.println("Goals Saved: "+GoalsSaved);
        System.out.println("Goals Conceded: "+GoalsConceded);
        System.out.println("Total Points: " +getTotalPoints());
    }
}
