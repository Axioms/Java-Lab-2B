public class runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon(8);
        Octagon o2 = (Octagon) o1.clone();

        System.out.println("Are o1 and o2 the same? " +(o1.compareTo(o2) != 0));

        System.out.println("o1 area: " + String.format("%.2f", o1.area()));
        System.out.println("o2 area: " + String.format("%.2f", o2.area()));

        System.out.println("o1 perimeter: " + String.format("%.2f", o1.perimeter()));
        System.out.println("o2 perimeter: " + String.format("%.2f", o2.perimeter()));
    }
}
