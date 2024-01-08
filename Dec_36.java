package Demo_004;
import java.util.Scanner;
public class Dec_36 {
    public static void main(String[] args){

        //Switch - repeated conditions
        //same syntax as a scanner
        //do switch program for week days
        //Sunday-1 , monday-2,tuesday-3,wnsday -4,thirsday-5, friday-6,saturday-7

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(); // sc.new Scanner(System.in);

        switch(day){

            case 1 :
             System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
         case 3:
             System.out.println("wens");
            break;
        case 4:
            System.out.println("thirsday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("saturday");
            break;
        case 7:
            System.out.println("sunday");
        break;
        default:
        System.out.println("i dont know");}


        }
    }

