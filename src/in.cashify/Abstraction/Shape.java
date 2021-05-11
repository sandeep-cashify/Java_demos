package in.cashify.Abstraction;

public abstract class Shape {
    abstract void draw();
    void draw(int i){
        System.out.println("Draw line");
    }
}
class circle extends Shape{
    void draw(){
        this.draw(1);
        System.out.println("draw circle");
    }

    public static void main(String[] args) {
//        Shape cir=new Shape() {
//            @Override
//            void draw() {
//        System.out.println("Abstract area");
//
//            }
//        };
        Shape c=new circle();
        c.draw();
    }
}
