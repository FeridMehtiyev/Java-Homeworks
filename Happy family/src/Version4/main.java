package Version4;

public class main {
    public static void main(String[] args) {
        Pet Qarabas = new Dog("Qarabas",4,new String[]{"aa"});
        Pet Qarabasfish = new Fish("Qarabas",4,new String[]{"aa"});
        System.out.println(Qarabas==Qarabasfish);

        System.out.println(Qarabas);
        Female Ramile = new Female("Ramile","Ehmedova",1977,120);
        System.out.println(Ramile);
        Male Meherrem = new Male ("Meherrem","Mehtiyev",1977,125);
        System.out.println(Meherrem);
        Family family = new Family(Meherrem,Ramile);
        Ramile.bornChild("Ferid","Mehtiyev",2006,Meherrem);;
        System.out.println(family);


    }
}
