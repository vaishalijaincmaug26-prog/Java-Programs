import java.util.Scanner;

public class Age{
    static void checkAgeCategory(){
        Scanner sc = new Scanner(System.in);
    System.out.println(" Enter your age");
    int age = sc.nextInt();
    if(age>=60){
        System.out.println("Senior category");
    }
    else if(age>=18){
        System.out.println("adult");
    }else{
        System.out.println("minor");
    }

    }
    public static void main(String[] args) {
        Age.checkAgeCategory();
        
    }
}