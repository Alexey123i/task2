package first;

/**
 * Created by Alexey on 05.05.2017.
 */
public class Car extends Vehicle {
    public Car(double speed, double price) {
        setSpeed(speed);
        setPrice(price);
    }

    @Override
    public void accept(Visitor v, double length) {
        v.visit(this, length);
    }
}
