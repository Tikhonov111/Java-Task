package namesakes;

import java.util.HashMap;
import java.util.Map;

//        Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//        Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

public class Solution {

    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<String, String>();
        map.put("Рузвельт", "Теодор");
        map.put("Кеннеди", "Джон");
        map.put("Вашингтон", "Джордж");
        map.put("Снайдер", "Ди");
        map.put("Диллинежер", "Ди");
        map.put("Трамп", "Дональд");
        map.put("Линькольн", "Авраам");
        map.put("Теодор", "Рузвельт");
        map.put("Джефферсон", "Томас");
        map.put("Теди", "Рузвельт");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String tempo : map.values()) {
            if (tempo.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String nameTmp : map.keySet()) {
            if (nameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
