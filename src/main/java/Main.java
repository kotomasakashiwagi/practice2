public class Main {
    public static void main(String[] args) {
        if (args[0].equals("2-1")) {
            WordPrinter.printWord();
        }
        if (args[0].equals("2-2")) {
            WordPrinter.printInt();
        }
        if (args[0].equals("2-3")) {
            WordPrinter.printExponentiation();
        }
        if (args[0].equals("2-4")) {
            Calculator.printCalculateIntPair();
        }
        if (args[0].equals("2-5")) {
            Calculator.printAverageXY();
        }
        if (args[0].equals("2-6")) {
            DaysCalculator.printDays();
        }
    }
}
