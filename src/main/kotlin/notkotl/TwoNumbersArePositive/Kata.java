package notkotl.TwoNumbersArePositive;

public class Kata {

    public static boolean twoArePositive(int a, int b, int c) {
        int nop = 0;

        if (a > 0) nop++;
        if (b > 0) nop++;
        if (c > 0) nop++;
        return nop == 2;
    }
}