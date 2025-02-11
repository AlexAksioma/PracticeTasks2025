package functional_interfaces;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer, String> function = integer -> {
            if (integer < 0)
                return "-------";
            else
                return "+++++++++";
        };
        System.out.println(function.apply(-1));
        System.out.println(function.apply(10));
    }
}
