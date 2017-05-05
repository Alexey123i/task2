package first;

/**
 * Created by Alexey on 05.05.2017.
 */
public abstract class Vehicle {
    public abstract void accept (Visitor v, double length);
    private double speed;
    private double price;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
