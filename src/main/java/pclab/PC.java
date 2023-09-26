package pclab;

class PC {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixel(50, 50, "Blue"); // Example values for x, y, and color
    }

    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(pcCase);
        System.out.println(monitor);
        System.out.println(motherboard);
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        pcCase.pressPowerButton();
        motherboard.loadProgram("Photoshop");
    }
}