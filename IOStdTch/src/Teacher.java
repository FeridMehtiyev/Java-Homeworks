public class Teacher extends Human implements Teachable {
    public Subject subject;

    public Teacher() {}
    public Teacher(String name, String surname, int age, boolean gender, Subject subject) {
        super(name, surname, age, gender);
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println("Teaching subject: " + subject.name());
    }
}
