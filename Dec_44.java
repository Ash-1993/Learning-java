package Demo_005;

public class Dec_44 {
    public static void main(String[] args) {

        int a_arr[] = {12};
        String s_arr[] = {"ashwini"};

        System.out.println(a_arr[0]);
        System.out.println(s_arr[0]);

        float[] array = {12.3f, 23.4f, 22.6f, 38.90f};

        System.out.println(array[0]);
        System.out.println(array[3]);
        System.out.println(array[2]);

        int arr[][] = new int[2][5];
        int arr_2[][] = new int[2][5];

        int d_arr[][] = {{12, 23, 34, 45, 56},{14, 25, 35, 48, 57}};

        //initializing 2d array 0 to 4//for 1 st row

        arr[0][0] = 12;
        arr[0][1] = 23;
        arr[0][2] = 34;
        arr[0][3] = 45;
        arr[0][4] = 56;

        //initializing 2d array 0 to 4//for 2 nd row

        arr[1][0] = 14;
        arr[1][1] = 25;
        arr[1][2] = 35;
        arr[1][3] = 48;
        arr[1][4] = 57;


        for (int i = 0; i < d_arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {


                System.out.print(arr[i][j] + "\t ");
            }
            System.out.println();


        }


    }
}


