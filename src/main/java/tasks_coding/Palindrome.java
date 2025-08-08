package tasks_coding;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome_WO_reverse("Was it a car or a cat I saw"));
    }

    //str only English letters, 1<=str.length<10^5
    //A man, a plan, a canal: Panama   Was it a car or a cat I saw
    static Boolean isPalindrome_reverse(String str) {
        if (str == null || str.isBlank() || str.length() > Math.pow(10, 5))
            return null;
        if (!str.matches("[a-zA-Z\\s]+"))
            return null;
        str = str.trim().toLowerCase().replaceAll(" ", "");
        System.out.println(str);
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    //str only English letters, 1<=str.length<10^5
    //A man, a plan, a canal: Panama   Was it a car or a cat I saw
    static Boolean isPalindrome_WO_reverse(String str) {
        if (str == null || str.isBlank() || str.length() > Math.pow(10, 5))
            return null;
        if (!str.matches("[a-zA-Z\\s]+"))
            return null;
        str = str.trim().toLowerCase().replaceAll(" ", "");
        System.out.println(str);
        char[] array = str.toCharArray();
        /*
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
        }
        System.out.println(stringBuilder.toString());
        return str.equals(stringBuilder.toString());
        */

        //wasitacar o racatxisaw
        // for (int i = 0, j = array.length - 1; i < (array.length - 1) / 2 || j >= (array.length - 1) / 2; i++, j--) {
        for (int i = 0, j = array.length - 1; i < (array.length - 1) / 2 && j >= 0; i++, j--) {
            System.out.println(array[i] + "=" + array[j]);
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
