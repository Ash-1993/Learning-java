package Demo_006;

public class Jan_48 {

    static void btringcompare() {
        System.out.println("check static method");}

    public void stringequal() {
        System.out.println("Check non static method");}

    public static void main(String[]args){
        btringcompare();//static method can call without an object

        //create object to call public method

        Jan_48 myobj=new Jan_48(); // class.object=new class
        myobj.stringequal();//object.methodname();


    }
}
