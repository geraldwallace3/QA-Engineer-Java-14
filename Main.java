public class Main {
    public static void main(String[] args) {
        Dog basker = new Dog("Баскер");
        Dog rex = new Dog("Рекс");
        Cat matroskin = new Cat("Матроскин");
        Cat begemot = new Cat("Бегемот");
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Белый");
        cats[1] = new Cat("Черный");
        cats[2] = new Cat("Рыжий");

        Bowl bowl = new Bowl(10);
        for (Cat cat: cats) {
            cat.setHungry();
            cat.eat();
            bowl.decreaseKitekat(5);
            System.out.println("Количество еды в миске: " + bowl.getKitekat());
            bowl.addKitekat(10);
            System.out.println("Количество еды в миске: " + bowl.getKitekat());
            System.out.println("Кот " + cat.getName() + " голоден: " + cat.hungry());
            System.out.println();
        }



        begemot.run(100);
        matroskin.swim(250);
        basker.run(400);
        rex.swim(8);
        System.out.println("Общее количество животных: " + Animals.getCountAnimals());
        System.out.println("Кошек: " + Cat.getCountCat());
        System.out.println("Собак: " + Dog.getCountDog());
    }
}