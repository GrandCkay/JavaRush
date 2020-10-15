package ua.gfg.javarush.JavaCore.Level4;

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}

public class HenFactoryHard {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
//        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    // "Я - курица." + " Моя страна - " + ". Я несу " + " яиц в месяц."

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
//            if (country.equals(Country.BELARUS)) {
//                hen = new BelarusianHen();
//            } else if (country.equals(Country.UKRAINE)) {
//                hen = new UkrainianHen();
//            } else if (country.equals(Country.RUSSIA)) {
//                hen = new RussianHen();
//            } else if (country.equals(Country.MOLDOVA)) {
//                hen = new MoldovanHen();
//            }

            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }

            return hen;
        }
    }
}

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}

class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
//        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
