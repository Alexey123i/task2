package first;

/**
 * Created by Alexey on 05.05.2017.
 */
public interface Visitor {
    public void visit(Car car, double length);
    public void visit(Bicycle bicycle, double length);
    public void visit(Carriage carriage, double length);
}