import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.grade<o2.grade) return 1;
        else if(o1.grade>o2.grade) return -1;
        else {
            if(o1.birthYear<o2.birthYear) return -1;
            else if(o1.birthYear>o2.birthYear) return 1;
            else {
                if(o1.gender && !o2.gender) return 1;
                else if(!o1.gender && o2.gender) return -1;
                else {
                    if(o1.surname.compareTo(o2.surname) > 0) return 1;
                    else if(o1.surname.compareTo(o2.surname) < 0) return -1;
                    else {
                        if(o1.name.compareTo(o2.name) > 0) return -1;
                        else if(o1.name.compareTo(o2.name) < 0) return 1;
                        else
                        {
                            if(o1.id>o2.id) return 1;
                            else if(o1.id<o2.id) return -1;
                            else return 0;
                        }
                    }
                }
            }
        }
    }
}
