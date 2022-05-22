package chickenFactory;

public class BelarusHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 138;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
