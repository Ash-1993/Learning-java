package Demo_004;
import java.util.Scanner;
public class Dec_35 {

    public static void main(String[] args){

        //grade calculator
        //90_100-A
        //80-89-B
        //70-79-C
        //60-69-D
        //1-59-F

        //int- numbers , garde-string

        //else if

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();


if (a>90 && a<100){
    System.out.println('A');
}else if (a>80 && a<89){
    System.out.println('B');
}else if (a>70 && a<79){
    System.out.println('C');
    }
      else  {
    System.out.println('F');
}

    }


}
