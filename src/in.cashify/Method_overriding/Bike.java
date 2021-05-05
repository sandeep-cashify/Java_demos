package in.cashify.single_inheritance.Method_overriding;

public class Bike extends Vehical{
            public  void  run(){
                System.out.println("Bike is running.");
            }

            public static void main(String[] args) {
                Bike b= new Bike();
                b.run();
            }
        }

