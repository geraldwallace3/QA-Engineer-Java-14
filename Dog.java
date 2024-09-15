public class Dog extends Animals {
    String name;
    static int countDog =0;
    Dog (String name) {
        super();
        countDog++;
        this.name = name;
    }
    void run (int distance) {
        if (distance>500) {
            System.out.println(name + " не может пробежать более 500 м");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }
    void swim (int distance) {
        if (distance>10) {
            System.out.println(name + " не может проплыть более 10 м");
        } else {
            System.out.println(name + " проплыл " + distance + " м");
        }
    }
    static int getCountDog() {
        return countDog;
    }
}
