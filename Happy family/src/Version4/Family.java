package Version4;

import java.util.Arrays;

public class Family
{
    private Male father;
    private Female mother;
    private Human[] children;
    private Pet pet;

    public Family(Male father, Female mother)
    {
        this.father = father;
        this.mother = mother;
        father.setFamily(this);
        mother.setFamily(this);
        children = new Human[0];
        pet = null;
    }
    public Pet getPet() {return pet;}
    public void setPet(Pet pet) {this.pet = pet;}
    public Male getFather() {return father;}
    public void setFather(Male father)
    {
        this.father = father;
        father.setFamily(this);
    }
    public Female getMother() {return mother;}
    public void setMother(Female mother)
    {
        this.mother = mother;
        mother.setFamily(this);
    }
    public Human[] getChildren() {return children;}
    public void setChildren(Human[] children)
    {
        this.children = children;
        for(int i = 0; i < children.length; i++)
        {
            children[i].setFamily(this);
        }
    }
    public boolean addchildren(Human child)
    {
        if(child==null) return false;
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
        return true;
    }
    public boolean deletechild(int index)
    {
        if(index<0 || index>children.length) return false;
        Human[] temp = new Human[children.length - 1];
        for(int i=0;i<children.length;i++)
        {
            if(i!=index-1) temp[i] = children[i];
            else children[i].setFamily(null);
        }
        children = temp;
        return true;
    }

    public boolean deletechild(Human child)
    {
        if(child==null) return false;
        Human[] temp = new Human[children.length - 1];
        boolean flag=true;
        for(int i=0;i<children.length;i++)
        {
            if(!children[i].equals(child)) temp[i] = children[i];
            else
            {
                children[i].setFamily(null);
                flag=false;
            }
        }
        if(!flag) return false;
        children = temp;
        return true;
    }

    public int countfamily()
    {
        return children.length+2;
    }

    @Override
    public String toString()
    {
        String result="Family members: Father: " + father.toString() + ", Mother: " + mother.toString()+", pet: " +((pet==null) ? "null" : pet.toString());
        result+=", Children: ";
        for(int i=0;i<children.length;i++) result+=children[i].toString()+", ";
        return result;
    }

    @Override
    public int hashCode()
    {
        int temp=(pet!=null)?pet.hashCode():0;
        return mother.hashCode()+father.hashCode()+temp;
    }

}