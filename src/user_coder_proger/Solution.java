package user_coder_proger;

   /*     Напишем программу, которая определит, чем заняться тому или иному человеку.
        Для этого нужно:
        Ввести [в цикле] с клавиатуры несколько строк (ключей).
        Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
        Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
        Для каждой введенной строки нужно:
        Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
        Передать этот объект в метод doWork.
        Написать реализацию метода doWork, который:
        Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
        Вызывает метод doNothing(), если person имеет тип Loser.
        Вызывает метод writeCode(), если person имеет тип Coder.
        Вызывает метод enjoy(), если person имеет тип Proger.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
       public static void main(String[] args) throws Exception {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           Person person = null;
           String key = null;

           while(true) {
           key = reader.readLine();
                if (key.equals("user")) {
                person = new Person.User();
                }
             else  if (key.equals("loser")) {
                   person = new Person.Loser();
               }
             else  if (key.equals("coder")) {
                   person = new Person.Coder();
               }
              else if (key.equals("proger")) {
                   person = new Person.Proger();
               } else {
                  break;
                }
               doWork(person);
           }
       }

       public static void doWork(Person person) {
           if (person instanceof Person.User) {
               ((Person.User) person).live();
           }
           if (person instanceof Person.Coder) {
               ((Person.Coder) person).writeCode();
           }
            if (person instanceof Person.Loser){
               ((Person.Loser) person).doNothing();
           }
           if (person instanceof Person.Proger){
               ((Person.Proger) person).enjoy();
           }
       }
   }


