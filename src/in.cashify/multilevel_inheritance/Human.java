package in.cashify.multilevel_inheritance;

public class Human {
    int human_id;
    String human_name;
    Human(int i, String name) {
        human_id = i;
        human_name = name;
    }
    public void display(){
        System.out.println("Human has id and name that are.." +human_id+" "+human_name);
    }

    public static void main(String[] args) {
        Human h=new Human(12,"Ravi");
        Human h1=new Human(12,"Ravi");
        h1.display();

    }

}
