package functional_interfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        String str = "123";
        Supplier<Integer> supplier = () -> Integer.parseInt(str);
        System.out.println((supplier.get()+123));
    }
}
