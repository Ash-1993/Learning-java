package Demo_005;
import java.util.Scanner;
public class Dec_43 {
    public static void main(String[] arg){

        // i want the program in which user input is required
        // in the 1 to 100 numbers if number is divisible by 3 then print Swami
        //if the number is divisible by 5 the print samarth
        //or if number is multiply by both 3 and 5 then print swami samarth
        //else print no.as it is.

        //rought program-

       // take user input , add scanner for int , take print statement , for loop , condition and end of the program

        Scanner number = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int a= number.nextInt();

        for(int i=1; i<=a;i++){
            if((i%3==0)&& (i%5==0)){
                System.out.println("swami samarth");}
            else if (i%3==0){
                System.out.println("swami");}
            else if (i%5==0){
                System.out.println("samrath");}
            else{
                System.out.println(i);}
            }

              number.close();
        }






    }

