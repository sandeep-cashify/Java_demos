package in.cashify.Abstraction;

public interface printable {
    void print();
}
class A implements printable {
    public void print() {
        System.out.println("Interface program 1");
    }
}
class A1 implements printable{
        public void print(){
            System.out.println("Interface program 2");
        }

    public static void main(String[] args) {
printable p=new A();
p.print();
    }}


