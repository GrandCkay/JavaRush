package ua.gfg.javarush.JavaSyntax.OldLevel;


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int top) {
        this.top = top;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    //    public void initialize(int top, int left, int width, int height) {
//        this.top = top;
//        this.left = left;
//        this.width = width;
//        this.height = height;
//    }
//
//    public void initialize(int top, int left) {
//        this.top = top;
//        this.left = left;
//    }
//
//    public void initialize(int top, int left, int width) {
//        this.top = top;
//        this.left = left;
//        this.width = width;
//        this.height = width;
//    }
//
//    public void initialize(Rectangle rectangle) {
//        this.top = rectangle.top;
//        this.left = rectangle.left;
//        this.width = rectangle.width;
//        this.height = rectangle.height;
//    }

}
