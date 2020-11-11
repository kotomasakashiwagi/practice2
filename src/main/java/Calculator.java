import java.util.Scanner;

public class Calculator {

    //２数字の足し算
    public static int plusXY(IntPair intPair) {
        return intPair.getX() + intPair.getY();
    }


    //２数字のひき算
    public static int minusXY(IntPair intPair) {
        return intPair.getX() - intPair.getY();
    }


    //２数字の掛け算
    public static int timesXY(IntPair intPair) {
        return intPair.getX() * intPair.getY();
    }

    //２数字の商と余り
    public static IntPair calculateQAndR(IntPair intPair) {
        int remainder = intPair.getX() % intPair.getY();
        int quotient = (intPair.getX() - remainder) / intPair.getY();
        return new IntPair(quotient, remainder);
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

    //２数字の平均
    public static int calculateAverage(IntPair intPair) {
        return (intPair.getX() + intPair.getY()) / 2;
    }

    //生きた日数
    public static int times365(int x) {
        return x * 365;
    }
}
