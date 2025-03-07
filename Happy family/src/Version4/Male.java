package Version4;

public class Male extends Human {

    public Male(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }
    public Male(String name, String surname, int year, int iq, Male father, Female mother)
    {
        super(name, surname, year, iq, father, mother);
    }
    public Male(String name, String surname, int year, int iq, Male father, Female mother,String[][] schedule)
    {
        super(name, surname, year, iq, father, mother, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println(super.getName() + "Greets his pet by a high five");
    }

    public void repairCar()
    {
        System.out.println(super.getName()+"Repairing Car");
    }
}
