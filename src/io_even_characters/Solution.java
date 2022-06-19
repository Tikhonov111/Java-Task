package io_even_characters;

//                 Cчитать с консоли 2 имени файла.
//                 Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1)
//
//                 Программа должна считывать имена файлов с консоли (используй BufferedReader).
//                 •	BufferedReader для считывания данных с консоли должен быть закрыт.
//                 •	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
//                 •	Поток чтения из файла (FileReader) должен быть закрыт.
//                 •	Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
//                 •	Поток записи в файл (FileWriter) должен быть закрыт.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        String sourceFileName = reader.readLine();       
        String destinationFileName = reader.readLine();

        FileReader fileReader = new FileReader(sourceFileName);
        FileWriter fileWriter = new FileWriter(destinationFileName);


        while (fileReader.ready())

        {
            int data = fileReader.read();
             list.add(data);
        }

        for (int i = 1; i < list.size(); i = i + 2) {
            fileWriter.write(list.get(i));
        }

           reader.close();
           fileWriter.close();
           fileReader.close();
    }
}
