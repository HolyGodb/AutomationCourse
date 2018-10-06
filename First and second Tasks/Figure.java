public class Figure {
    public double FindArea(double Value) {
        return Value * Value;
    }

    public int FitInFigure(double areaOfCircleWithoutPi, double areaOfSquare) {
        double circleRadius = Math.sqrt(areaOfCircleWithoutPi);
        double squareSideLength = Math.sqrt(areaOfSquare);

        if (2 * circleRadius <= squareSideLength) {
            return 0;
        } else if (2 * circleRadius >= squareSideLength * Math.sqrt(2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
