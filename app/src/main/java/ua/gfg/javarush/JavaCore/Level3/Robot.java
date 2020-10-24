package ua.gfg.javarush.JavaCore.Level3;

interface Defensable {
    BodyPart defense();
}


interface Attackable {
    BodyPart attack();
}

public class Robot extends AbstractRobot {
//    private static int hitCount;
//    private String name;

    public Robot(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

//    public BodyPart attack() {
//        BodyPart attackedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1) {
//            attackedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 2) {
//            attackedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            attackedBodyPart = BodyPart.LEG;
//        }
//        return attackedBodyPart;
//    }

//    public BodyPart defense() {
//        BodyPart defendedBodyPart = null;
//        hitCount = hitCount + 2;
//
//        if (hitCount == 1) {
//            defendedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 2) {
//            defendedBodyPart = BodyPart.LEG;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            defendedBodyPart = BodyPart.ARM;
//        }
//        return defendedBodyPart;
//    }
}

abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            hitCount = -1;
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            hitCount = 2;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            hitCount = 2;
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            hitCount = 3;
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 1;
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.CHEST;
            hitCount = 0;
        }
        return defendedBodyPart;
    }
}

class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }

//    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
//        BodyPart attacked = robotFirst.attack();
//        BodyPart defenced = robotFirst.defense();
//        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
//                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
//    }
}

final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}