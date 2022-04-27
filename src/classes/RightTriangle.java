package classes;

public class RightTriangle extends Triangle {
    public RightTriangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public static boolean existsRightTriangle(float side1, float side2, float side3) {
        return (side1 > 0) && (side2 > 0) && (side3 > 0) && ((side1 * side1 + side2 * side2 == side3 * side3) || (side1 * side1 + side3 * side3 == side2 * side2) || (side2 * side2 + side3 * side3 == side1 * side1));
    }

    @Override
    public String toString() {
        return "Right " + super.toString();
    }
}
