package overriding;

import static java.lang.System.out;

public class Base {

    public static void main(String[] args){

    }

    public void sayHello(String name){
        String output = String.format("this is base %s", name);
        System.out.println(output);
    }

}
