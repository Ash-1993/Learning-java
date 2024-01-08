package Demo_007;

public class Jan_60 {
    public static void main(String[] args) {
        // we can change string builder as a string str and viceversa

        StringBuilder sbr = new StringBuilder("Vyoma");
        //now to change it as string buffer we have to create string object followed by tostring();
        String str = sbr.toString();

        StringBuffer sbb = new StringBuffer("sbr");
        System.out.println(sbr);


    }
}
