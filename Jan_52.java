package Demo_006;

public class Jan_52 {
    public static void main(String[] args){
        //Display Sum of n Natural Numbers 0 to 1000
        //here sum means every number is added by plus 1
        //sum=natural number+1

        int sum=0;
        int a=1000;

        for(int i=1;i<=a;i++){

            sum+=i;

            System.out.println("Sum = " + sum);
        }


    }
}
