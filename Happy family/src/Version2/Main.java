package Version2;// Use this editor to write, compile and run your Java code online
import java.util.Random;

class Main {

    public static void main(String[] args)
    {
        Human Ramile = new Human("Ramile","Ehmedova",new Human("Guldeste","Ehmedova",1940),new Human("Behbud","Ehmedov",1940),1975);
        Human Meherrem = new Human("Meherrem","Mehtiyev",1975);
        Pet qarabas = new Pet("Qafqaz Coban iti","Qarabas");
        Family myfamily = new Family(Meherrem,Ramile);
        System.out.println(myfamily);
        Human me = new Human("Ferid","Mehtiyev",2006);
        System.out.println(me);
        Human Nubar = new Human("Nubar","Mehtiyeva",2010);
        System.out.println(Nubar);
        myfamily.addChild(Nubar);
        myfamily.addChild(me);
        System.out.println(myfamily);
        Human garbageindex= new Human("Garbageindex","bruh",2025);
        Human garbageHuman= new Human("GarbageHuman","bruh",2025);
        myfamily.addChild(garbageindex);
        myfamily.addChild(garbageHuman);
        System.out.println(myfamily);
        myfamily.deleteChild(2);
        System.out.println(myfamily);
        myfamily.deleteChild(garbageHuman);
        System.out.println(myfamily);
    }

}