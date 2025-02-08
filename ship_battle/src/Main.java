import java.util.InputMismatchException;
import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int input()
    {
        Scanner cin=new Scanner(System.in);
        int result;
        try
        {
            result=cin.nextInt();
            if(result>=6 || result<1)
            {
                System.out.println("Please enter a valid number between 5 and 1");
                return input();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a valid number between 5 and 1");
            return input();
        }
        return result;
    }
    public static void print(char[][] board)
    {
        for(int i=0;i<=board.length;i++)
        {
            for (int j=0;j<=board[0].length;j++)
            {
                if(i==0) System.out.print(j+" | ");
                else if(j==0) System.out.print(i+" | ");
                else System.out.print(board[i-1][j-1]+" | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        char[][] board = new char[5][5];
        for(int i=0;i<5;i++) for(int j=0;j<5;j++) board[i][j] = '-';
        int xt = new Random().nextInt(5), yt = new Random().nextInt(5);
        System.out.println("All set. Get ready to rumble!");
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter the row number: ");
            int row = input();
            System.out.println("Enter the column number: ");
            int col = input();
            board[row-1][col-1] = '*';
            if(row==yt && col==xt)
            {
                flag = false;
                System.out.println("You win!");
                board[yt][xt] = 'X';
            }
            print(board);
        }
    }
}