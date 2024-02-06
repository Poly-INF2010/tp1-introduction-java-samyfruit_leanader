package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    final static double xCoord = 15.0;
    final static double yCoord = 71.0;

    final static double coordZero = 0.0;
    final static Double[] vector1 = {-15.0, 0.0};

    final static  Double[] vector2 = {15.0, 0.0};
    final static double angle = Math.toRadians(10);

    public static Rectangle createRectangle() {
        return new Rectangle(halfStripeThickness, maxHeight);
    }

    public static void translatePointsRectangle(Rectangle r,  Double[] vector) {
        for (Point2d pointDD : r.getCoords()) {
            pointDD.translate(vector);
        }
    }

    public static void rotatePointsRectangle(Rectangle r,  Double angle) {
        for (Point2d pointDD : r.getCoords()) {
            pointDD.rotate(angle);
        }
    }


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle r1 = createRectangle();
        Rectangle r2 = createRectangle();
        Rectangle r3 = new Rectangle(stripeThickness, halfStripeThickness);


        Double[] vector3 = {coordZero, -xCoord/2};

        rotatePointsRectangle(r1, angle);
        translatePointsRectangle(r1, vector1);

        rotatePointsRectangle(r2, -angle);
        translatePointsRectangle(r2, vector2);

        translatePointsRectangle(r3, vector3);

        return r1.add(r2).add(r3);
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight - halfStripeThickness);
        BaseShape c1 = new Circle(halfMaxHeight).remove(new Circle(halfMaxHeight/2));
        BaseShape c2 = new Circle(halfMaxHeight).remove(new Circle(halfMaxHeight/2));


        Point2d p1 = new Point2d(stripeThickness*1.7, -halfMaxHeight/2);
        Point2d p2 = new Point2d(stripeThickness*1.7, halfMaxHeight/2);

        c1.translate(c1.getCoords(), p1);
        c2.translate(c2.getCoords(), p2);

        return r1.add(c1).add(c2);
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        Point2d p1 = new Point2d(stripeThickness*1.3, coordZero);
        rectangle.translate(rectangle.getCoords(), p1);
        return create_O().remove(rectangle);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle r1 = createRectangle();
        Rectangle r2 = new Rectangle(stripeThickness, halfStripeThickness);
        Rectangle r3 = new Rectangle(stripeThickness*2, halfStripeThickness);
        Rectangle r4 = new Rectangle(stripeThickness*2, halfStripeThickness);

        Point2d p = new Point2d(xCoord, coordZero);
        Point2d p2 = new Point2d(xCoord, yCoord);
        Point2d p3 = new Point2d(xCoord, -yCoord);

        r2.translate(r2.getCoords(), p);
        r3.translate(r3.getCoords(), p2);
        r4.translate(r4.getCoords(), p3);


        return ((r1.add(r2)).add(r3)).add(r4);

    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle r1 = createRectangle();
        Rectangle r2 = createRectangle();
        Rectangle r3 = new Rectangle(stripeThickness, halfStripeThickness);


        translatePointsRectangle(r1, vector1);
       
        translatePointsRectangle(r2, vector2);

        return r1.add(r2).add(r3);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle r1 = createRectangle();
        Rectangle r2 = createRectangle();
        Rectangle r3 = createRectangle();

        translatePointsRectangle(r1, vector1);
        
        translatePointsRectangle(r2, vector2);

        rotatePointsRectangle(r3, -angle);


        return r1.add(r2).add(r3);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new Ellipse(maxWidth, maxHeight).remove(new Ellipse(halfMaxWidth, maxHeight/1.5));
    }
}
