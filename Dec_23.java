package Demo_003;

public class Dec_23 {

    public static <equals> void main(String[] args){

        String a = "ASHWINI";
        String b= new String("ASHWINI");

        // String Constant Pool - SCP / String Pool-String a value store in scp
        //new Operator - Object- a2 value store in string object pool

        System.out.println(a);
        System.out.println(new String("ASHWINI"));
       System.out.println(b) ;


        boolean g = a==b;
        System.out.println(g) ;

        boolean j= ( a!= b);
        System.out.println(j) ;

        Boolean k = a==b || b!=a ;
        System.out.println(k) ;







    }
}
