/*
Kaden Nathani
Make a Diamond using two methods
March 26, 2019
Ver2
 */
public class Diamond2 {
    public static final int Size = 32;
    public static void main( String[] args){

        Top(); Bot();
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
        for (int counter = 1; counter <= Size; counter++) {
        for(int space = 1; space <= -counter+Size; space++)
        {
            System.out.print(" ");
        }
        System.out.print("/");
        for(int space = 1; space < counter; space++)
        {
            System.out.print("  ");
        }
        System.out.println("\\");

    }
//        System.out.println("  / \\");
//        System.out.println(" /   \\");
//        System.out.println("/     \\");

    }
    public static void Bot() //Defining the Bottom of Diamond with println statements
    {

        for (int counter = Size; counter > 0; counter--) {
            for(int space = 1; space <= -counter+Size; space++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int space = 1; space < counter; space++)
            {
                System.out.print("  ");
            }
            System.out.println("/");

//        System.out.println("\\     /");
//        System.out.println(" \\   /");
//        System.out.println("  \\ /");
    }

}}
