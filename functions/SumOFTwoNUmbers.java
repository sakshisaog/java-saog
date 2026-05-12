import java.util.*;

public class SumOFTwoNUmbers {
    public static int sumNumbers(int a, int b){
        int sum=0;
        sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();    
        int b=sc.nextInt(); 
        int sum=sumNumbers(a,b);
        System.out.println(sum);

    }

    
}  
