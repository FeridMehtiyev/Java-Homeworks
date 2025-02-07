// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;

class Main {

    static class Pet
    {
        public String nickname;
        public int age;
        public String species;
        public int tricklevel;
        public String[] habits;

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


    static class Human
    {
        public String name;
        public String surname;
        public int year;
        private int iq;
        public Pet pet;
        public Human mother;
        public Human father;
        public String[][] schedule;

        public Human(String name, String surname, int year)
        {
            this.name=name;
            this.surname=surname;
            this.year=year;
            this.schedule=new String[7][100];
            this.mother=new Human();
            this.father=new Human();
            this.pet=new Pet();
        }
        public Human(String name, String surname, Human mother, Human father,int year)
        {
            this.name=name;
            this.surname=surname;
            this.mother=mother;
            this.father=father;
            this.year=year;
            this.schedule=new String [7][100];
            this.pet=new Pet();
        }
        public Human(String name, String surname, Human mother, Human father,int year,String[][] schedule,int iq, Pet pet)
        {
            this.name=name;
            this.surname=surname;
            this.mother=mother;
            this.father=father;
            this.year=year;
            this.schedule=schedule;
            this.iq=iq;
            this.pet=pet;
        }
        public Human()
        {
            schedule=new String[7][100];
        }

        public void greetPet()
        {
            System.out.println("Hello " + this.pet.nickname);
        }
        public void describePet()
        {
            System.out.print("I have an " + this.pet.species + " is " + this.pet.age + " years old, he is ");
            if(this.pet.tricklevel>50) System.out.println("very silly");
            else System.out.println("not so silly");
        }

        public String toString()
        {
            String result="Human{name='"+this.name+"',surname='"+this.surname+"',year="+Integer.toString(this.year)+", iq="+Integer.toString(this.iq)+",mother="+this.mother.name+" "+this.mother.surname+", father="+this.father.name+this.father.surname+",pet="+this.pet.toString();
            return result;
        }

        public boolean feedpet(boolean istime)
        {
            if(istime)
            {
                System.out.println("Hm... I will feed "+pet.nickname);
                return true;
            }
            int rndm = new Random().nextInt(101);
            if(pet.tricklevel>rndm)
            {
                System.out.println("Hm... I will feed "+pet.nickname);
                return true;
            }
            System.out.println("I will not feed "+pet.nickname);
            return false;
        }
    }

    public static void main(String[] args)
    {
        Human Ferid,Nubar,Meherrem,Ramile;
        String habits[]={"eat","sleep","kill"};
        Pet qarabas=new Pet("Qarabas","dog",10,75,habits);
        System.out.println(qarabas);
        Ramile=new Human("Ramile","Ehmedova",1977);
        System.out.println(Ramile);
        Meherrem=new Human("Meherrem","Mehtiyev",1977);
        String[][] schedule= new String[7][100];
        schedule[0][0]="Saalaaam";
        Ferid=new Human("Ferid","Mehtiyev",Ramile,Meherrem,1977,schedule,100,qarabas);
        System.out.println(Ferid);
        Ferid.feedpet(false);

    }
}