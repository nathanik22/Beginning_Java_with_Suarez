public class Challenge1 {
    public static final int Size = 6;

    public static void main(String[] args) {
        lineMethod();Up(); Down();lineMethod();Down();Up();lineMethod();
    }
    public static void lineMethod()
    {
        System.out.print("+-");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print("-");
        }
        System.out.print("---");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print("-");
        }
        System.out.println("-+");
    }
    public static void Up()
    {


            System.out.print("| ");
            for (int space = 1; space <= -1 + Size; space++)
            {
                System.out.print(" ");
            }
            System.out.print(" * ");
            for (int space = 1; space <= -1 + Size; space++)
            {
                System.out.print(" ");
            }
            System.out.println(" |");
        for (int counter = 1; counter <= Size; counter++)
        {
            System.out.print("| ");

            for(int space = 1; space <= -counter+Size; space++)

            {
                System.out.print(" ");
            }


            System.out.print("/");
            for(int space = 1; space < counter; space++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int space = 1; space < counter; space++)
            {
                System.out.print("\\");
            }
            System.out.print("\\");
            for(int space = 1; space <= -counter+Size; space++)
            {
                System.out.print(" ");
            }
            System.out.println(" |");
        }
    }
    public static void Down()
    {

        for (int counter = Size; counter > 0; counter--)
        {
            System.out.print("| ");

            for (int space = 1; space <= -counter + Size; space++) {
                System.out.print(" ");
            }


            System.out.print("\\");
            for (int space = 1; space < counter; space++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int space = 1; space < counter; space++) {
                System.out.print("/");
            }
            System.out.print("/");
            for (int space = 1; space <= -counter + Size; space++) {
                System.out.print(" ");
            }
            System.out.println(" |");
        }
        System.out.print("| ");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print(" ");
        }
        System.out.print(" * ");
        for (int space = 1; space <= -1 + Size; space++)
        {
            System.out.print(" ");
        }
        System.out.println(" |");
    }
}

