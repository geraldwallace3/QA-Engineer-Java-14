public class Cat extends Animals {
    String name;
    boolean hungry;
    static int countCat = 0;
    Cat (String name) {
        super();
        countCat++;
        this.name = name;
        this.hungry = false;
    }
    public void eat() {
        if (hungry) {
            System.out.println(name + " поел");
            hungry = false;
        } else {
            System.out.println(name + " не голоден");
        }
    }
    public void setHungry() {
        hungry = true;
    }
    public boolean hungry() {
        return hungry;
    }
    public String getName() {
        return name;
    }
    void run (int distance) {
        if (distance>200) {
            System.out.println(name + " не может пробежать более 200 м");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }
    void swim (int distance) {
        System.out.println("Кот "+ name + " не умеет плавать");
    }
    static int getCountCat() {
        return countCat;
    }
}
