public class Abstract {
    public static void main(String[] args) {
        dog d=new dog();
        cat  c=new cat();
        parrot p=new parrot();
        d.sound();
        c.sound();
        p.sound();
//        y ob=new y();
//        ob.s();

    }
}
//abstract  class  x{
//    abstract void s();
//    void k(){
//        System.out.println("i am of x ");
//    }
//}
//class   y    extends x{
//    void  s(){
//        System.out.println("i am implemented");
//    }
//
//}

//=============================================================
abstract  class  animal{
    void sleep(){
        System.out.println("i am sleeping");
    }
    abstract  void sound();
}
class  dog extends  animal{
    void sound(){
        System.out.println("vovovovoovovovovo");
    }
}
class  cat  extends animal{
    void sound(){
        System.out.println("miaaaaun......miaaauuuunnnnnnnnn");
    }
}

class  parrot extends  animal{
    void sound(){
        System.out.println("mitu.....mitu");
    }
}


