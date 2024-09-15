public class Animals {
    static int countAnimals = 0;
    Animals () {
        countAnimals++;
    }
    void run (int distance) {
        System.out.println("Животное пробежало " + distance + " м");
    }
    void swim (int distance) {
        System.out.println("Животное проплыло " + distance + " м");
    }
    void eat (int kitekat) {

    }
    public static int getCountAnimals() {
        return countAnimals;
    }
}
