public class stick {
    public static void main(String[] args) {
//        test.s();// accesssing through class name


        test ob = new test();// accessing through object
        test ob2 = new test();
        ob.s();
        ob.x++;
        ob2.s();
        ob2.s();
    }
}

class test {
   static int x = 1;
     void s() {
        System.out.println("I am static " + x);
    }
}

