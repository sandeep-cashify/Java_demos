package in.cashify;

public class Inheritance extends Animals {

    public void eat(){
        System.out.println("Dog also eating");
    }
    Inheritance(){
        //this.run();
        System.out.println("Child class constructor");
    }
    public static void main(String[] agrs){
        Inheritance I= new Inheritance();
      //  I.run();
        I.eat();
    }

}


