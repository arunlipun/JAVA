public class Inherit_Demo2 {
    public static void main(String[] args) {
        b ob=new b();
        ob.s();

    }
}
 class a{
     int x=12;
    void s(){

        System.out.println(" I am s of a");
    }

}
class b extends  a{


}