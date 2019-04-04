public class Lanterns {
    public static final int Size =6;
    public static void main(String [] args)
    {
        Up();
        System.out.println(" ");
        Up();
        line();
        plate();
        Up();
    }
    public static void Up() {


        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
//        for (int counter = 1; counter <= Size; counter =counter+2)
//        {
//
//            for (int space = 1; space <= -counter + Size; space++)
//            {
//                System.out.print(" ");
//            }
//
//
//            System.out.print("*");
//            for (int space = 1; space < counter; space= space+2)
//            {
//                System.out.print("*");
//            }
//
//            for (int space = 1; space < counter; space= space+2)
//            {
//                System.out.print("*");
//            }
//            System.out.print("*****");
//
//            for (int space = 1; space < counter; space= space+2)
//            {
//                System.out.print("*");
//            }
//
//            for (int space = 1; space < counter; space= space+2)
//            {
//                System.out.print("*");
//            }
//
//            for (int space = 1; space <= -counter + Size; space= space+2)
//            {
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
    }
    public static void line()
    {
        System.out.print("*");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print(" |");
        }


        System.out.println(" *");

    }
    public static void plate()
    {
        System.out.print("*");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print("**");
        }


        System.out.println("**");
    }
}