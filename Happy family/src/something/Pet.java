package something;

public class Pet
{
    private String nickname;
    private int age;
    private String species;
    private int tricklevel;
    private String[] habits;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age;}
    public String getNickname() {return nickname;}
    public void setNickname(String nickname) {this.nickname = nickname;}
    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}
    public int getTricklevel() {return tricklevel;}
    public void setTricklevel(int tricklevel) {this.tricklevel = tricklevel;}
    public String[] getHabits() {return habits;}
    public void setHabits(String[] habits) {this.habits = habits;}

    public Pet(String species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
        this.habits= new String[100];
    }
    public Pet(String nickname, String species, int age, int tricklevel, String[] habits)
    {
        this.nickname=nickname;
        this.species=species;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }
    public Pet()
    {
        this.habits=new String[100];
    }


    public void eat()
    {
        System.out.println("I am eating!");
    }
    public void respond()
    {
        System.out.println("Hello owner, I am " + this.nickname + ".I miss you!");
    }
    public void foul()
    {
        System.out.println("I need to cover it up!");
    }

    public String toString()
    {
        String result = this.species + "{nickname='" + this.nickname + "',age=" + Integer.toString(this.age)+", tricklevel="+ Integer.toString(this.tricklevel)+", habits=[";
        for(int i=0;i<habits.length;i++)
        {
            result+=habits[i]+", ";
        }
        return result+"]}";
    }
}
