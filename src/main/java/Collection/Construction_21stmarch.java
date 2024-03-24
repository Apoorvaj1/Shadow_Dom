package Collection;

class Construction_21stmarch {
    String name;
    int age;
    public String toString(){
        return "Hello "+this.name+" "+"I am "+this.age+" "+"years old";
    }
    public Construction_21stmarch(String name,int age){
        this.age = age;
        this.name = name;
        }

    public static void main(String[] args) {
        Construction_21stmarch a = new Construction_21stmarch("Apoorv",21);
        System.out.println(a.age);
        System.out.println(a.name);
        System.out.println(a);
    }

}
