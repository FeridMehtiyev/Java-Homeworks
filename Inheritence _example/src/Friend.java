public class Friend implements Creature{
    public String name;
    public int health;
    public String mission;
    private boolean mission_status;
    private Weapon gift;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getHealth() {return health;}

    public Weapon giveGift()
    {
        if(mission_status) return gift;
        else return null;
    }
}
