/*
Kaden Nathani
Make a House
March 25, 2019
Ver1
 */
public class House {
    public static void main( String[] args){

        diamondMethod();System.out.println(" ");diamondMethodReverse();System.out.println(" ");Top();Square();USA();Square();Top();System.exit(0);

    }
    public static void diamondMethod()   // Defining the Diamond with the other two methods
    {
        Top();Bot();
    }
    public static void diamondMethodReverse()
    {
        Bot();Top();
    }
    public static void Top() // Defining the Top of Diamond with println statements
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");

    }
    public static void Bot() //Defining the Bottom of Diamond with println statements
    {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
    public static void Square() //Defining the Square
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void USA() //Defining the Square
    {
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
    }
}
