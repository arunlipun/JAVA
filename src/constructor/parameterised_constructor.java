package constructor;

public class parameterised_constructor {
    String name;
    int age;
    public parameterised_constructor(String name, int age) {
       this.name=name;
       this.age=age;

    }
    void display(){
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
    }

    public static void main(String[] args) {
        parameterised_constructor c1 = new parameterised_constructor("John", 18);
        c1.display();
    }
}
