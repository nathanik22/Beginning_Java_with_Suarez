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
    public boolean isVertical(Point other)
    {
        if (x == other.x)
        {
            return true;
        } else
        {
            return false;
        }
    }
    public double slope(Point other)
    {
        return (double)(other.y-y)/(other.x-x);
    }
    public int manhattanDistance(Point other)
    {
        return (Math.abs(other.x-x) + (other.y - y));
    }
    public boolean isCollinear(Point p1, Point p2)
    {
        if (x == p1.x && x == p2.x)
        {
            return true;
        }
        else if ((double) Math.round(slope(p1)*10000)/10000 == (double) Math.round(slope(p2)*10000)/10000)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
