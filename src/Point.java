public class Point
{
    private int x;
    private int y;

    public void SetX(int x1)
    {
        x = x1;
    }
    public void SetY(int y1)
    {
        y = y1;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    public void setLocation(int x1, int y1)
    {
        x=x1;
        y=y1;
    }
    public String toString()
    {
        return "Point =  ( " +x+" , "+y+" )";
    }
    public static double distance(Point p1, Point p2)
    {
        double varX = Math.pow(p1.x-p2.x, 2);
        double varY = Math.pow(p1.y-p2.y, 2);
        return Math.sqrt(varX + varY);
    }

}
