public abstract class Human {
    protected String name, surname;
    protected int age;
    protected boolean gender;

    public Human() {}

    public Human(String name, String surname, int age, boolean gender)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getAge() {return age;}
    public boolean getGender() {return gender;}

    void setName(String name) {this.name = name;}
    void setSurname(String surname) {this.surname = surname;}
    void setAge(int age) {this.age = age;}
    void setGender(boolean gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "name: " + name + " surname" + surname + " age" + Integer.toString(age) + " gender" + ((gender) ? "Boy" : "Girl" );
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Human)) return false;
        Human h = (Human)obj;
        return h.gender == gender && h.name.equals(name) && h.surname.equals(surname);
    }
}
