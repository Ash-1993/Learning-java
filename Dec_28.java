package Demo_003;

public class Dec_28 {

    public static void main(String[] arg) {


        //Increment operator

        //++a,a++
        //++a=a+1
        //a++=a

        int Q = 10;
        int J = Q++;
        int K = ++Q;


        System.out.println(K);
        System.out.println(J);

        int b = 10;
        System.out.println(++b + b++);
        System.out.println(b);

        // A - ++b -> Exp - 11 , b -> 11
        // B - b++ -> Exp - 11 , b -> 12
        // A+B -> 22
        /// b -> 12


        // Decrement operator.

        int c = 10;
        System.out.println(--c + c--);
        System.out.println(c);

        // A -> --b - Exp -> 9 , b = 9
        // B -> b-- -> Exp -> 9 , b -> 8






    }
}
