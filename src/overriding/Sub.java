package overriding;

// inherits all variables and methods defined in base

public class Sub extends Base {

    public static void main(String[] args){
        Sub s = new Sub();
    }

    public Sub(){
        sayHello("Jaiye"); // calling sayHello from base
    }

    @Override
    public void sayHello(String name){
        System.out.println("Sub says this is your name " + name);
        super.sayHello("Someone else");
    }

}
