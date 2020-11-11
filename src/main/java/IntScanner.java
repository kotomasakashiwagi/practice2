
import java.util.Scanner;

public class IntScanner {
    //２数字のスキャン
    public static IntPair scan2Numbers() {
        System.out.println("int型 xとyを入力してください。");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            return new IntPair(x, y);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public static int scanInt() {//Int１文字のスキャン
        System.out.println("int型　数字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        try{
            return Integer.parseInt(scan.next());
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }

    }

    public static String scanWord() { //１文字をスキャン
        System.out.println("文字xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return String.valueOf(scan.next());
    }

    //年齢のスキャン
    public static int scanAges() {
        System.out.println("int型 xを入力してください。");
        Scanner scan = new Scanner(System.in);
        try{
            int x = Integer.parseInt(scan.next());
            if(x>=0){
                return x;
            }else {throw new IllegalArgumentException();}
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }
    }
}
