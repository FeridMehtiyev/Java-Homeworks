package Version4;

import java.util.Random;

public class Female extends Human implements HumanCreator{

    public Female(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }
    public Female(String name, String surname, int year, int iq, Male father, Female mother)
    {
        super(name, surname, year, iq, father, mother);
    }
    public Female(String name, String surname, int year, int iq, Male father, Female mother,String[][] schedule)
    {
        super(name, surname, year, iq, father, mother, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println(super.getName() + "Greets her pet gently");
    }

    public void makeup()
    {
        System.out.println(super.getName()+"is putting on make up");
    }

    @Override
    public Human bornChild(String name, String surname, int year, Male father) {
        int rnd = new Random().nextInt(2);
        Human result = null;
        if(rnd == 0) result = new Female(name,surname,year,father.getIq()+this.getIq()/2);
        else result = new Male(name,surname,year,(father.getIq()+this.getIq())/2);
        this.getFamily().addchildren(result);
        return result;
    }
}
