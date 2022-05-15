package another_hash_map;

//        Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//        Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


       // Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            int x = Integer.parseInt(s);

            if (s.isEmpty()) {
                break;
            }
            String str = reader.readLine();
            map.put(str, x);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
