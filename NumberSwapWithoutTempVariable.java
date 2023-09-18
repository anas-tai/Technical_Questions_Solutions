public class NumberSwapWithoutTempVariable {
    public static void swapNumbers(int a, int b) {
        System.out.println("Numbers before swap: a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swap: a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        swapNumbers(a, b);
    }
}
