public class Average {
    public static void main(String[] args) {
        int math = 80;
        int science = 85;
        int history = 90;
        double average = (math + science + history)/3.0;
        System.out.println("Average Marks =" +average);
    if(average>=90){
        System.out.println("Grade A");
    }
    if(average<=89 && average>=70){
    System.out.println("Grade B");
    }
    if(average<=69 && average>=50){
        System.out.println("Grade C");
    }
    if(average<=49 && average>=30){
        System.out.println("Grade D");
    }else{
        System.out.println("Fail");
    }
    }

}
