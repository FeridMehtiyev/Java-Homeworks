public abstract class Enemy implements Creature {
    private String name;
    public Weapon weapon;
    protected int health;
    protected int speed;
    protected int damage;
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public int getHealth()
    {
        return health;
    }

    public abstract int attack();
    public abstract void getDamage(int damage, int speed);
}
