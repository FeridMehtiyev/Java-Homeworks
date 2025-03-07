package Version4;

public class DomesticCat extends Pet implements foulable{

    public DomesticCat() {
        super();
        super.species=Species.DomesticCat;
        super.ability="can be nasty";
    }

    public DomesticCat(String nickname, int age, String[] habits) {
        super(nickname, age, habits);
        super.species=Species.DomesticCat;
        super.ability="can be nasty";
    }

    public DomesticCat(String nickname)
    {
        super(nickname);
        super.species=Species.DomesticCat;
        super.ability="can be nasty";
    }

    @Override
    public void respond() {
        System.out.println("miyav");
    }

    @Override
    public void foul() {
        System.out.println("** your vase is broken in the floor **");
    }
}
