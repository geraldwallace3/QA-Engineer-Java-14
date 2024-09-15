public class Bowl {
    private int kitekat;
    public Bowl(int kitekat) {
        this.kitekat = kitekat;
    }

    public void decreaseKitekat(int amount) {
        if (kitekat>amount) {
            kitekat -= amount;
        } else {
            System.out.println("В миске мало еды");
        }
    }
    public void addKitekat(int amount) {
        if (amount>0) {
            kitekat += amount;
            System.out.println("В миску добавлено " + amount + " еды");
        }
    }

    public int getKitekat() {
        return kitekat;
    }
}

