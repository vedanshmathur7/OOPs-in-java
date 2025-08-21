import java.util.*;
public class Q_areas_switch_cases {

public static double rectangle_area(double len, double breadth) {
    return len*breadth;
}
public static double circle_area(double radius) {
    return 3.14*radius*radius;
}
public static double triangle_area(double base, double height) {
    return 0.5*base *height;
}


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you wanna find the area of: ");

        String shape = sc.next();

        switch (shape){
            case "rectangle" :
                System.out.println("len: ");
                double len = sc.nextDouble();
                System.out.println("breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("The area is: "+rectangle_area(len, breadth) +"m");
                break;

            case "circle" :
                System.out.println("radius: ");
                double radius = sc.nextDouble();
                System.out.println("The area is: "+circle_area(radius) +"m");
                break;

            case "triangle" :
                System.out.println("base: ");
                double base = sc.nextDouble();
                System.out.println("height: ");
                double height = sc.nextDouble();
                System.out.println("The area is: "+triangle_area(base, height)+"m");
                break;

            default:
                System.out.println("rajesh ki ghanti");
        }

        System.out.println("thanks for wasting your time with us!");
        sc.close();

    }
}
