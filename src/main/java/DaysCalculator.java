import java.util.Scanner;
public class DaysCalculator {
    //年齢のスキャン
    public static int scanAges() {
        System.out.println("int型 xを入力してください。");
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.next());
    }
    //おおよその生きた日数を計算
    public static int times365(int x){
        return x*365;
    }
    //おおよその生きた日数を出力
    public static void printDays(){
        System.out.println(times365(scanAges()));
    }
}
