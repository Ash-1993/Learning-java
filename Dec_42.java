package Demo_005;

public class Dec_42 {
    public static void main(String[] args) {

        /* write program for print no.1 to 100.for multiple of 3 print fizz instead of number
        and for the multiple of 5 print buzz and for multiple of both 3 and 5 print FizzBuzz.
         */
        //this program is to print all numbers so no scanner is required here


        for (int i = 1; i <= 100; i++) {

            if ((i%3==0) && (i%5==0)) {
                System.out.println("Fizzbuzz");
            }
             else if (i%3==0){
                System.out.println("Buzz");
            } else if (i%5==0) {
                System.out.println("Fizz");}
                else {
                    System.out.println(i);
                }
            }
        }
    }




