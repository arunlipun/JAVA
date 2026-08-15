package inheritance;
 class newB {
    public void working(){
        System.out.println("This is working");
    }
    public void classgoingon(){
        System.out.println("This is class which is taken by headmaster ");
    }

}
public class newA extends newB{
//    inheritance is the property of inherit the property from parent class
//    Advantage
//    1.code reuseability
//    2. support polyerphism

//    4 types of inheritance is present
//    1.simple 2.multi-level 3.herichal 4.multiple
public static void main(String[] args) {
    newA obj = new newA();
    obj.working();
    obj.classgoingon();
}

}

