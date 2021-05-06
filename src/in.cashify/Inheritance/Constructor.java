package in.cashify.Inheritance;

public class Constructor {
    int id;
    String name;
    Constructor(int i,String s){
        id=i;
        name=s;
        System.out.println(id+" "+name);
    }
    void display(){
        System.out.println("id value is--" + id+" "+name);
    }
    public static void main(String[] args){
        Constructor c=new Constructor(100,"Sandeep");
        //c.display();
        //System.out.println("Example of Constructor");
    }
}
