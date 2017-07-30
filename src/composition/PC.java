package composition;

// Composition is having objects within objects - a master object that manages and looks after other objects
// Favour composition ('is-a') over inheritance

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Fancy Graphics
       monitor.drawPixelAt(1200, 50, "orange");
    }
}
