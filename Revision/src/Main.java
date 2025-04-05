import java.util.*;
public class Main {
    public static void func()
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            while(true)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a/b);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
            func();
        }
    }

    public static void paymoney(int wallet, int rent) throws PaymentFail
    {
        if(wallet < rent) throw new PaymentFail();
        wallet -= rent;
        System.out.println(wallet);
    }

    public static void overflow(int a, int b)
    {
        int a1=a+1, b1=b+1;
        overflow(a1, b1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int[] arr = {1,2,3};
            System.out.println(arr[4]);
        }
        catch(Exception e)
        {
            System.out.println("Array out of range qaqa");
        }

        //func();

        //overflow(1,2);

        //int[][] bigarray = new int[100000][10000000];

        try
        {
            paymoney(100,20000);
        }
        catch (PaymentFail e)
        {
            System.out.println(e.logmessage);
        }
        finally
        {
            System.out.println("done");
        }
    }
// 4 eded model olacaq humannan gelen teacher student teachable toughtable course exam course goturule biler oxuna biler
// her kursun seperate exami olacaq qiymeti olacaq ve s. Her entytyde 5 field
    // fayla json formatinda yazmaq lazimdi jason libraryden object mapperden
    // student course teacher exam file
    // exceptionlari tutmaq lazimdi
    // global exception handling yazmaq olar
};