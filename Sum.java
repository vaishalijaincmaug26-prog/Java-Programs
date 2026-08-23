import java.util.Scanner;

public class Sum {
   static void sumofnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of number :" + sum);

    }
    public static void main(String[] args) {
        Sum.sumofnum();
        
    }
}
