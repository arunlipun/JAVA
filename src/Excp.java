import java.io.*;

//========================================================checked exception==================================================================
//public class Excp {
//    public static void main(String[] args) {
//        try{
//            FileInputStream fs = new FileInputStream("d:/abc.text");
//        }
//        catch (Exception e){
//
//        }
//    }
//}
//=======================================================unchecked Exception ==============================================================================

//public class Excp {
//    public static void main(String[] args) {
//       int a=100;
//       int  b=0;
////       int x=a/b;
//        int x=a/b;
//        System.out.println("Result is : " + x);
//    }
//}
//==============================================================================================================================================
//public class Excp {
//    public static void main(String[] args) {
//        System.out.println("H");
//        System.out.println("e");
//        try {
//            System.out.println(13 / 0);
//        }catch (ArithmeticException e){
//            System.out.println("don't devide by zero");
//        }
//        System.out.println("l");
//        System.out.println("o");
//    }
//}

//========================throw nad throws======================================================
//public class Excp {
//    public static void main(String[] args) throws FileNotFoundException{
//        System.out.println("Before Exception");
//        try{
//            FileInputStream fn=new FileInputStream("C:/Users/VICTUS/IdeaProjects/JAVA GEC/src/Excpt.java");
//        }catch (Exception e){
//            System.out.println("After Exception");
//
//        }
//
//
//
//    }
//
//}
//=======================================================================================================
//public class Excp {
//    public static void main(String[] args) throws  FileNotFoundException{
//        System.out.println("1");
//        Ad ob=new Ad();
//        System.out.println("2");
//        try{
//            ob.s();
//
//        }catch (Exception e){
//            System.out.println("3");
//
//
//        }
//
//
//
//    }
//
//}
//class Ad{
//    void s()throws FileNotFoundException {
//        FileInputStream fn=new FileInputStream("C:/Users/VICTUS/IdeaProjects/JAVA GEC/src/Excpt.java");
//    }
//}
//==========================================throw==================================================
//public class Excp {
//    public static void main(String[] args) {
//        MyException m=new MyException("this is MYexception");
//
////        throw m;
//    }
//    }
//    class MyException extends  Exception{
//    MyException(String msg){
//        super(msg);
//    }
//
//
//    }
//===================================================================
public class Excp {
//    static  void chechage(int age){
//        if(age<18){
//            throw  new ArithmeticException("not elegiable for  to vote");
//        }else {
//            System.out.println("elegiable to vote");
//        }
//    }
    public static void main(String[] args) {
//        chechage(16);
         int a=10,b=0;
         try {
             System.out.println("result is " + a / b);
         }
         finally {
//             {
//                 System.out.println("finally executed");
//             }
//         }

        }

//


    }
    }

