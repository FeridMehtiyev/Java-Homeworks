package Version2;

import java.util.Arrays;
import java.util.Random;

public class Human
{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public int getIq() {return iq;}
    public int getYear() {return year;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String[][] getSchedule() {return schedule;}
    public Family getFamily() {return family;}

    public void setIq(int iq) {this.iq = iq;}
    public void setName(String name) {this.name = name;}
    public void setSchedule(String[][] schedule) {this.schedule = schedule;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setYear(int year) {this.year = year;}
    public void setFamily(Family family) {this.family = family;}

    public Human(String name, String surname, int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.schedule=new String[7][100];
    }
    public Human(String name, String surname, Human mother, Human father,int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.schedule=new String [7][100];
        this.family=new Family(mother,father);
    }
    public Human(String name, String surname, Human mother, Human father,int year,String[][] schedule,int iq, Pet pet)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.schedule=schedule;
        this.iq=iq;
        this.family=new Family(mother,father);
        family.setPet(pet);
    }
    public Human()
    {
        schedule=new String[7][100];
    }

    public void greetPet()
    {
        System.out.println("Hello " + this.family.getPet().getNickname());
    }
    public void describePet()
    {
        System.out.print("I have an " + this.family.getPet().getSpecies() + " is " + this.family.getPet().getAge() + " years old, he is ");
        if(this.family.getPet().getTricklevel()>50) System.out.println("very silly");
        else System.out.println("not so silly");
    }
    public boolean feedpet(boolean istime)
    {
        if(istime)
        {
            System.out.println("Hm... I will feed "+this.family.getPet().getNickname());
            return true;
        }
        int rndm = new Random().nextInt(101);
        if(this.family.getPet().getTricklevel()>rndm)
        {
            System.out.println("Hm... I will feed "+this.family.getPet().getNickname());
            return true;
        }
        System.out.println("I will not feed "+this.family.getPet().getNickname());
        return false;
    }

    public String toString()
    {
        String result="Human{name='"+this.name+"',surname='"+this.surname+"',year="+Integer.toString(this.year)+", iq="+Integer.toString(this.iq);
        for(int i=0;i<schedule.length;i++) if(schedule[i][0]!=null) result+=", schedule["+i+"]="+schedule[i][0];
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=this.getClass()) return false;
        if(obj==this) return true;
        Human h = (Human)obj;
        // Family equalsi Human equalsi cagirar oda o birin
        return this.name.equals(h.name) && this.surname.equals(h.surname) && this.year==h.year && this.iq==h.iq && Arrays.deepEquals(this.schedule,h.schedule);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.year + this.iq + Arrays.deepHashCode(this.schedule);
    }
}