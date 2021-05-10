package in.cashify.Method_overloading;

public class Shape {
    void circle(int r){
        System.out.println("Draw circle 1");
    }
    void circle(int r, double dia){
        System.out.println("Draw circle 2");
    }
    void circle(double dia, int r){
        System.out.println("Draw circle 3");
    }
    void  circle(float r){
        System.out.println("Draw circle 4");
    }

    public static void main(String[] args) {
        Shape s=new Shape();
        s.circle(1,2.3);
    }
}
