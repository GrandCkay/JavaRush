package ua.gfg.javarush.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

interface Defensable {
    BodyPart defense();
}

interface Attackable {
    BodyPart attack();
}

public class RobotBattleUpdate {
}

class Solution {
    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        boolean firstHit = random.nextBoolean();
        int num;

        Robot amigo = new Robot("Амиго");
        System.out.println("Ведите имя противника:");
        Robot enemy = new Robot(reader.readLine());


        if (firstHit) {
            num = 1;
        } else {
            num = 0;
        }
        Thread.sleep(1000);

        while (!AbstractRobot.knockout) {
            if (num == 1) {
                doMove(amigo, enemy);
                if (AbstractRobot.attackedBodyPart.equals(AbstractRobot.defendedBodyPart)) {
                    num = 0;
                }
            } else {
                doMove(enemy, amigo);
                if (AbstractRobot.attackedBodyPart.equals(AbstractRobot.defendedBodyPart)) {
                    num = 1;
                }
            }
            Thread.sleep(2000);
        }
        System.out.println(AbstractRobot.winner);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        String armCase = "руку";
        String legCase = "ногу";
        String headCase = "голову";
        String attackedString;


        if (AbstractRobot.hitCountAttack == AbstractRobot.hitCountDefense) {

            if (attacked.equals(BodyPart.ARM)) {
                attackedString = armCase;
            } else if (attacked.equals(BodyPart.HEAD)) {
                attackedString = headCase;
            } else {
                attackedString = legCase;
            }

            System.out.println(String.format("%s(%sHP) атаковал %s(%sHP), удар в %s заблокирован",
                    robotFirst.getName(), robotFirst.healthyStart, robotSecond.getName(), robotSecond.healthyStart, attackedString));

        } else {
            AbstractRobot.healthyAfter = robotSecond.healthyStart - AbstractRobot.attackedPart;
            System.out.println(String.format("%s(%sHP) атаковал %s(%sHP), УДАР ПРОШЕЛ! Атакована %s, защищена %s, -%sHP у \"%s\"",
                    robotFirst.getName(), robotFirst.healthyStart, robotSecond.getName(), robotSecond.healthyStart, attacked, defenced,
                    AbstractRobot.attackedPart, robotSecond.getName()));
            robotSecond.healthyStart = AbstractRobot.healthyAfter;


            if (AbstractRobot.healthyAfter <= 0) {
                AbstractRobot.knockout = true;

                AbstractRobot.winner = robotFirst.name + " мощьным ударом отправляет "
                        + robotSecond.name + " в нокдаун. " + "Рефери отсчитывает время:" + "\n10...9...8...7...6...5"
                        + "...4...3...2...1...НОКАУТ!!!" + "\nФеерическая победа. Победитель - " + robotFirst.name.toUpperCase() + "!";
            }
        }
    }
}

class Robot extends AbstractRobot {
    public Robot(String name) {
        this.name = name;
        healthyStart = 100;
    }
}

abstract class AbstractRobot implements Attackable, Defensable {
    public static int healthyAfter;
    public static int hitCountAttack;
    public static int hitCountDefense;
    public static int attackedPart;
    public static boolean knockout = false;
    public static BodyPart attackedBodyPart;
    public static BodyPart defendedBodyPart;
    public static String winner;
    protected String name;
    protected int healthyStart;

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {
        hitCountAttack = (int) ((Math.random() * (5 - 1) + 1));

        if (hitCountAttack == 1) {
            attackedBodyPart = BodyPart.ARM;
            attackedPart = BodyPart.DAMAGE_ARM;
        } else if (hitCountAttack == 2) {
            attackedBodyPart = BodyPart.HEAD;
            attackedPart = BodyPart.DAMAGE_HEAD;
        } else if (hitCountAttack == 3) {
            attackedBodyPart = BodyPart.LEG;
            attackedPart = BodyPart.DAMAGE_LEG;
        } else if (hitCountAttack == 4) {
            attackedBodyPart = BodyPart.CHEST;
            attackedPart = BodyPart.DAMAGE_CHEST;
        }
        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        hitCountDefense = (int) ((Math.random() * (5 - 1) + 1));

        if (hitCountDefense == 1) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCountDefense == 2) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCountDefense == 3) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCountDefense == 4) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}

final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");
    final static int DAMAGE_LEG = 10;
    final static int DAMAGE_HEAD = 20;
    final static int DAMAGE_ARM = 5;
    final static int DAMAGE_CHEST = 15;


    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
