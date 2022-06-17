package english_letters;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//        В метод main первым параметром приходит путь к файлу.
//        Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
//        Вывести на экран число (количество символов).
//        Закрыть потоки.

public class Solution {
    public static byte[] english = new byte[] {'A', 'E', 'I', 'O', 'U', 'Y', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z','a','b','c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args)  throws FileNotFoundException, IOException {

        FileInputStream inputStream = new FileInputStream(new File(args[0])); // файл приходит первым аргументом
        int count = 0;
        //System.out.println(english[0]);
        while (inputStream.available() > 0) {
            int data = inputStream.read();

            if (isEnglish((byte) data)) {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }

    public static boolean isEnglish (byte c) {
        // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (byte d : english) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
