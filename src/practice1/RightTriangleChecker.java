package practice1;

public class RightTriangleChecker {

    public static void main(String[] args) {
        System.out.println(isRightTriangle(3,4,6));
    }

    public static boolean isRightTriangle(double catheter1, double catheter2, double hypotenuse) {
        return ((catheter1 * catheter1 + catheter2 * catheter2) == (hypotenuse * hypotenuse)) ? true : false;
    }
}
