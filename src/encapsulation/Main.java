package encapsulation;

// offers improved validation opportunities and improved maintainability
// only public instance methods can access instance attributes
// by making fields they are no longer accessible from outside classes
// method names need not expose the actual attribute names of that class so they therefore cannot be accessed or manipulated
// confinement and protect members and methods of a class to prevent unauthorized access

public class Main {

    public static void main(String[] args) {
//        Player player = new Player("Johnny", 100, "Valyrian Steel Sword");
//        System.out.println("Initial Health is " + player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }

}
