package double_strings_in_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//           Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//           Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//           Программа выводит содержимое нового списка на экран.


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            String s = "";
            if (strings.get(i).length() % 2 == 0) {
                s = strings.get(i) + " " + strings.get(i) + " " + strings.get(i);
                resultStrings.add(s);
            }
            else if (strings.get(i).length() % 2 != 0) {
                s = strings.get(i) + " " + strings.get(i);
                resultStrings.add(s);
            }
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
