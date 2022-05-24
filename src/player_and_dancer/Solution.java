package player_and_dancer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//        Класс Player должен реализовывать интерфейс Person.
//        Класс Dancer должен реализовывать интерфейс Person.
//        Метод haveFun() должен вызывать метод play() у переданного ему объекта, если объект является игроком (Player).
//        Метод haveFun() должен вызывать метод dance() у переданного ему объекта, если объект является танцором (Dancer).
//        Метод main() должен считывать данные с клавиатуры.
//        Метод main() должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {

        if (person instanceof  Player) {
          ((Player) person).play();
       }
       if (person instanceof Dancer) {
           ((Dancer) person).dance();
       }
    }


    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
