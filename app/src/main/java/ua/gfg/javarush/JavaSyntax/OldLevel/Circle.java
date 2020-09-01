package ua.gfg.javarush.JavaSyntax.OldLevel;

public class Circle {
//    public double x;
//    public double y;
//    public double radius;
//
//    public Circle() {
//    }
//
//    public Circle(double x) {
//        this.x = x;
//    }
//
//    public Circle(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Circle(double x, double y, double radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }

//    private int centerX;
//    private int centerY;
//    private int radius;
//    private int width;
//    private int color;

    private double x;
    private double y;
    private double radius;

//    private double r;

    public Circle(double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y) {
        this(x, y,10);
    }

    public Circle() {
        this(5,5,1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);

    }

    //    public Circle(double x, double y, double r) {
//        this.x = x;
//        this.y = y;
//        this.r = r;
//    }
//
//    public Circle(int centerX, int centerY, int radius) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width, int color) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//        this.color = color;
//    }
    //    public void initialize(int centerX, int centerY, int radius) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//    }
//
//    public void initialize(int centerX, int centerY, int radius, int width) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//    }
//
//    public void initialize(int centerX, int centerY, int radius, int width, int color) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//        this.color = color;
//    }


//    public Color color;
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.color.setDescription("Red");
//        System.out.println(circle.color.getDescription());
//
//    }
//
//    public Circle() {
//        color = new Color();
//    }
//
//    public class Color {
//        String description;
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }
}
