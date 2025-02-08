import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String input(String[] weekdays)
    {
        System.out.println("Please, input the day of the week: ");
        Scanner cin = new Scanner(System.in);
        String day = cin.nextLine();
        if(day.equals("exit")) return day;
        day=day.trim();
        day=day.toLowerCase();
        for(int i = 0; i < weekdays.length; i++)
        {
            if(day.equals(weekdays[i]))
            {
                return weekdays[i];
            }
        }
        String temp1="change",temp2="reschedule";
        int j=0;
        for(int i=0;i<day.length();i++,j++)
        {
            if(j==temp1.length()) break;
            if(day.charAt(i)!=temp1.charAt(j)) break;
        }
        if(j==temp1.length()) return day;
        j=0;
        for(int i=0;i<day.length();i++,j++)
        {
            if(j==temp2.length()) break;
            if(day.charAt(i)!=temp2.charAt(j)) break;
        }
        if(j==temp2.length()) return day;
        return input(weekdays);
    }
    public static void main(String[] args)
    {
        String[][] schedule= new String[7][2];
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        String[] weekdays = {"monday", "tuesday", "wednesday", "thursday","friday","saturday","sunday"};
        boolean flag=true;
        while(flag)
        {
            String day = input(weekdays);
            if(day.equals("exit"))
            {
                flag=false;
                break;
            }
            int i;
            for(i=0;i<7;i++)
            {
                if(day.equals(weekdays[i]))
                {
                    System.out.println("Your tasks for "+weekdays[i]+" is : "+ schedule[i][1]);
                    break;
                }
            }
            if(i==7)
            {
                day = day.split(" ")[1];
                System.out.println("Please input the new task of "+day);
                for(i=0;i<7;i++)
                {
                    if(day.equals(weekdays[i]))
                    {
                        schedule[i][1] = new Scanner(System.in).nextLine();
                        System.out.println("Successfully changed!");
                        break;
                    }
                }
                if(i==7) System.out.println("The weekday's name is false!");
            }
        }
  ;  }
}