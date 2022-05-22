package chickenFactory;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 111;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
