package Method;

public class Add_number {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers is : " + sum(10,50));
        int []arun={100,200,300,400};
        System.out.println("The printed array is :" );
        printarray(arun);

    }
    public static int sum(int a,int b){
       return a+b;
    }
    public static void printarray(int []arun){
        for(int i=0;i<arun.length;i++){
            System.out.print(arun[i]);
        }
    }
}
