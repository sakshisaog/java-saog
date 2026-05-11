
    // import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("* ");
//             } 
//              System.out.println();
//         }

//     }

// }

// o/p:
// 5 5
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

// ---------------------------------------------------

//import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||i==n||j==1||j==m){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             } 
//              System.out.println();
//         }

//     }

// }
// 
// o/p:
// 5 5
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 

// ----------------------------------------------

// import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){

//                     System.out.print("* ");

//             } 
//              System.out.println();
//         }

//     }

// }

// o/p:
// 5 5
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

//--------------------------------------------

// import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){

//                     System.out.print("* ");

//             } 
//              System.out.println();
//         }

//     }

// }

// o/p:
// 5 5
// * * * * * 
// * * * * 
// * * * 
// * * 
// *

// -----------------------------------------------------------

// import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//     //upper half
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//               System.out.print(" *");   
//             } 
//             for(int j=1;j<=2*(n-i);j++){
//               System.out.print("  ");   
//             } 
//             for(int j=1;j<=i;j++){
//               System.out.print(" *");   
//             } 
//              System.out.println();
//         }

//         //lower half
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//               System.out.print(" *");   
//             } 
//             for(int j=1;j<=2*(n-i);j++){
//               System.out.print("  ");   
//             } 
//             for(int j=1;j<=i;j++){
//               System.out.print(" *");   
//             } 
//              System.out.println();
//         }

//     }

// }

// o/p:
// 5 5
//  *                 *
//  * *             * *
//  * * *         * * *
//  * * * *     * * * *
//  * * * * * * * * * *
//  * * * * * * * * * *
//  * * * *     * * * *
//  * * *         * * *
//  * *             * *
//  *                 *

// -----------------------------------------------------

// import java.util.*;
// public class Patern{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){

//                     System.out.print("  "); 
//             } 
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==m){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");

//             } 

//             } 

//              System.out.println();
//         }

//     }

// }

// o/p:
// 5 5 
//         * * * * * 
//       *       * 
//     *       * 
//   *       * 
// * * * * * 

// -------------------------------------------

