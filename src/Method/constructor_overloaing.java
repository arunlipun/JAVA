package Method;

public class constructor_overloaing {
    public static void main(String[] args) {
//        Constructor overloading means having multiple constructors in the same class,
//        each with a different parameter list.
        student s1=new student();
        student s2=new student("Arun");
        student s3=new student("ASDF",24);
        s1.display();
        s2.display();
        s3.display();

    }
}
class student{
    String name;
    int roll;
    public student(){
        this.name="Unkonwn";
        this.roll=10;
    }
    public student(String name){
        this.name=name;

    }
    public student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + roll);
    }
}
