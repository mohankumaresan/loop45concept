public class superclass {

    protected int add(int a,int b,int c){
        int result = a+b+c;
        return result;
    }
    public int add(int a,int b){
        int result1 = a+b;
        return result1;
    }
    public static void main (String[] args){
        superclass obj=new superclass();
    }

}
class childclass extends superclass{

    public static void main(String[] args )
    {
        childclass obj1=new childclass();
        System.out.println(obj1.add(42,13,20));
        System.out.println(obj1.add(42,13));
    }
}
