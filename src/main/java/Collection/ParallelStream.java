package Collection;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

public class ParallelStream {
    public static void main(String[] args) {
        List<Student> ab2 = Arrays.asList(
                new Student("Apoorv",30),
                new Student("Rahul",20),
                new Student("Shreya",12)
        );
        ab2.stream().filter(a1 ->a1.age<30).limit(1).forEach(abc ->System.out.println(abc.name+" "+abc.age));
        ab2.stream().parallel().filter(a1 ->a1.age<30).forEach(abc ->System.out.println(abc.name+" "+abc.age));
        //ab2.stream().filter(a1 ->a1.age<30).forEach(abc ->System.out.println(abc.name+" "+abc.age));
    }
}
