package Demo_006;

public class Jan_45
{
    String s="Ashwini";
    String b="Swapnil";

    public static void main(String[] source)
    {
//here how to create object - so mention class name followed by your object name then = new class name () ;
        //we can create multiple objects in single class
        //here due to void - print statements is needed to call object

        Jan_45 day=new Jan_45();
        System.out.println(day.s);

        Jan_45 day1=new Jan_45();
        System.out.println(day1.b);

        //we can call object of 1 class into a second class ,
        // for this create 2 class , in second  class define one object of a first class and call it in second class

        Vyoma.getStaticMethodName();

        Vyoma obj = new Vyoma();
        Vyoma.getNONStaticMethodName();

    }

}
class Vyoma {

    public static void getStaticMethodName()
    {
        System.out.println("This is static method");
    }

    public static void getNONStaticMethodName()
    {
        System.out.println("This is NON-static method");
    }
}


