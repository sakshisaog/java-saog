import java.util.Scanner;

public class PowerFunction {

    public static int power(int x, int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int x = sc.nextInt();

        System.out.print("Enter power: ");
        int n = sc.nextInt();

        int ans = power(x, n);

        System.out.println("Result: " + ans);

        sc.close();
    }
}