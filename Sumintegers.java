import java.util.Scanner;
public class Sumintegers{
    static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
            sum = sum+i;
        }
            System.out.println("Sum =" +sum);
        
    }
public static void main(String[] args) {
    Sumintegers.calculateSum();
    
}
}