package Demo_003;

public class Dec_25 {

    public static void main (String[] args){

        String S1=" I got a new job ";//string pool
        String S3="I got a new job";//string pool area

        Boolean u= S1==S3;
        System.out.println(u);
        System.out.println(S1.equals(S3));


        String B1 = String.valueOf(S1.length());

        System.out.println(B1);
        System.out.println(S1.toUpperCase());
        System.out.println(S1.toLowerCase());

        String S2= new String("I got a new job");//HEAP AREA OR object area
        System.out.println(S2);

        Boolean f=S1==S2;
        System.out.println(f);

        String G=S1+S2;
        System.out.println(G);

        Boolean L=S1!=S2;
        System.out.println(L);

        System.out.println(S1.equalsIgnoreCase(S2));









    }
}
