package counting_commas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

      /*
        Подсчет запятых
        С консоли считать имя файла.
        Посчитать в файле количество символов ',', количество вывести на консоль.
        Закрыть потоки.
      */

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        int count = 0;

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data == 44) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
        inputStream.close();
    }
}
