package polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class LandRover extends Car {

    public LandRover(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "LandRover -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "LandRover -> accelerate()";
    }

    @Override
    public String brake() {
        return "LandRover -> brake()";
    }
}

class Toyota extends Car {

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}




class AnotherMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Highlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        LandRover landRover = new LandRover(12, "Sport LandRover");
        System.out.println(landRover.startEngine());
        System.out.println(landRover.accelerate());
        System.out.println(landRover.brake());

        Toyota toyota = new Toyota(12, "Sequoia");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());


        }

}