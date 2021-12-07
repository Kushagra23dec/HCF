 class HCF {
    private int a;
    private int b;

    HCF(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void HCFFinder() {

        System.out.println("Finding HCF of " + a +" and "+ b);
//        for(int i = 1; i<a/2; i++){
//
//            if(a%i==0){
//                System.out.print(" " + i);
//            }
//
//        }
//        System.out.println(" ");
//        for(int j = 1; j<b/2; j++){
//
//            if(b%j==0){
//                System.out.print(" " + j);
//            }
//
//        }

         int c = a, rm;
//        for(int x  = 2; x<a/2 ; x++){
//
//               if(c%x==0){
//
//                   rm = c/x;
//
//                   System.out.println(x);
//                   if(rm%x == 0){
//                       System.out.println(x);
//                   }
//
//                   if((rm/x)%x == 0){
//                       System.out.println(x);
//                   }
//
//               }


//
//        for(int x  = 2; x<a/2 ; x++) {
//            for (int t = 2; t < a / 2; t++) {
//
//                if (c % x == 0) {
//                    c = c / x;
//                    System.out.print(" " + x);
//                }
//            }
//        }







//            if(c%x==0){
//
//                rm = c/x;
//
//                System.out.println(x);
//                if(rm%x == 0){
//                    System.out.println(x);
//                }
//
//                if((rm/x)%x == 0){
//                    System.out.println(x);
//                }




//            System.out.println(c);


//            System.out.println( );


        int i,j=1;
        for(i=2;i<=b;i++){

            if(b%i==0 && a%i==0){
                j= i;
            }
        }
        System.out.println(j);


    }

}
    class Main {
        public static void main(String args[]) {
            HCF h = new HCF(48, 30);

            h.HCFFinder();
        }
    }

