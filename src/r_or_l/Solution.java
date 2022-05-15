package r_or_l;

import java.util.ArrayList;
import java.util.List;

    /*    1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
        2.1. удалять из списка строк все слова, содержащие букву "р"
        2.2. удваивать все слова содержащие букву "л".
        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        2.4. с другими словами ничего не делать.
    */

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            String x = list.get(i);

            if (x.contains("р") && x.contains("л")) {
                i++;
            } else if (x.contains("л")) {

                list.add(i, list.get(i));
                i = i + 2;
            } else if (x.contains("р")) {

                list.remove(list.get(i));
            } else {
                i++;
            }
        }
        return list;
    }
}
