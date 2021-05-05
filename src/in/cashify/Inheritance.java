package in.cashify;

public class Inheritance extends Animals {
    Inheritance(){
        super.run();
       System.out.println("Child class constructor");
    }
    public void eat(){
        System.out.println("Dog also eating");
    }
    public static void main(String[] agrs){
        Inheritance I= new Inheritance();
      //  I.run();
        I.eat();
    }

}


