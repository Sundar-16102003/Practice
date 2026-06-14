import java.util.Collections;
import java.util.ArrayList;
public class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public String toString()
    {
        return  name  +  ": " +  age; 
    }


 public int compareTo(Student s)
    {
if(this.age>s.age)
{
    return 1;
}
else
{
    return -1;
}
    }

   

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("sundar", 22));
        al.add(new Student("yuvi", 23));
        al.add(new Student("suriya", 25));
        al.add(new Student("rajesh", 21));
        al.add(new Student("ajaynath", 4));
        Collections.sort(al);
        System.out.println(al);
        
        


        



        
    }
    
    
}

