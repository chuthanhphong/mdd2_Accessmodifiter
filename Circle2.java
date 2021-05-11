public class Circle2 {
    private double radius =1.0;
    private String color = "Red";
        Circle2(){};
        Circle2(double r){

        }

    private double getRadius(double radius) {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    private double getarea(double radius){
            return  radius*Math.PI;
    }
}
class Testcircle{
    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        double radius = 3.0;
        circle.getarea(radius);
        circle.getRadius(radius);
        System.out.println(circle.getarea(radius) + " "+  circle.getRadius(radius));
    }
}