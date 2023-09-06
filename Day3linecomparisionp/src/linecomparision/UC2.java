package linecomparision;

public class UC2 {
    public static void main(String[] args) {
        double x1=2;
        double x2=3;
        double y1=2;
        double y2=3;
        System.out.println("Enter the x-coordinate of the first point: ");
        System.out.println("Enter the x-coordinate of the first point: ");
        System.out.println("Enter the y-coordinate of the Second point: ");
        System.out.println("Enter the y-coordinate of the second point: ");
        double p1=4;
        double p2=5;
        double q1=4;
        double q2=5;
        System.out.println("Enter the p-coordinate of the first point: ");
        System.out.println("Enter the p-coordinate of the first point: ");
        System.out.println("Enter the q-coordinate of the Second point: ");
        System.out.println("Enter the q-coordinate of the second point: ");
        double length_of_line_1 = Math.sqrt((Math.pow(x2-x1,2)+(Math.pow(y2-y1,2))));
        double length_of_line_2 = Math.sqrt((Math.pow(p2-p1,2)+(Math.pow(q2-q1,2))));
        String check_equal ;
        if(length_of_line_1==length_of_line_2)
        {
            check_equal="Equal";
        }else
        {
            check_equal="Not Equal";
        }
        System.out.printf("The Both length of the line is "+check_equal+".");
    }
}
