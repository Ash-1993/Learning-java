package Demo_006;
//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
public class jan_49 {

    public void fullThrottle(){ //method created
        System.out.println("The car is going fast as it can");}

        public void speed(int a){//method created
            System.out.println("max speed is: 200");}

    public static void main(String[]args){//main method

        jan_49 mycar=new jan_49();//car object is created
        mycar.fullThrottle();//fullthrottle method is called

        mycar.speed(200);//speed is called


        }
    }

