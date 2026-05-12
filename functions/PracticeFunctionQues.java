import java.util.*;

//Write a function to print your name.--------------------
// public class PracticeFunctionQues {
//     public static void printName(String name){
//         System.out.println(name);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         printName(name);
//     }
// }




// Write a function to add two numbers.-------------------
// public class PracticeFunctionQues {
//     public static int addTwoNum(int a, int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=addTwoNum( a, b);
//         System.out.println(sum);
//     }   
// }



// Write a function to find the product of two numbers.
// public class PracticeFunctionQues {
//     public static int productTwoNum(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=productTwoNum( a, b);
//         System.out.println(sum);
//     }   
// }




// Write a function to check if a number is even or odd.---
// public class PracticeFunctionQues {
//     public static boolean oddEvenNum(int a){
//         if (a%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }  
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println( oddEvenNum( a));
//     }   
// }




// Write a function to find the square of a number.-------
// public class PracticeFunctionQues {
//     public static int squareTwoNum(int a){
//         return a*a;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int square=squareTwoNum( a);
//         System.out.println(square);
//     }   
// }




// Write a function to find factorial of a number.
// public class PracticeFunctionQues {
//     public static void factorialNum(int num){
//         if(num<0){
//             System.out.println("Invalid NUmber");
//             return;
//         }
//         int fact=1;
//         for(int i=num;i>=1;i--){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//         return;   
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         factorialNum(num);
//     }   
// }




// Write a function to check if a number is prime.
// public class PracticeFunctionQues {
//     public static boolean isPrimeNum(int num){
//          if(num<=1){
//             return false;
//          }
//          for(int i=2; i<num;i++){
//             if(num%i==0){
//                 return false;
//             }
//          }
//          return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(isPrimeNum(num)){
//             System.out.println("Is a prime number");
//         }else{
//             System.out.println("Is not a prime number");
//         }
//     }   
// }




// Write a function to print multiplication table of a number.
// public class PracticeFunctionQues {
//     public static void squareTwoNum(int n,int limit){
//         for(int i=1;i<=limit;i++){
//            System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n=sc.nextInt();
//         System.out.print("enter the limit : ");
//         int limit=sc.nextInt();
//         squareTwoNum(n,limit);     
//     }   
// }





// Write a function to find greatest among 3 numbers.
// public class PracticeFunctionQues {
//     public static void greatestOfThree(int a, int b, int c){
//         if(a>b){
//             System.out.println(a +" is the greatest number");
//         }else if(b>c){
//             System.out.println(b +" is the greatest number");
//         }else{
//             System.out.println(c +" is the greatest number");
//         }     
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the fisrt number : ");
//         int a=sc.nextInt();
//         System.out.print("enter the second number : ");
//         int b=sc.nextInt();
//          System.out.print("enter the third number : ");
//         int c=sc.nextInt();
//         greatestOfThree(a, b,c);  
//     }   
// }





// Write a function to calculate power x^n.
// public class PracticeFunctionQues {
//     public static int xPowerN(int x, int n){
//         int res=1;
//         for(int i=1;i<=n;i++){
//             res=res*x;
//         }  
//         return res;     
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the fisrt number : ");
//         int x=sc.nextInt();
//         System.out.print("enter the second number : ");
//         int n=sc.nextInt(); 
//         System.out.print("The power of "+x+"^"+n+" is : " + xPowerN( x,  n));
//     }   
// }





// Write a function to print Fibonacci series till n terms.
// public class PracticeFunctionQues {
//     public static void fibonacci(int n) {
//         int a = 0;
//         int b = 1;
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number to find its fibonacci number : ");
//         int x=sc.nextInt();
//         fibonacci(x);
//     }   
// }




// Write a function to reverse a number.
// public class PracticeFunctionQues {
//     public static int reverseNum(int n) {
//         int reverse=0;
//         while(n>0){
//             int digit=n%10;
//             reverse=reverse*10+digit;
//             n=n/10;
//         }
//         return reverse;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number to be reversed : ");
//         int x=sc.nextInt();
//         System.out.println("Reveresed Number: " + reverseNum(x));
//     }   
// }





// Write a function to count digits in a number.
// public class PracticeFunctionQues {
//  public static int countDigits(int n) {
//      int count = 0;
//         while (n > 0) {
//             n = n / 10;
//             count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt();
//         System.out.println("Number of digits: " + countDigits(n));
//     }
// }







// Write a function to find sum of digits.
// public class PracticeFunctionQues {
//     public static int sumDigits(int n) {
//         int sum = 0;
//         while (n > 0) {
//             int digit = n % 10;
//             sum = sum + digit;
//             n = n / 10;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt();
//         System.out.println("Sum of digits: " + sumDigits(n));
//     }
// }




// Write a function to check palindrome number.
// public class PracticeFunctionQues {
//     public static boolean isPalindrome(int n) {
//         int original = n;
//         int reverse = 0;
//         while (n > 0) {
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n = n / 10;
//        }
//         return original == reverse;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt();
//         if (isPalindrome(n)) {
//             System.out.println("Palindrome Number");
//         } else {
//             System.out.println("Not Palindrome Number");
//         }
//     }
// }
    