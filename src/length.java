
public class length {

    String a = "35";
    int n=a.length()%2;
    int r = a.length()/2;
    public void oddoreve(){
        if(a.length()%2==0){
            System.out.println("length of string is even"+a.charAt(r));
        }
        else{
            System.out.println("length of string is odd"+a.charAt(r)+""+a.charAt(r+1));

        }

    }
   public static void main(String[] args)
   {
       length obj1=new length();
       obj1.oddoreve();

   }



}
