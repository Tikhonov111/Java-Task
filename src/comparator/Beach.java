package comparator;

//        Реализуй интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботься,
//        чтобы все методы были синхронизированы.
//        Реализуй метод compareTo так, чтобы при сравнении двух пляжей он выдавал:
//        – положительное число, если первый пляж лучше;
//        – отрицательное число, если второй пляж лучше;
//        – ноль, если пляжи одинаковые.
//        Сравни каждый критерий по отдельности, чтобы победителем был пляж с лучшими показателями по большинству критериев.
//        Учти при сравнении, чем меньше расстояние к пляжу (distance), тем пляж лучше.


//                 	     Класс Beach должен содержать три поля: String name, float distance, int quality
//                       Класс Beach должен реализовывать интерфейс Comparable<Beach>.
//                       Метод compareTo класса Beach должен учитывать качество пляжа (quality) и дистанцию (distance).
//                       Все методы класса Beach, кроме метода main, должны быть синхронизированы.


public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public  synchronized   float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Beach o){
        int result = 0;
        int buff = 0;

        if(this.distance == o.distance){
            buff = 0;
        }
        if (this.distance < o.distance) {
            buff = 1;
         }

        if( this.distance > o.distance) {
            buff = -1;
        }

        if(this.quality== o.quality){
            buff+= 0;
        }
    if(this.quality < o.quality){
        buff -= 1;
    }
        if(this.quality > o.quality){
            buff += 1;
        }

    return buff;
    }
}