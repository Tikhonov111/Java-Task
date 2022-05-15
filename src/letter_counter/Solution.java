package letter_counter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//        Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
//        Результат выведи на экран в алфавитном порядке.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        int count = 0;
        String string = "";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            string += list.get(i);
        }

        char[] stringToCharArray = string.toCharArray();

        for (char c : alphabet) {
            map.put(c, 0);
        }

        for (char c : alphabet) {
            for (int i = 0; i < stringToCharArray.length; i++) {
                if (c == stringToCharArray[i]) {
                    count++;
                    map.put(c, count);
                }
            }
            count = 0;
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            Character key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            System.out.println(key + " " + value);
        }
    }
}







