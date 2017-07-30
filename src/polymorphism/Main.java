package polymorphism;

// the #plot method always returns the correct output pertaining to that object
// assigning different functionality depending on the object created, inherited from base movie class but unique functionality

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    public String plot(){
        return "Aliens invade earth";
    }
}

class Matrix extends Movie {
    public Matrix(){
        super("Matrix");
    }

    @Override
    public String plot() {
        return "A digital reality apocalyptic masterpiece";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces battle with the Rebel Alliance.";
    }
}


class ForgettableMovie extends Movie {
    public ForgettableMovie(){
        super("Forgettable Movie");
    }

    // plot not overridden
}

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot());
        }


    }

    public static Movie randomMovie(){
    int randomNumber = (int) (Math.random() * 5) + 1; // random number between 1 and 5
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Matrix();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}
