class A{
    String name;
    int id;
    A(){
        System.out.println("This is Constructor");
    }
     void display(){
        System.out.println("This is display function");
     }
}

public class Test{
    public static void main(String[] args) {
        A obj =  new A();
        obj.display();
    }
}