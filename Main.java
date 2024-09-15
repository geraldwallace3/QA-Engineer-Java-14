public class Main {
    public static void main(String[] args) {
        Employee[] company = new Employee[5];
        company[0] = new Employee("Начальник Начальников", "Руководитель", "bigboss@gmail.com", "1000",200000,50);
        company[1] = new Employee("Зам Замов", "Заместитель руководителя", "boss@gmail.com", "1001",150000,39);
        company[2] = new Employee("Инж Инженеров", "Инженер", "engineer@gmail.com", "3000",100000,45);
        company[3] = new Employee("Работяга Работягов", "Сотрудник", "redneck@gmail.com", "3010",50000,30);
        company[4] = new Employee("Клин Клинингов", "Уборщик", "janitor@gmail.com", "4321",30000,47);
    }
}
