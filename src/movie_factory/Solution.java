package movie_factory;

     /*   Все классы должны быть внутри класса Solution.
        Добавить классы Cartoon, Thriller.
        Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
        Аналогично получению объекта SoapOpera сделать:
        добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
        добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
        Считать с консоли несколько ключей (строк).
        Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

        Создать переменную movie типа Movie и для каждой введенной строки (ключа):
        получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
        вывести на экран movie.getClass().getSimpleName().
     */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
