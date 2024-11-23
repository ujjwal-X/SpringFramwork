class Parent{
     public  void add(){
        System.out.println("i am from parent class");
    }
}

class Child extends Parent{

    public void add(){
        System.out.println("i am from parent class");
    }
}

public class Main {
    public static void main(String[] args){

        Parent p1 = new Parent();
        Parent p2= new Child();

        Child c1 = new Child();

        c1.add();

    }
}
