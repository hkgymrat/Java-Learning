class MyCircle{
    private int r;
    private double area;
    private double perimeter;
    public void setRadius(int radius){
        r = radius;
    }
    public int getRadius(){
        return r;
    }
    public void setArea(double a){
         area = a ;
    }
    public double getArea(){
        area = 3.14*r*r;
        return area;
    }
    public void setPerimeter(double i){
        perimeter = i;
    }
    public double getPerimeter(){
        perimeter = 2*3.14*r;
        return perimeter;
    }
}
public class Access_Modifier {
    public static void main(String[] args) {
        MyCircle Ci = new MyCircle();
        Ci.setRadius(5);
        Ci.setArea(5.0);
        Ci.setPerimeter(5.0);
        System.out.println(Ci.getArea());
        System.out.println(Ci.getPerimeter());
    }
}
