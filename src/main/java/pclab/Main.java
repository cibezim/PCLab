package pclab;

public class Main {
    public static void main(String[] args) {
        Dimension caseDimensions = new Dimension(40, 20, 5);
        Case pcCase = new Case("MacBook Pro", "Apple Inc", "500W", caseDimensions);

        Resolution monitorResolution = new Resolution(2000, 1000);
        Monitor monitor = new Monitor(monitorResolution, "MacBook Pro", "Apple Inc");

        Motherboard motherboard = new Motherboard("M2 Chip", "Apple Inc", 4, 2, "BIOS Version 1.0");

        PC myPC = new PC(pcCase, motherboard, monitor);

        myPC.description();
        myPC.powerUp();
    }
}



