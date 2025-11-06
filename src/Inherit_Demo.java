//public class Inherit_Demo {
//    public static void main(String[] args) {
//        B ob=new B();
//        ob.s();
//        ob.k();
//
//    }
//}
//class A{
//    int x=10;
//    void s(){
//        System.out.println("Parent  x = " + x);
//    }
//}
//class B extends  A{
//    void k(){
//        System.out.println("child x = " + x);
//    }
//
//}



//class A{
////     private  int x;
//    protected  int x;
////     A(){ //if we access private member then create constructor
////         x=23;
////         System.out.println("X=" + x);
////     }
////    void s(){
////        x=23;
////        System.out.println("X=" + x);
////    }
////    void s(){
////        System.out.println("Parent  x = " + x);
////    }
//}
//class B extends  A{
//    void k(){
//        System.out.println("child x = " + x);
//    }
//
//}
//===============================================
//                  EXAMPLE OF common members..
//==========================================
//class A{
//    int i=12;
//    void s(){
//        System.out.println("Parent i:" + i );
//    }
//
//
//}
//class B extends  A{
//    int i=56;
//    void k(){
//        System.out.println("Child i :" + i);
//        System.out.println("Parent i :" + super.i);
//    }
//
//}

//=========================================================



class A{
    A(int a ){
        System.out.println("I am Parent Constructor");
    }
}
class B extends  A{
    B(int a,int b){
        super(8);
        System.out.println("I am Child constructor");
    }
}

public class Inherit_Demo {
    public static void main(String[] args) {
//        A a=new A(7);
        B b=new B(3,5);
    }
}