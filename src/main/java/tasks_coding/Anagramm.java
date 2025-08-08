package tasks_coding;

import java.util.Arrays;

public class Anagramm {
    public static void main(String[] args) {
        System.out.println(isAnagram("abcd","cbad"));
        System.out.println(isAnagram("abcd","zbad"));
        System.out.println(isAnagram("abcd","cbad1"));
    }

    //abcd     cbad

    static boolean isAnagram(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        return Arrays.equals(array1, array2);
    }
}
