import java.util.Scanner;
public class WordPrinter {
    public static String scanWord(){
        System.out.println("文字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        String x = String.valueOf(scan.next());
        return x;
    }
    public static void printWord(){
        System.out.println(scanWord());
    }
    public static String scanInt(){
        System.out.println("数字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        return x;
    }
}
