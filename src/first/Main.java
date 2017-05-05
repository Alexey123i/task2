package first;

/**
 * Created by Alexey on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(110,10);
        Visitor v = new Counter();
        car.accept(v,1000);
    }
}
