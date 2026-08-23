import java.util.Scanner;
public class table{
    static void printMultiplicationtable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" +(num*i));
        }
    }
    public static void main(String[] args) {
        table.printMultiplicationtable();
        
    }
}