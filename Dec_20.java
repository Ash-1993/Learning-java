package Demo_003;

public class Dec_20 {

    public static void main(String[] args) {


        //logical operator

        //! ,&& ,||

        int a = 10;
        int b = 29;
        int k = 88;

        //direct print the logical operators

        System.out.println(!(a > b) && (b > a));
        System.out.println(!(a > b) || (b > a));
        System.out.println(!(a > b) && (k > a));
        System.out.println(!(k > b) && !(b > k));
        //give statement by boolean
   boolean s=(!(a > b) && (b > a));
        System.out.println(s);

    }
}
