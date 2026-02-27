
import java.util.Scanner;

// You need to develop a module for a graphics application that manages different 
// shapes using an interface. Implement classes for shapes (e.g., Circle, Rectangle, 
// Triangle) and use an interface for common methods like draw() and getArea(). 
interface Shape{
    void show();
    double getArea();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }
    
    public void show(){
        System.out.println("Drawing circle with radius: "+radius);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double breath;

    public Rectangle(double length,double breath) {
        this.breath=breath;
        this.length=length;
    }
    
    public void show(){
        System.out.println("Drawing recatngle with length: "+length+" breath: "+breath);
    }
    public double getArea(){
        return length*breath;
    }
}
class Triangle implements Shape{
    private double height;
    private double base;

    public Triangle(double height,double base) {
        this.base=base;
        this.height=height;
    }
    
    public void show(){
        System.out.println("Drawing triangle with height: "+height+" base: "+base);
    }
    public double getArea(){
        return 0.5*height*base;
    }
}
public class P4_ShapeMgmt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("if you want to print circle enter : 1 or rectangle enter 2 : or Triangle 3 : if you want to close enter 0 ");
            int val = sc.nextInt();
            if (val == 0){
                break;
            }
            switch(val){
                case 1:
                    System.out.println("Enter a raduis");
                    int radius = sc.nextInt();
                    Shape circle = new Circle(radius);
                    circle.show();
                    System.out.println("Area of circle is: "+circle.getArea()+"\n");
                    break;
                case 2:
                    System.out.println("Enter a length");
                    int len = sc.nextInt();
                    System.out.println("Enter a breath");
                    int bre = sc.nextInt();
                    
                    Rectangle rect = new Rectangle(len, bre);
                    rect.show();
                    System.out.println("Area of Rectanle is: "+rect.getArea()+"\n");
                    break;
                case 3:
                    System.out.println("Enter a height");
                    int hei = sc.nextInt();
                    System.out.println("Enter a breath");
                    int breath = sc.nextInt();
                    
                    Triangle tri = new Triangle(hei, breath);
                    tri.show();
                    System.out.println("Area of Triangle is: "+tri.getArea()+"\n");
                    break;
                
            
            }
        }
    }
}
