import java.util.Scanner;

public class Solutions {

    public static int findGCD(int n1, int n2) {

        while (n1 != n2) {

            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }

        return n1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);

        System.out.println("GCD is: " + gcd);

        sc.close();
    }
}

// import java.util.Scanner;

// public class GCD {

//     public static int findGCD(int a, int b) {

//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }

//         return a;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int gcd = findGCD(a, b);

//         System.out.println("GCD is: " + gcd);

//         sc.close();
//     }
// }