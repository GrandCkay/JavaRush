package ua.gfg.javarush.JavaRush.OldLevel;

public class Solution {
    public static void main(String[] args) {
        Protoss[] protosses = new Protoss[3];
        Terran[] terrans = new Terran[4];
        Zerg[] zergs = new Zerg[5];

        for (int i = 0; i < protosses.length; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = "Protoss";
            if (i != 0) {
                protosses[i].name = "Protoss" + (i + 1);
            }
            System.out.println(protosses[i].name);
        }

        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "Terran";
            if (i > 0) {
                terrans[i].name = terrans[i].name + (i + 1);
            }
            System.out.println(terrans[i].name);
        }

        for (int i = 0; i < zergs.length; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "Zerg";
            if (i >= 1) {
                zergs[i].name = zergs[i].name + 0 + i;
            }
            System.out.println(zergs[i].name);
        }
    }
}

class Protoss {
    public String name;
}

class Terran {
    public String name;
}

class Zerg {
    public String name;
}