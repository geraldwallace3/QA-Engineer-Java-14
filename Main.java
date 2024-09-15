public class Main {
    public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Первый", "1111");
    phonebook.add("Второй", "2222");
    phonebook.add("Третий", "3333");
    phonebook.add("Четвертый", "4444");
    phonebook.add("Первый", "5555");
    phonebook.add("Второй", "6666");

        System.out.println(phonebook.get("Первый"));
        System.out.println(phonebook.get("Второй"));
        System.out.println(phonebook.get("Четвертый"));
    }
}