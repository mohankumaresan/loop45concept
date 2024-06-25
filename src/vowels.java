public class vowels {

    //char a[]={'a','e','i','o','u'};
    String word = "aeiou";
    String vowels = "aeiou";
//    int p = b.length();
//
//    public void show() {
//        int j = 0;
//        int count = 0;
//        for (int i = 0; i < p; i++) {
//            if (b.charAt(j) == z.charAt(i)) {
//                count++;
//
//            }
//        }
//    }

                //   System.out.println(":for");
                //   if (b.charAt(j) == a[i]) {
                //      System.out.println("if");
                //      count++;
                //      j++;
                //   }
                //}
                //  System.out.println("number of vowels in the string" + count);

                // }
            public static void main(String[] args)
            {
                vowels  vov = new vowels();
                var word =vov.word;
                var vowels = vov.vowels;
                Integer count = 0;

                for(int i = 0;i<word.length();i++){
                    for(int j = 0;j<vowels.length();j++){
                        if(word.charAt(i) == vowels.charAt(j)){
                            count++;
                        }
                    }

                }
                System.out.println(count);
            }



}