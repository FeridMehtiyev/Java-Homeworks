import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface IsOdd
{
    boolean IsOdd(int x);
}
interface IsPrime
{
    boolean IsPrime(int x);
}
interface isPolindrome
{
    boolean IsPolindrome(int x);
}
public class Main {
    public static void main(String[] args) {
        IsOdd od=(a)->{
            return a%2==1;
        };
        isPolindrome poli=(a)->{
            int temp=a,cem=0;
            while(a!=0)
            {
                cem=cem*10+a%10;
                a=a/10;
            }
            return temp==cem;
        };
        IsPrime prime=(a)-> {
            if(a<=1) return false;
            for (int i = 2; i * i <= a; i++)
            {
                if(a%i==0) return false;
            }
            return true;
        };
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==1) System.out.println(od.IsOdd(b));
            else if(a==2) System.out.println(prime.IsPrime(b));
            else System.out.println(poli.IsPolindrome(b));
        }

    }
}