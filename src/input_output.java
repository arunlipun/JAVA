
//import java.io.*;
//public class input_output {
//    public static void main(String[] args)throws  Exception {
//        FileInputStream ob1= new FileInputStream("E:/myfile.txt");
////        int val=ob1.read();
////        System.out.println( val);
//
//
//        int value=0;
//        while ((value = ob1.read()) != -1) {
//            System.out.println(value + " ");
//        }
//        ob1.close();
//    }
//}

//============================2===read =============================
//import java.io.*;
//public class input_output {
//    public static void main(String[] args) {
//        try{
//            FileInputStream ob1= new FileInputStream("E:/myfile.txt");
//
//            int value=0;
//            while ((value = ob1.read()) != -1) {
//                System.out.println((char)value + " ");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//
//
//
//
//    }
//}

//===============================3 write character.=====================
//import java.io.*;
//
//public class input_output {
//    public static void main(String[] args) {
//        try {
//            FileOutputStream ob2 = new FileOutputStream("E:/myfile.txt");
//            ob2.write(65); // Writes the ASCII character 'A' (65)
//            ob2.close();   // Always close your stream
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//=============================write string in to txt=====================
//import java.io.*;
//
//public class input_output {
//    public static void main(String[] args) {
//        try {
//            FileOutputStream ob2 = new FileOutputStream("E:/myfile.txt",true);
//              String s="lipun@gmail.com";
//              byte bytearray[]=s.getBytes();
//              ob2.write(bytearray);
//              ob2.close();
//            System.out.println("Write successful");
//
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
//
//=========================read and write==============================

//import java.io.*;
//
//public class input_output {
//    public static void main(String[] args) {
//        try{
//            DataInputStream ob1=new DataInputStream(System.in);
//            String s="E:/myfile.txt";
//            FileOutputStream ob2=new FileOutputStream("E:/myfile.txt");
//            System.out.println("Enter the thext @ at the end of ");
//            int value=0;
//            while ((value = ob1.read()) != '@') {  // Correct condition
//                ob2.write(value);                  // Write to file
//            }
//            ob1.close();
//            System.out.println("successfully written");
//
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}


//=============================using reader ==writer ==class ==read and ==write===
//import java.io.*;
//
//public class input_output {
//    public static void main(String[] args) {
//        try {
//            FileReader fr = new FileReader("E:/myfile.txt");
//            int i;
//
//            while ((i = fr.read()) != -1) {
//                System.out.print((char) i);  // use print, not println
//            }
//
//            System.out.println("\nReading completed.");
//            fr.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("IO Error: " + e.getMessage());
//        }
//    }
//}

//===================================fileWriter class//============================
//import java.io.*;
//
//public class input_output {
//    public static void main(String[] args)throws Exception{
//        FileWriter fw=new FileWriter("E:/myfile.txt");
//        fw.write("Welcome to hello World\n");
//        fw.write("this is java i/o stream class");
//        fw.close();
//        System.out.println("Successfully Written...........");
//
//    }
//}

//=====================Buffer Reader=================================================
import java.io.*;

public class input_output {
    public static void main(String[] args)throws Exception{
       try{
           FileInputStream fis=new FileInputStream("E:/myfile.txt");
           BufferedInputStream bis=new BufferedInputStream(fis);
           int i=0;
           while ((i=bis.read())!=-1){
               char ch=(char)i;
               System.out.println(ch);
           }
           bis.close();
           fis.close();
       }catch (Exception e){
           System.out.println(e);
       }
    }
}













