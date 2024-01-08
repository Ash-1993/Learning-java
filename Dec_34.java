package Demo_004;
import java.util.Scanner;
public class Dec_34 {
    public static void main(String[] args) {
        //if , else if, else condition
        //user input= number -> >70 , <70 , <20

        Scanner ashwini = new Scanner(System.in);
        int number = ashwini.nextInt();

        if (number > 70) {

            System.out.println("number is > 70");
        } else if (number < 70) {
            System.out.println("number is<70");
        } else {
            System.out.println("number is <20");
        }
    }

}



