public class Largestnumber{
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        int c = 40;
        if(a>=b && a>=c){
            System.out.println("Greater number is = " +a );
        }
        else if (b>=a && b>=c){
            System.out.println("Greater number is = " +b );
        }
        else {
            System.out.println("Greater number is = " +c );
        }


    }
}