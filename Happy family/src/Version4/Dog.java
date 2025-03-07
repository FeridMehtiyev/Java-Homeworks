package Version4;

public class Dog extends Pet implements foulable,swimmable{

    public Dog() {
        super();
        super.species=Species.Dog;
        super.ability="can swim and can be nasty";
    }

    public Dog(String nickname, int age, String[] habits) {
        super(nickname, age, habits);
        super.species=Species.Dog;
        super.ability="can swim and can be nasty";
    }

    public Dog(String nickname)
    {
        super(nickname);
        super.species=Species.Dog;
        super.ability="can swim and can be nasty";
    }


    @Override
    public void respond() {
        System.out.println("Hav Hav");
    }

    @Override
    public void foul() {
        System.out.println("** your sweat has been gnawed **");
    }

    @Override
    public void swim() {
        System.out.println(super.nickname + " swims");
    }
}
