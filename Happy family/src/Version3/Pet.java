package Version3;

public class Pet
{
    static public enum Species
    {
        Dog,Cat,Bird,Snake,Frog,Rabbit;
        public boolean canfly,hasfur;
        public int numberoflegs;
        Species(boolean canfly, boolean hasfur, int numberoflegs)
        {
            this.canfly = canfly;
            this.hasfur = hasfur;
            this.numberoflegs = numberoflegs;
        }

        Species() {
            ;
        }
    }
    @SuppressWarnings("deprecation")
    private String nickname;
    private int age;
    private Species species;
    private int tricklevel;
    private String[] habits;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age;}
    public String getNickname() {return nickname;}
    public void setNickname(String nickname) {this.nickname = nickname;}
    public Species getSpecies() {return species;}
    public void setSpecies(Species species) {this.species = species;}
    public int getTricklevel() {return tricklevel;}
    public void setTricklevel(int tricklevel) {this.tricklevel = tricklevel;}
    public String[] getHabits() {return habits;}
    public void setHabits(String[] habits) {this.habits = habits;}

    public Pet(Species species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
        this.habits= new String[100];
    }
    public Pet(String nickname, Species species, int age, int tricklevel, String[] habits)
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet is destroyed");
        super.finalize();
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
        String result ="{nickname='" + this.nickname + "',age=" + Integer.toString(this.age)+", tricklevel="+ Integer.toString(this.tricklevel)+", habits=[";
        if(species!=null) result = this.species.name()+", can it fly?: ,"+this.species.canfly+", has fur?: "+this.species.hasfur+", and number of legs is: "+this.species.numberoflegs + result;
        for(int i=0;i<habits.length;i++)
        {
            if(habits[i]!=null) result+=habits[i]+", ";
        }
        return result+"]}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        if(obj==this) return true;
        Pet pet = (Pet)obj;
        return this.nickname.equals(pet.nickname) && this.age==pet.age && this.species.equals(pet.species) && this.tricklevel==pet.tricklevel && this.habits.equals(pet.habits);
    }
}
