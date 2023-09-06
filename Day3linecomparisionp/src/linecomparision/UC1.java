package linecomparision;

public class UC1 {
    public static void main(String[] args)
    {
        double x1=2;
        double x2=3;
        double y1=2;
        double y2=3;
        System.out.println("Enter the x-coordinate of the first point: ");
        System.out.println("Enter the x-coordinate of the first point: ");
        System.out.println("Enter the y-coordinate of the Second point: ");
        System.out.println("Enter the y-coordinate of the second point: ");
        double length_of_line = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        System.out.printf("The length of the line is: " + length_of_line);
    }

}
