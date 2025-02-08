package something;

import java.util.Random;

public class Family
{
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    public Pet getPet() {return pet;}
    public void setPet(Pet pet) {this.pet = pet;}
    public Human getFather() {return father;}
    public void setFather(Human father) {this.father = father;}
    public Human getMother() {return mother;}
    public void setMother(Human mother) {this.mother = mother;}
    public Human[] getChildren() {return children;}
    public void setChildren(Human[] children) {this.children = children;}

    public Family(Human father,Human mother)
    {
        children = new Human[100];
    }


}
