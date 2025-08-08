package tasks_coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> listInt = List.of(1,2,3,4,5,1,2,3,22);
        List<Integer> listInt1 = new ArrayList<>(listInt);
        listInt1.add(null);
        listInt1.add(null);
        System.out.println(listInt1);
        System.out.println(removeDuplicates(listInt1));
    }

    static List<Integer> removeDuplicates(List<Integer> list){
        if(list == null || list.isEmpty())
            return null;
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    //A - a
    static boolean hasUniqueChars(String str){
        char[] characters = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : characters){
            if(!set.add(ch)){
                return false;
            }
        }
        return true;
    }
}
