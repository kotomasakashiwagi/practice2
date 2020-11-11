import java.util.Scanner;

public class WordPrinter {


    public static void printWord() {//一文字の出力
        System.out.println(IntScanner.scanWord());
    }

    public static void printInt() {//Intの出力
        System.out.println(IntScanner.scanInt());
    }




    public static void printExponentiation() {//２乗３乗４乗の出力
        int x = IntScanner.scanInt();
        System.out.println("x=" + x + " , " + "xの２乗：" + Calculator.exponentiation2(x) + " , " + "xの3乗:" +
                Calculator.exponentiation3(x) + " , " + "xの4乗:" + Calculator.exponentiation4(x));
    }
    //2数字の四則演算を出力
    public static void printCalculateIntPair() {
        IntPair intPair = IntScanner.scan2Numbers();
        IntPair QAudR = Calculator.calculateQAndR(intPair);
        System.out.println("x+y = " + Calculator.plusXY(intPair) + ", x-y = " +
                Calculator.minusXY(intPair) + ", x*y = "
                + Calculator.timesXY(intPair) + ", x/y = " + QAudR.getX() + "..." + QAudR.getY());
    }
    //2数字の平均を出力
    public  static  void printAverageXY(){
        System.out.println(
                Calculator.calculateAverage(IntScanner.scan2Numbers())
        );
    }
    //おおよその生きた日数を出力
    public static void printDays(){
        System.out.println(Calculator.times365(IntScanner.scanAges()));
    }

}
