package Version3;// Use this editor to write, compile and run your Java code online


class Main {

    public static void main(String[] args)
    {
        Pet.Species sp=Pet.Species.Dog;
        sp.numberoflegs=4;
        sp.hasfur=true;
        sp.canfly=false;
        Pet qarabas=new Pet(sp,"Qarabas");
        Human mother = new Human("mt","mt",129);
        Human father = new Human("ft","ft",128);
        Human son = new Human("son","son",127);
        Human garbagechild1 = new Human("g1","g1",126);
        Human garbagechild2 = new Human("g2","g2",125);
        Family family = new Family(mother,father);
        family.setPet(qarabas);
        family.addChild(son);
        family.addChild(garbagechild1);
        family.addChild(garbagechild2);
        System.out.println(family);
        System.out.println(family.deleteChild(5));
        System.out.println(family.deleteChild(-6));
        System.out.println(family.deleteChild(1));
        System.out.println(family);
        System.out.println(family.deleteChild(garbagechild2));
        System.out.println(family);
        for(long i=0;i<999999999;i++)
        {
            Human mt = new Human("X","Y",120);
            Human ft = new Human("X","Y",120);
            String[][] sch = new String[7][2];
            for(int j=0;j<7;j++) sch[j][0]=Human.DayOfWeek.values()[j].name();
            Human Ferid = new Human("Ferid","Mehtiyev",mt,ft,2006,sch,200,new Pet());
            System.out.println(Ferid.toString());
        }

    }

}