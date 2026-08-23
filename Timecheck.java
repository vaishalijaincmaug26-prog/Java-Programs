public class Timecheck {
    public static void main(String args[]){
        int time = 8;
        String period = "AM";
        if (period.equals("AM") && time >= 5 && time <= 12 ){
            System.out.println("Good morning");

        } else {
            System.out.println("Good evening");
        }
        
    }
    
}
