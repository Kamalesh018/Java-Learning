import static java.lang.Math.PI;

public class Main {
    public static double area(double radius) {
        if (radius <= 0) {
            return -1;
        }
        double areaOfCircle = radius * radius * Math.PI;
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if ((x < 0) && (y < 0)) {
            return -1;
        }
        double areaOfRectangle = x * y;
        return areaOfRectangle;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));;
    }
}