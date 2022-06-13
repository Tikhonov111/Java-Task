package singleton;
import java.util.Scanner;


/*
   В отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
   Реализовать интерфейс Planet в классах Sun, Moon, Earth.
   В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
   Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
   для этого считай с консоли один параметр типа String.
   если он равен одной из констант интерфейса Planet,
   создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
*/

public class Solution {
    public static void main(String[] args) {
    }

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();

        if (key.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (key.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (key.equals(Earth.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
        scanner.close();
    }
}
