package basic_programme;

public class fibonachi {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        fb(n);
    }
    static  void fb(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println(); // for new line after sequence
    }
}
