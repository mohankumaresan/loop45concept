public class Smallestnumber{

    public void smallest(int a,int s,int d) {
        int q = a, e = s, t = d;
        if (t < q && t < e) {
            System.out.println("q is smallest number"+q);

        }

        if (e < q && e < t) {
            System.out.println("e is smallest number"+e);

        }
        if (q < e && q < t) {
            System.out.println("t is smallest number"+q);

        }
    }
    public  static void main(String[] args){

        Smallestnumber obj1=new Smallestnumber();

        obj1.smallest(25,37,28);
    }
}