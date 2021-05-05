package in.cashify;

public class Animals {
    public void run() {
        System.out.println("Dog is running");

    }
    Animals(){
        System.out.println("Also sleeping");
    }
    public static void main(String[] args) {
        Animals a=new Animals();
        //a.run();
        //System.out.println("Hello");
    }
}
