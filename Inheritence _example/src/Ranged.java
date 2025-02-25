public class Ranged extends Enemy
{
    @Override
    public int attack() {
        if(super.weapon==Weapon.Crossbow || super.weapon==Weapon.Arrow) return super.damage*super.weapon.damage;
        else return super.damage;
    }

    @Override
    public void getDamage(int damage, int speed) {
        if(super.weapon==Weapon.Shield) return;
        if(super.speed>speed) super.health-=damage*0.5;
        else super.health-=damage;
    }
}
