package order_alphabetical;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Программа должна считывать значения с клавиатуры.
//        •	Класс Solution должен содержать три метода.
//        •	Метод main() должен вызывать метод sort().
//        •	Метод sort() должен вызывать метод isGreaterThan().
//        •	Выведенные слова должны быть отсортированы в алфавитном порядке.


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
       for (int i = array.length - 1; i > 0 ; i--) {
           for(int j = 0; j < i; j++) {
               String temp = null;
               if (isGreaterThan(array[j], array[j + 1])) {
                  temp = array[j];
                  array[j]  = array[j + 1];
                  array[j + 1] = temp;
               }
           }
       }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
