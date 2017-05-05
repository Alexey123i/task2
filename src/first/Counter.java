package first;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Alexey on 05.05.2017.
 */
public class Counter implements Visitor {
    @Override
    public void visit(Car car, double length) {
        double t =  length/car.getSpeed();
        double p = length*car.getPrice();
        double newt = new BigDecimal(t).setScale(3, RoundingMode.UP).doubleValue();
        System.out.println("Автомобиль. Время: "+newt+"; цена: "+p);
    }

    @Override
    public void visit(Bicycle bicycle, double length) {
        double t = length/bicycle.getSpeed();
        double p = length*bicycle.getPrice();
        System.out.println("Автомобиль. Время: "+t+"; цена: "+p);
    }

    @Override
    public void visit(Carriage carriage, double length) {
        double t = length/carriage.getSpeed();
        double p = length*carriage.getPrice();
        System.out.println("Автомобиль. Время: "+t+"; цена: "+p);
    }
}
