public class Main {
    public static void main(String[] args) {
        int initialAmount = 100_26;
        int refill = 1150_24;
        int balance;
        int bonus = 0_00;
        if (refill >= 1100_00) {
            bonus = refill / 100_00;
            balance = initialAmount + refill + bonus;
        } else {
            balance = initialAmount + refill;
        }
        System.out.println("Ваш баланс: " + balance);
        System.out.println("Бонус: " + bonus);
    }
}
