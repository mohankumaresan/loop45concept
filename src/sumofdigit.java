public class sumofdigit {

    public int digit(int a) {

       int  b=0;
       while(a!=0) {
           b = b + a % 10;
           a = a / 10;
       }
           return b;

    }

    public static void main(String[] args) {
        sumofdigit obj = new sumofdigit();
       System.out.println( obj.digit(25));

    }
}