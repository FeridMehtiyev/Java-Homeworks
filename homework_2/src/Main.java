//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Room[] school = new Room[10];
        for(int i=0; i<10; i++) school[i] = new Room(i+1);
        System.out.println(school[0].add_student(new Student(16,"Ferid")));
        System.out.println(school[0].add_student(new Student(17,"Mary")));
        System.out.println(school[0].add_student(new Student(18,"John")));
        System.out.println(school[0].add_student(new Student(19,"Jane")));
        String[] temp= school[0].get_names();
        for(int i=0;i<temp.length;i++) System.out.println(temp[i]);

        System.out.println(school[0].remove_student("John"));
        String[] temp1= school[0].get_names();
        for(int i=0;i<temp1.length;i++) System.out.println(temp1[i]);
    }
}