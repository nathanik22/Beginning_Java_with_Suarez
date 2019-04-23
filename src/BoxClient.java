public class BoxClient
{
    public static void main(String[] args)
    {
        Box second = new Box();
        second.SetLength(1);
        second.SetWidth(1);
        second.calculateArea();
        System.out.println("The width of the box is "+second.getWidth());
        System.out.println("The length of the box is "+second.getLength());
        System.out.println("The area of the box is "+second.calculateArea());
        second.calculateVolume();

    }
}
