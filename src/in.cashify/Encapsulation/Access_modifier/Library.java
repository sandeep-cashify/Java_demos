package in.cashify.Encapsulation.Access_modifier;

public class Library {
    int A=20;
    Library(){
        System.out.println(A);
    }

    public static void main(String[] args) {

    }
}

class Book extends Library{
    public static void main(String[] args) {
        Book b=new Book();
        Library L=new Library();
        System.out.println(L.A);
    }

        }
