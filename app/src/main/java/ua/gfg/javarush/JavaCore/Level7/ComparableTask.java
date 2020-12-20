package ua.gfg.javarush.JavaCore.Level7;

public class ComparableTask {
}

class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("Paramount", 25.2f, 6);
        Beach beach2 = new Beach("Garden", 5.5f, 9);
        System.out.println(beach1.compareTo(beach2));
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
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

    @Override
    public synchronized int compareTo(Beach o) {
        int result = this.quality - o.quality;
        System.out.println("result " + result);
        // 2
        int i = Float.compare(o.distance, this.distance);


//        // 1
//        int i;
//        if (this.distance < o.distance) {
//            i = 1;
//        } else if (this.distance > o.distance) {
//            i = -1;
//        } else {
//            i = 0;
//        }

        System.out.println("i " + i);

        return result + i;
    }
}

