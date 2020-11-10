import java.util.Scanner;

public class WordPrinter {
    public static String scanWord() { //１文字をスキャン
        System.out.println("文字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return String.valueOf(scan.next());
    }

    public static void printWord() {//一文字の出力
        System.out.println(scanWord());
    }

    public static void printInt() {//Intの出力
        System.out.println(scanInt());
    }

    public static int scanInt() {//Int１文字のスキャン
        System.out.println("数字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.next());
    }

    public static int exponentiation2(int x) {//２乗の計算
        return (int) Math.pow(x, 2);
    }

    public static int exponentiation3(int x) {//３乗の計算
        return (int) Math.pow(x, 3);
    }

    public static int exponentiation4(int x) {//４乗の計算
        return (int) Math.pow(x, 4);
    }

    public static void printExponentiation() {//２乗３乗４乗の出力
        int x = scanInt();
        System.out.println("x=" + x + " , " + "xの２乗：" + exponentiation2(x) + " , " + "xの3乗:" +
                exponentiation3(x) + " , " + "xの4乗:" + exponentiation4(x));
    }


}
