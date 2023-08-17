package notkotl.descendingordermy;

import java.util.ArrayList;

public class Kata {
    static int descendingorder(int integer) {
        var str = String.valueOf(integer);
        var charArray = str.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (char l : charArray) {
            list.add(Integer.parseInt(String.valueOf(l)));
        }
        list.sort((d1, d2) -> d2 - d1);
        StringBuilder sb = new StringBuilder();
        for (var s : list) {
            sb.append(s);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(descendingorder(8978));
    }
}
