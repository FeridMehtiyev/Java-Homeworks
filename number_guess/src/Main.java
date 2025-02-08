import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = cin.nextLine();
        boolean found = false, loop=true;
        int rand=new Random().nextInt(101), guess=-1;
        boolean[] chosen=new boolean[101];
        for(int i=0;i<101;i++) chosen[i]=false;
        while(loop)
        {
            if(found)
            {
                System.out.println("Here are your previous choices: ");
                for (int i=0;i<101;i++)
                {
                    if (chosen[i])
                    {
                        System.out.print(i+" ");
                        chosen[i]=false;
                    }
                }
                System.out.println();
                System.out.print("to play again enter 1: ");
                int decision = cin.nextInt();
                if(decision != 1)
                {
                    System.out.println("Game over!");
                    loop=false;
                }
                else
                {
                    found=false;
                    rand=new Random().nextInt(101);
                }
            }
            else
            {
                System.out.print("enter a number between 1 and 100: ");
                boolean temp=true;
                while(temp)
                {
                    guess=-1;
                    try
                    {
                        guess=cin.nextInt();
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Invalid input! Please enter a number between 1 and 100: ");
                        String temp1=cin.nextLine();
                    }
                    if(guess!=-1 && guess<=100 && guess>=0) temp=false;
                }
                chosen[guess]=true;
                if(guess == rand)
                {
                    System.out.println("Congratulations! You win !"+name);
                    found = true;
                }
                else if (guess < rand)
                {
                    System.out.println("Try a bit higher");
                }
                else System.out.println("Try a bit lower");
            }
        }
    }
}