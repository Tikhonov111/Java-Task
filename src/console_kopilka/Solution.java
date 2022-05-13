package console_kopilka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//        Консоль копилка
//        Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
//        Вывести на экран полученную сумму.

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        try {
            while (true) {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            }
        } catch (NumberFormatException e) {
            for(Integer temp : list) {
                sum += temp;
            }
            System.out.println(sum);
        }
    }
}
