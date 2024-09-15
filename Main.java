public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attractions a1 = new Park.Attractions("A1","9:00-20:00",500);
        Park.Attractions a2 = new Park.Attractions("A2","12:00-16:00",1000);
        System.out.println(a1.getTime());
        System.out.println(a2.getCost());

    }
}