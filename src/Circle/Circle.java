package Circle;

public class Circle {
    public final double PI = 3.14;
    public static int Radius = 5;

    public double Sum = PI * Radius * Radius; //нестатичный метод
    public double Average = PI * 2 * Radius;

    public void display() {

        System.out.println("Нестатичный метод: " + Sum);
        System.out.println("Статичный метод: " + Average);
    }
}
