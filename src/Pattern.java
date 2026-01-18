public class Pattern {
    public static void main(String[] args) {
        int n = 5;

//        print this pattern =====
//*
//**
//***
//****
//*****
//        ==================================================================

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        =========================================================================
//print this
// 1
//12
//123
//1234
//12345
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }


//        =======================================================================
//        print
// 12345
//1234
//123
//12
//1
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

        //        =========================================================================
//    print
//    1
//22
//333
//4444
//55555
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i );
//            }
//            System.out.println( " ");
//        }


        //        =========================================================================

//print
// ******
//*****
//****
//***
//**
//*

//        for (int i = 6; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //        =========================================================================

//print      *
//     * * *
//    * * * * *
//   * * * * * * *
//  * * * * * * * * *


//        for (int i = 0; i<n; i++) {
//            for(int j=0;j<n-i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("* ");
//            }
//            for(int j=0;j<n-i+1;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }


        //        =========================================================================



//print this parten
// * * * * * * * * *
// * * * * * * *
//  * * * * *
//   * * *
//    *

//        for (int i = 0; i<n; i++) {
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*n-(2*i+1);j++){
//                System.out.print("* ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }

        //        =========================================================================

//print this
//    *
//   **
//  ***
// ****
//*****
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }







//        ============================================================================================
//    for (int i=0;i<=n;i++){
//        for(int j=0;j<=i;j++){
//            System.out.print("$");
//        }
//        System.out.println();
//    }


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=0;i--){
//            for(int j=i;j>=0;j--){
//                System.out.print("$");
//            }
//            System.out.println();
//        }













    }



}
