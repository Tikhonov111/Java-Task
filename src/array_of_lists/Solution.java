package array_of_lists;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }


    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
              ArrayList<String> [] result = new ArrayList[2];

              ArrayList<String> list = new ArrayList<>();
              ArrayList<String> list2 = new ArrayList<>();

              list.add("hellacopters");
              list.add("victory or die");

              list2.add("fresh blood");
              list2.add("tired vampires");

            result[0] =  list;
            result[1] =  list2;

            return result;
    }


    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }

}
