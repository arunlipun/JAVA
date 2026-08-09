package Method;

public class method_overriding {
    public static void main(String[] args) {
//        when a child class is implement a parent class that alreay ddefuened is called overriding is called
//        and its a dynamic type
        animal a=new animal();
        cat c=new cat();
        a.eat();
        c.eat();

    }

}

class  animal{
    public  void eat(){
        System.out.println("animal is eating");
    }
}
class  cat extends animal{
    public   void eat(){
        System.out.println("cat is eating");
    }
}
