public class Main {
    public static void main(String[] args) {
        Computercase theCase = new Computercase("2208","dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","acer",27,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("bj-200", "asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","dell",theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("windos os");
//        thePC.getComputercase().pressPowerButton();
        thePC.powerUp();
    }
}