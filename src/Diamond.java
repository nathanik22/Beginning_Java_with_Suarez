/*
Kaden Nathani
Make a Diamond using two methods
March 25, 2019
Ver1
 */
public class Diamond {
    public static void main( String[] args){

        Top();diamondMethodReverse();diamondMethodReverse();diamondMethodReverse();diamondMethodReverse();Bot();
        System.exit(0);

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
        System.out.println("  / \\");
        System.out.println(" /   \\");
        System.out.println("/     \\");

    }
    public static void Bot() //Defining the Bottom of Diamond with println statements
    {
        System.out.println("\\     /");
        System.out.println(" \\   /");
        System.out.println("  \\ /");
    }

}
