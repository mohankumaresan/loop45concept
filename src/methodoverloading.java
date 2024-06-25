public class methodoverloading  {

    public void show(String a,String b){
        System.out.println("the value of a nd b"+a+""+b);
    }
    public int show(int a,int b){
        int d=a+b;
        return d;
    }
    public float show(float a,float b){
        float s=a+b;
        System.out.println("the value of a nd b"+s);
        return s;
    }
    public int show(int a,int b,int c){
        int q=(a*b)+c;
        return q;
    }
    public void show(String a,String b,String c){
        System.out.println("the value of a b c"+a+""+b+""+c);
    }

    public static void main(String[] args) {

        methodoverloading obj=new methodoverloading();
       System.out.println(obj.show(3,5));
        System.out.println(obj.show(2.5f,4.2f));
        obj.show("java","training");
        obj.show("java","training","abc");
        System.out.println(obj.show(3,5,2));



    }
}
