import java.util.Scanner;

public class Calculator {
    //２数字のスキャン
    public static IntPair scan2Numbers() {
        System.out.println("int型 xとyを入力してください。");
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        return new IntPair(x, y);
    }
    //２数字の足し算
    public static int plusXY(IntPair intPair) {
        return intPair.getX() + intPair.getY();
    }

    public static void printPlusXY() {
        System.out.println(plusXY(scan2Numbers()));
    }
    //２数字のひき算
    public static int minusXY(IntPair intPair) {
        return intPair.getX() - intPair.getY();
    }

    public static void printMinusXY() {
        System.out.println(minusXY(scan2Numbers()));
    }
    //２数字の掛け算
    public static int timesXY(IntPair intPair) {
        return intPair.getX() * intPair.getY();
    }

    public static void printTimesXY() {
        System.out.println(timesXY(scan2Numbers()));
    }
    //２数字の商と余り
    public static IntPair calculateQAndR(IntPair intPair) {
        int remainder = intPair.getX() % intPair.getY();
        int quotient = (intPair.getX() - remainder) / intPair.getY();
        return new IntPair(quotient, remainder);
    }
    //2数字の四則演算を出力
    public static void printCalculateIntPair() {
        IntPair intPair = scan2Numbers();
        IntPair QAudR = calculateQAndR(intPair);
        System.out.println("x+y = " + plusXY(intPair) + ", x-y = " + minusXY(intPair) + ", x*y = "
                + timesXY(intPair) + ", x/y = " + QAudR.getX() + "..." + QAudR.getY());
    }
    //２数字の平均
    public static int calculateAverage(IntPair intPair){
        return (intPair.getX()+intPair.getY())/2;
    }
    //2数字の平均を出力
    public  static  void printAverageXY(){
        System.out.println(
                calculateAverage(scan2Numbers())
        );
    }
}
