package Version4;

public class Fish extends Pet implements swimmable{
    public Fish() {
        super();
        super.species=Species.Fish;
        super.ability="can swim";
    }

    public Fish(String nickname, int age, String[] habits) {
        super(nickname, age, habits);
        super.species=Species.Fish;
        super.ability="can swim";
    }

    public Fish(String nickname)
    {
        super(nickname);
        super.species=Species.Fish;
        super.ability="can swim";
    }

    @Override
    public void respond() {
        System.out.println("blup-blup su sesi");
    }

    @Override
    public void swim() {
        System.out.println(super.nickname + " swims");
    }
}
