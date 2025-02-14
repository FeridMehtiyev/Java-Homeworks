package Version2;

import java.util.Arrays;
import java.util.Random;

public class Family
{
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    private int childnumber;

    public Pet getPet() {return pet;}
    public void setPet(Pet pet) {this.pet = pet;}
    public Human getFather() {return father;}
    public void setFather(Human father)
    {
        this.father = father;
        father.setFamily(this);
    }
    public Human getMother() {return mother;}
    public void setMother(Human mother)
    {
        this.mother = mother;
        mother.setFamily(this);
    }
    public Human[] getChildren() {return children;}
    public void setChildren(Human[] children)
    {
        this.children = children;
        for(int i=0;i<children.length;i++)
        {
            if(children[i]==null)
            {
                childnumber=i;
                break;
            }
            children[i].setFamily(this);
        }
    }

    public Family(Human father,Human mother)
    {
        father.setFamily(this);
        mother.setFamily(this);
        children = new Human[100];
        childnumber=0;
        this.father = father;
        this.mother = mother;
        this.pet = new Pet();
    }

    public boolean addChild(Human child)
    {
        if(childnumber==children.length) return false;
        children[childnumber++]=child;
        child.setFamily(this);
        return true;
    }

    public boolean deleteChild(int index)
    {
        if(index<0 || index>=childnumber) return false;
        children[index].setFamily(null);
        for(int i=index;i<=childnumber-1;i++) children[i]=children[i+1];
        childnumber--;
        return true;
    }

    public boolean deleteChild(Human child)
    {
        if(childnumber==0) return false;
        int i;
        for(i=0;i<childnumber;i++)
        {
            if(children[i].equals(child)) break;
        }
        if(i==childnumber) return false;
        children[i].setFamily(null);
        for(i=i;i<=childnumber-1;i++) children[i]=children[i+1];
        childnumber--;
        return true;
    }

    public int countFamily()
    {
        if(pet==null) return childnumber+2;
        return childnumber+3;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=this.getClass()) return false;
        if(obj==this) return true;
        Family family = (Family) obj;
        return family.getFather().equals(this.getFather()) && family.getMother().equals(this.getMother()) && family.getPet().equals(this.getPet()) && Arrays.equals(family.getChildren(), this.getChildren());
    }

    @Override
    public int hashCode() {
        return mother.hashCode() + father.hashCode() + pet.hashCode()+Arrays.hashCode(children);
    }

    @Override
    public String toString() {
        String result="Family members: Father: " + father.toString() + ", Mother: " + mother.toString()+", pet: "+pet.toString();
        result+=", Children: ";
        for(int i=0;i<childnumber;i++) result+=children[i].toString()+", ";
        return result;
    }
}
