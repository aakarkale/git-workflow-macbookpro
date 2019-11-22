public class Player {
    private String Name;
    private int Age;
    private int TotalPoints;
    public Player(String name, int age)
    {
        this.Name=name;
        this.Age=age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }

    public void setTotalPoints(int t){
        this.TotalPoints=t;
    }
    public int getTotalPoints(){
        return TotalPoints;
    }
    public void printInfo(){
        System.out.println("Name" +Name);
        System.out.println("Age"+Age);
        System.out.println("Total Points"+TotalPoints);
    }
    public boolean isLeading(Player Goalkeeper){
        if (this.getTotalPoints()>Goalkeeper.getTotalPoints()){
            return true;
        }
        else{
            return false;
        }
    }

}
