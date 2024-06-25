public class average {
    int a,b,c;
    public float avg(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        int d=(a+b+c)/3;
        return d;
    }

    public static void main (String[] args){

        average obj=new average();
        System.out.println(obj.avg(25,46,65));

    }


}
