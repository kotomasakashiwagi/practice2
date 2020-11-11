public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで問題番号である必要があります。");
            //System.exit(1);//０が正常終了０以外が異常終了
        } else if (args[0].equals("2-1")) {
            WordPrinter.printWord();
        } else if (args[0].equals("2-2")) {
            try {
                WordPrinter.printInt();
            } catch (NumberFormatException e) {
                System.err.println("整数を入力してください。");
            }
        } else if (args[0].equals("2-3")) {
            try {
                WordPrinter.printExponentiation();

            } catch (NumberFormatException e) {
                System.err.println("整数を入力してください。");
            }

        } else if (args[0].equals("2-4")) {
            try {
                WordPrinter.printCalculateIntPair();
            } catch (NumberFormatException e) {
                System.err.println("整数を入力してください。例:2 4");
            }
        } else if (args[0].equals("2-5")) {
            try {
                WordPrinter.printAverageXY();
            } catch (NumberFormatException e) {
                System.err.println("整数を入力してください。例:2 4");
            }

        } else if (args[0].equals("2-6")) {
            try {
                WordPrinter.printDays();

            } catch (NumberFormatException e) {
                System.err.println("整数を入力してください。例:2 4");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

        } else {
            System.err.println("問題番号を指定してください。");
        }
    }
}
