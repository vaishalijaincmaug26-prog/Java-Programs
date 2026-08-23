import java.util.Scanner;

public class Positivenumber{
    static void askForPositiveNumber(){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter the positive number");
            num = sc.nextInt();
        }
        while(num <= 0);
        System.out.println("Positive Number is :" +num);
       
    }
    public static void main(String[] args) {
        Positivenumber.askForPositiveNumber();
        
    }
}