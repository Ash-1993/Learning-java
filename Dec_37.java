package Demo_004;
import java.util.Scanner;
public class Dec_37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //user inputs for x,y and z

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double S = x*x ;
        double T = y*y ;
        double R= Math.abs(z);

        System.out.println(Math.cbrt(S+T-R));

    }
}
