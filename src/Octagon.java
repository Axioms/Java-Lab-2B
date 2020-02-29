import static java.lang.Math.sqrt;

public class Octagon extends GeometricObject implements Cloneable, Comparable  {

    public Octagon(int side){
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return (Octagon)super.clone();
    }
    @Override
    public int compareTo(Object o) {
        if(o instanceof Octagon) {
            if(((Octagon) o).getSide() == this.side) {
                return 1;
            }
        }
        return 0;
    }
    @Override
    public double area() {
        return (2+4/sqrt(2))*this.side*this.side;
    }

    @Override
    public double perimeter() {
        return this.side * 8;
    }
}
