package Demo_003;

public class Dec_24 {

    //concatination of strings

    public static void main(String[] args){

        int a=23;
        int b=34;
        String s1="Ashwini";
        String s2="Vyoma";

        String d= a+b+s1+s2;
        System.out.println(d);

        String h= a+(b+s1)+s2;
        System.out.println(h);

        String j=(s1+s2+(a-b));
        System.out.println(j);

        String p=(s1+s2+(a*b));
        System.out.println(p);






    }
}
