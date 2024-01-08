package Demo_007;

public class Jan_57 {

    //string builder and string buffer
    //both are mutable we can change string builder as string buffer and viceversa
    //strings are not mutable
    //lets take example create string builder

    public static void main(String[]args){

        StringBuilder sbr=new StringBuilder("Ashwini");
        sbr.append("Patil");
        System.out.println(sbr);
    }
}

