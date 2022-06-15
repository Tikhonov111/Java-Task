package sort_byte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

//        Ввести с консоли имя файла.
//        Считать все байты из файла.
//        Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
//        Вывести на экран.
//        Закрыть поток ввода-вывода.

public class Solution {
            public static void main(String[] args) throws IOException {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        Set<Integer> setByte =  new TreeSet<Integer>();

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            setByte.add(data);
        }

        for (Integer temp : setByte) {
            System.out.print(temp + " ");
        }

        inputStream.close();
    }
}
