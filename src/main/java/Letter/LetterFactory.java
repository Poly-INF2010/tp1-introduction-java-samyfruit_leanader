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


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r3 = new Rectangle(stripeThickness, halfStripeThickness);

        Double[] v1 = {-15.0, 0.0};
        Double[] v2 = {15.0, 0.0};
        Double[] v3 = {0.0, -8.0};

        double angle = Math.toRadians(10);

        for (Point2d pointDD : r1.getCoords()) {
            pointDD.rotate(angle).translate(v1);
        }
        for (Point2d pointDD : r2.getCoords()) {
            pointDD.rotate(-angle).translate(v2);
        }

        for (Point2d pointDD : r3.getCoords()) {
            pointDD.translate(v3);
        }

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
        BaseShape OCreated = create_O();
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        Point2d p1 = new Point2d(stripeThickness*1.3, 0.0);
        rectangle.translate(rectangle.getCoords(), p1);
        return create_O().remove(rectangle);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r2 = new Rectangle(stripeThickness, halfStripeThickness);
        Rectangle r3 = new Rectangle(stripeThickness*2, halfStripeThickness);
        Rectangle r4 = new Rectangle(stripeThickness*2, halfStripeThickness);

        Double[] v1 = {-15.0, 0.0};
        Double[] v2 = {15.0, 0.0};
        Point2d p = new Point2d(15.0, 0.0);
        Point2d p2 = new Point2d(15.0, 71.0);
        Point2d p3 = new Point2d(15.0, -71.0);
        //a simplifie avec clone

        //r1.translate(r1.getCoords(), p.multiply(-8.0));

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
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r3 = new Rectangle(stripeThickness, halfStripeThickness);

        Double[] v1 = {-15.0, 0.0};
        Double[] v2 = {15.0, 0.0};

        for (Point2d pointDD : r1.getCoords()) {
            pointDD.translate(v1);
        }
        for (Point2d pointDD : r2.getCoords()) {
            pointDD.translate(v2);
        }

        return r1.add(r2).add(r3);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r3 = new Rectangle(halfStripeThickness, maxHeight);

        Double[] v1 = {-15.0, 0.0};
        Double[] v2 = {15.0, 0.0};

        double angle = Math.toRadians(-10);


        for (Point2d pointDD : r1.getCoords()) {
            pointDD.translate(v1);
        }
        for (Point2d pointDD : r2.getCoords()) {
            pointDD.translate(v2);
        }

        for (Point2d pointDD : r3.getCoords()) {
            pointDD.rotate(angle);
        }

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
