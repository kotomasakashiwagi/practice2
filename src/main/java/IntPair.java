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

    public boolean equals(Object intPair) {
        if (intPair == this) {
            return true;
        }
        if (intPair instanceof IntPair) {
            IntPair testintPair = (IntPair) intPair;
            return (this.x == testintPair.x) && (this.y == testintPair.y);
        }
        return false;
        //return (this.x == intPair.x)&&(this.y == intPair.y);
    }
}
