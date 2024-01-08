package Demo_005;

public class Dec_40 {

    public static void main(String[] args) {

        //want to write a program for find that 2000 is leap year or not leap year
        //what is leap year - so year /4 = and  year/100=0 or year/400=0 is a leap year
        //take input as a integer for year

        int year = 2000;

            if ((year % 4 == 0) && (year % 100 != 0 )||( year % 100 == 0 )&& (year % 400 == 0))
    {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }







    }
}
