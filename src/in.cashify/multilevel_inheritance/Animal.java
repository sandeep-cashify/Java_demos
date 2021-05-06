package in.cashify.multilevel_inheritance;

public class Animal extends Human{
Human(){
    super.display();

}

    Animal(int i, String name) {
        super(i, name);
    }

    public void show_id(){
        super.display();
        System.out.println("Animal also have id");
    }

    public static void main(String[] args) {
        Animal A1=new Animal();
        A1.display();
    }
}
