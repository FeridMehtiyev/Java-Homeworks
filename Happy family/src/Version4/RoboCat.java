package Version4;

public class RoboCat extends Pet implements foulable{

    public RoboCat() {
        super();
        super.species=Species.RoboCat;
        super.ability="can be nasty";
    }

    public RoboCat(String nickname, int age, String[] habits) {
        super(nickname, age, habits);
        super.species=Species.RoboCat;
        super.ability="can be nasty";
    }

    public RoboCat(String nickname)
    {
        super(nickname);
        super.species=Species.RoboCat;
        super.ability="can be nasty";
    }

    @Override
    public void respond() {
        System.out.println("I am a robo cat, m-i-i-i-yaaaaaw");
    }

    @Override
    public void foul() {
        System.out.println("** your favourite table is split into 2 halves by a laser**");
    }
}
