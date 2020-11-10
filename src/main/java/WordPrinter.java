import java.util.Scanner;

public class WordPrinter {
    public static String scanWord() {
        System.out.println("文字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return String.valueOf(scan.next());
    }

    public static void printWord() {
        System.out.println(scanWord());
    }

    public static void printInt() {
        System.out.println(scanInt());
    }

    public static int scanInt() {
        System.out.println("数字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.next());
    }

    public static int exponentiation2(int x) {
        return (int) Math.pow(x, 2);
    }

    public static int exponentiation3(int x) {
        return (int) Math.pow(x, 3);
    }

    public static int exponentiation4(int x) {
        return (int) Math.pow(x, 4);
    }

    public static void printExponentiation() {
        int x = scanInt();
        System.out.println("x=" + x + " , " + "xの２乗：" + exponentiation2(x) + " , " + "xの3乗:" +
                exponentiation3(x) + " , " + "xの4乗:" + exponentiation4(x));
    }


}
