public class MainApplication {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.2);
        c1.setRadius(5.0);
        c2.setRadius(3.2);
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Circumference: " + c1.circum());
        System.out.println("Area: " + c1.area());
        System.out.println();
        System.out.println(c2);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Circumference: " + c2.circum());
        System.out.println("Area: " + c2.area());
        System.out.println();
        Cylinder y1 = new Cylinder(4.0, 10.0);
        Cylinder y2 = new Cylinder(2.5, 5.0);
        y1.setRadius(4.0);
        y1.setHeight(10.0);
        y2.setRadius(2.5);
        y2.setHeight(5.0);
        System.out.println(y1);
        System.out.println("Radius: " + y1.getRadius());
        System.out.println("Height: " + y1.getHeight());
        System.out.println("Surface Area: " + y1.surfaceArea());
        System.out.println("Volume: " + y1.volume());
        System.out.println();
        System.out.println(y2);
        System.out.println("Radius: " + y2.getRadius());
        System.out.println("Height: " + y2.getHeight());
        System.out.println("Surface Area: " + y2.surfaceArea());
        System.out.println("Volume: " + y2.volume());
    }
}