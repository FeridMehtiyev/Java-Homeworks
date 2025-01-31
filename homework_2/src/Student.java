public class Student
{
    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public String name;
    public int age;
    private int[] grades;

    public void learn()
    {
        System.out.println(name+"is learning.");
    }

    private void play_games()
    {
        System.out.println(name+"is playing games.");
    }
}
