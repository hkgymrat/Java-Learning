class Circle {
    int r;
    public float area() {
        return 3.14f * r * r;
    }

    public float circumference() {
        return 2 * 3.14f * r;
    }
}
public class practice{
    public static void main(String[] args) {
        Circle ci = new Circle();
         ci.r = 5;
        System.out.println(ci.area());
        System.out.println(ci.circumference());
    }
}
