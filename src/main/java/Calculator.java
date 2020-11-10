import java.util.Scanner;

public class Calculator {
    public static IntPair scan2Numbers() {
        System.out.println("int型 xとyを入力してください。");
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        return new IntPair(x, y);
    }

    public static int plusXY(IntPair intPair) {
        return intPair.getX() + intPair.getY();
    }

    public static void printPlusXY() {
        System.out.println(plusXY(scan2Numbers()));
    }

    public static int minusXY(IntPair intPair) {
        return intPair.getX() - intPair.getY();
    }

    public static void printMinusXY() {
        System.out.println(minusXY(scan2Numbers()));
    }

    public static int timesXY(IntPair intPair) {
        return intPair.getX() * intPair.getY();
    }

    public static void printTimesXY() {
        System.out.println(timesXY(scan2Numbers()));
    }

    public static IntPair calculateQAndR(IntPair intPair) {
        int remainder = intPair.getX() % intPair.getY();
        int quotient = (intPair.getX() - remainder) / intPair.getY();
        return new IntPair(quotient, remainder);
    }

    public static void printCalculateIntPair() {
        IntPair intPair = scan2Numbers();
        IntPair QAudR = calculateQAndR(intPair);
        System.out.println("x+y = " + plusXY(intPair) + ", x-y = " + minusXY(intPair) + ", x*y = "
                + timesXY(intPair) + ", x/y = " + QAudR.getX() + "..." + QAudR.getY());
    }
    public static int calculateAverage(IntPair intPair){
        return (intPair.getX()+intPair.getY())/2;
    }
    public  static  void printAverageXY(){
        System.out.println(
                calculateAverage(scan2Numbers())
        );
    }
}
