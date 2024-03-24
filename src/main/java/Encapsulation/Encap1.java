package Encapsulation;

public class Encap1 {
    static int age;
    public void setAge(int age) {
        if(age<100){
            System.out.println("You are eligible "+age);
        }
        else{
            System.out.println("Please enter correct age");
        }
    }

    public static void main(String[] args) {
        Encap1 a = new Encap1();
        a.setAge(1000);
        a.setAge(20);
    }

}

