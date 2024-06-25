public class password {



    public  void passwordcheck() {
        String pass="abcdef34";

        for(int i=0;i<pass.length();i++) {
            char ch = pass.charAt(i);

            System.out.println("condition 1");

            if (pass.length() >= 8 && pass.length() <= 30) {

                System.out.println("condition 2");

                if( ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){

                    System.out.println("condition 3");




                }
            }

        }


    }




    public static void main(String[] args){
           password obj=new password();
           obj.passwordcheck();
    }


}
