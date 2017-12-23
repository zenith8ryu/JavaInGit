package yard;

public class YardCalculator
{
    //Instance variables go here.
    double length;
    double width;
    double footToMeter = 0.3048;
    
    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard
     * @param theWidth the width of the yard
     */
    public YardCalculator(double theLength, double theWidth)
    {
        this.length = theLength * footToMeter;
        this.width = theWidth * footToMeter;
    }

    /**
     * Gets the perimeter of the yard
     * @return the perimeter
     */
    public double perimeter()
    {
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    /**
     * Gets the area of the yard
     * @return the area
     */
    public double area()
    {
        double area = length * width;
        System.out.print("s");
        return area;
    }

     /**
     * Gets the diagonal of the yard
     * @return the diagonal
     */
    public double diagonal()
    {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)) / footToMeter;
        return diagonal;
    }

}
