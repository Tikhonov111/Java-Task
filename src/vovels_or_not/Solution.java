package vovels_or_not;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//        Написать программу, которая вводит с клавиатуры строку текста.
//        Программа должна вывести на экран две строки:
//        1. первая строка содержит только гласные буквы из введённой строки.
//        2. вторая - только согласные буквы и знаки препинания из введённой строки.
//        Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        char[] wordToCharArray = word.toCharArray();

        for (int i = 0; i < wordToCharArray.length; i++) {
            if ( isVowel(wordToCharArray[i])) {
                System.out.print(wordToCharArray[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < wordToCharArray.length; i++) {
            if ( !isVowel(wordToCharArray[i]) && (wordToCharArray[i] != ' ')) {
                System.out.print(wordToCharArray[i] + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
