public class PersonalComputer extends Product {
    private Computercase computercase;
    private Monitor monitor;
    private  Motherboard motherboard;

    public PersonalComputer(String model, String manufactuer, Computercase computercase, Monitor monitor, Motherboard motherboard) {
        super(model, manufactuer);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp() {
        computercase.pressPowerButton();
        drawLogo();
    }

//    public Computercase getComputercase() {
//        return computercase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
