package Demo_003;
import java.util.Scanner; // import the Scanner class
public class Dec_31 {

    public static void main(String[] args){
            Scanner myObj = new Scanner(System.in);
            String userName;

            // Enter username and press Enter
            System.out.println("Enter username");
            userName = myObj.nextLine();

            System.out.println("Username is: " + userName);
        }
    }

