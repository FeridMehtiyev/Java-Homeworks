package Version4;
import java.util.Arrays;
import java.util.Random;

public abstract class Human
{
    static public enum DayOfWeek
    {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    protected Human(String name, String surname, int year, int iq)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    protected Human(String name, String surname, int year, int iq, Male father, Female mother)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family=new Family(father,mother);
    }

    protected Human(String name, String surname, int year, int iq, Male father, Female mother, String[][] schedule)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family=new Family(father,mother);
        this.schedule=schedule;
    }

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

    public abstract void greetPet();

    @Override
    public String toString()
    {
        String result="Human{name='"+this.name+"',surname='"+this.surname+"',year="+Integer.toString(this.year)+", iq="+Integer.toString(this.iq);
        result += (this.getClass()==Male.class)?" gender is male ":"gender is female ";
        if(schedule!=null) for(int i=0;i<schedule.length;i++) if(schedule[i][0]!=null) result+="\n, "+schedule[i][0]+": " +schedule[i][1];
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        Human human = (Human)obj;
        return human.getIq()==this.getIq() && human.getName().equals(this.getName()) && human.getSurname().equals(this.getSurname()) && human.getYear()==this.getYear() && Arrays.deepEquals(human.getSchedule(), this.getSchedule());
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(this.getSchedule())+Integer.hashCode(this.getIq())+this.getName().hashCode()+this.getSurname().hashCode()+Integer.hashCode(getYear());
    }
}