package Version4;

import java.util.Arrays;

public abstract class Pet
{
    protected String nickname;
    protected int age;
    protected Species species=Species.UNKNOWN;
    protected String[] habits;

    protected String ability;

    public Pet(String nickname, int age, String[] habits)
    {
        this.nickname = nickname;
        this.age = age;
        this.habits = habits;
    }

    public Pet(String nickname)
    {
        this.nickname = nickname;
    }

    public Pet() {this.habits = new String[0];};

    public void eat()
    {
        System.out.println(this.nickname+" is eating");
    }
    public abstract void respond();

    public int getAge() {return age;};
    public void setAge(int age) {this.age = age;};
    public Species getSpecies() {return species;};
    public String getNickname() {return this.nickname;};
    public void setNickname(String nickname) {this.nickname = nickname;};
    public String[] getHabits() {return this.habits;}
    public void setHabits(String[] habits) {this.habits = habits;};

    @Override
    public String toString()
    {
        String result ="{nickname='" + this.nickname + "',age=" + Integer.toString(this.age);
        if(species!=null) result = result + ",kind="+this.species.name()+", ability="+this.ability+",habits={";
        for(int i=0;i<habits.length;i++)
        {
            if(habits[i]!=null) result+=habits[i]+", ";
        }
        return result+"]}";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        Pet other = (Pet) obj;
        return this.nickname.equals(other.nickname) && (this.age==other.age) && Arrays.equals(this.habits, other.habits);
    }
}

