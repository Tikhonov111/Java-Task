package orderliness_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

 /* 1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 1; i < list.size(); ) {
            if (list.get(i).length() > list.get(i - 1).length()) {
                i++;
            } else {
                System.out.print(i);
                break;
            }
        }
    }
}