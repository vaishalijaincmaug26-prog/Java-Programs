public class Evennumber{
    static void checkEvenNumber(){
        int i = 2;
        while(i<=50){
            if(i % 2==0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Evennumber.checkEvenNumber();
        
    }
}