package Method;

public class method_overloading {
    public static void main(String[] args) {
//        its called compile time or ststic type same method name and have different parameter
        System.out.println(add(10,20));
        System.out.println(add(2.01,6.12));


    }
    public static int add(int x,int y){
        return x+y;

    }
    public static int add(double x,double y){
        return (int)(x+y);
    }
}
