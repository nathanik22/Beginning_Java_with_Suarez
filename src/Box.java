import java.util.Scanner;

public class Box {
    private double length;
    private double width;

    public Box()
    {
        length = 1;
        width = 1;

    }

    public Box(double length1, double width1)
    {
        length = length1;
        width = width1;
    }
    public double calculateArea()
    {
        return length*width;
    }
    public double calculateVolume()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Height Below");
        double height = input.nextDouble();
        System.out.print("The volume is " +length*width*height);
        return length*width*height;

    }
    public void SetWidth(double width1)
    {
        width = width1;
    }
    public void SetLength(double length1)
    {
        length = length1;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }
}
