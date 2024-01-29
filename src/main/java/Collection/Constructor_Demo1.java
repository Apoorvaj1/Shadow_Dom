package Collection;

class Student2{
     String name;
     int age;

    public String toString(){
        return "Hello my name is "+this.name+" and my age is "+this.age;
    }

    Student2(String name,int age){
        this.name = name;
        this.age = age;
    }
    {
        System.out.println("Hello ApoorvAJ");
    }
    static{
        System.out.println("Hello");
    }


}

public class Constructor_Demo1 {
    public static void main(String[] args) {
        Student2 a = new Student2("Apoorv",30);
        System.out.println(a);

        Student2 b = new Student2("Rahul",21);
        System.out.println(b);

    }
}
