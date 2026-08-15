package inheritance;

public class multi_level_inheritance {
    public static void main(String[] args) {
        CSEengineering cse = new CSEengineering();
        cse.attendance();
        cse.enginneringmakeattendance();
        cse.CSEengineering();

    }
}
class student{
    public void attendance(){
        System.out.println("attendance");
    }
}
class engineering extends student{
    public void enginneringmakeattendance(){
        System.out.println("enginnering makeattendance");

    }
}
class CSEengineering extends engineering {
    public void CSEengineering(){
        System.out.println("CSEengineering");
    }

}
