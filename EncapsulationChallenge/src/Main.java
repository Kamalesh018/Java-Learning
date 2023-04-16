public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinter = printer.printPages(5);
        System.out.printf("current job pages: %d, printed total : %d %n",
                pagesPrinter,printer.getPagesPrinted());

        pagesPrinter = printer.printPages(10);
        System.out.printf("current job pages: %d, printed total : %d %n",
                pagesPrinter,printer.getPagesPrinted());
    }
}