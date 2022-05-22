package bridges;

   /*     В этой задаче нужно:
        Создать интерфейс Bridge с методом int getCarsCount().
        Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
        Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
        Метод getCarsCount() должен возвращать различные значения для различных классов.
        В классе Solution создать публичный метод println(Bridge bridge).
        В методе println() вывести на консоль значение getCarsCount() для объекта bridge.
        Каждый класс и интерфейс должны быть в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}