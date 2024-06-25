public class countvaluetwo {



    public void  countvalue()
    {
        int count=0;
        String a="2";
        Integer numb= 12521;
        String[] arr = numb.toString().split("");
        for (int i = 0; i < arr.length; i++){

            if(arr[i].equals(a))
            {
                count++;

            }

        }
        System.out.println("the value"+count);

    }

    public static void main(String[] args){
        countvaluetwo obj=new countvaluetwo();
        obj.countvalue();
    }

}
