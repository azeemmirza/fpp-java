package Laboratory04.Problem42_44;

import Laboratory04.Problem42_44.ClosedCurve.*;

public class Problem42 {
    public static void main(String[] args) {

        ClosedCurve[] objects = {
                new Triangle(4,5,6),
                new Square(3),
                new Rectangle(3, 7),
                new Circle(3),
        };

        //compute areas
        for(ClosedCurve cc : objects) {
            String className = cc.getClass().getSimpleName();

            System.out.println("The area of this " + className + " is " + cc.computeArea());
        }
    }
}
