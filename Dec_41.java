package Demo_005;

public class Dec_41 {
    public static void main(String[] args) {

        //check the leap years in the given values
        //1900.1901,1902,1903,1904,1905,1906,1907,1908,1909,1910
        //here leap is- the value or year which is divisible by 4 and 100 or 400
        //define a array for above values
        //then condition and statement

        int i_array[] = {1900, 1901, 1902, 1903, 1904, 1905, 1906, 1907, 1908, 1909, 1910};

    //    for (int a = 0; a < i_array.length; a++)
            for (int a = i_array.length-1; a >= 0; a--)

            {
                System.out.print(i_array[a]);

            if (i_array[a] % 4 == 0)
            {
                if((i_array[a] % 100 != 0) || ((i_array[a] % 100 == 0) &&  (i_array[a] % 400 == 0)) )
                {
                    System.out.println(" leap year");
                    continue;
                }
            }

            System.out.println(" not a leap year");

        }

    }
}
