import java.util.Scanner;

public class main {
    static double Pi = Math.PI;

    public static void main(String args[]) {
        //Read values from the keyboard and create objects of classes
        Scanner in = new Scanner(System.in);
        Figure figure = new Figure();

        System.out.println("Enter the radius of the Circle: ");
        Circle circle = new Circle();
        circle.setRadiusOfCircle(in.nextDouble());

        System.out.println("Enter the length of the side of the Square: ");
        Square square = new Square();
        square.setLengthOfTheSide(in.nextDouble());

        //area of circle
        double areaOfCircle = Pi * circle.FindArea(circle.getRadiusOfCircle());
        //area of square
        double areaOfSquare = square.FindArea(square.getLengthOfTheSide());

        System.out.println("Area of circle:" + areaOfCircle);
        System.out.println("Area of square:" + areaOfSquare);

        switch (figure.FitInFigure(areaOfCircle / Pi, areaOfSquare)) {
            case 0:
                System.out.println("Circle fits in square.");
                break;
            case 1:
                System.out.println("Square fits in circle.");
                break;
            case 2:
            default:
                System.out.println("No one fits in another.");
                break;
        }
    }
}
