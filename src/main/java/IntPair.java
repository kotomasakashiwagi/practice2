public class IntPair {
    private final int x;
    private final int y;

    IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    //equalsメソッドのオーバーライド
    @Override
    public boolean equals(Object intPair) {
        if (intPair == this) {
            return true;
        }
        if (intPair instanceof IntPair) {
            IntPair intPair1 = (IntPair) intPair;
            return (this.x == intPair1.x) && (this.y == intPair1.y);
        }
        return false;
    }
}
