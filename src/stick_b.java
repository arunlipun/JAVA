public class stick_b {
    public static void main(String[] args) throws ClassNotFoundException{
//        test1 ob=new test1();
        Class.forName("test1");

    }


}
class test1{
    static {
        System.out.println("i am static");
    }
}