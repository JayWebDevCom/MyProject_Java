package encapsulation;

// offers improved validation opportunities and improved maintainability
// only public instance methods can access instance attributes
// by making fields they are no longer accessible from outside classes
// method names need not expose the actual attribute names of that class so they therefore cannot be accessed or manipulated
// confinement and protect members and methods of a class to prevent unauthorized access

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Johnny", 100, "Valyrian Steel Sword");
        System.out.println("Initial Health is " + player.getHealth());
    }

}
