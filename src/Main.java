public class Main {
    public static void main(String[] args) {
        int initialAccount = 150;
        int amountAddition = 1500;
        int bonus = 0;
        int resSum = 0;

        if (amountAddition >= 1000) {
            bonus = amountAddition / 100;
            resSum = initialAccount + amountAddition + bonus;
            System.out.println("Итогвый счёт " + resSum + " бонусные рубли = " + bonus);
        } else {
            resSum = initialAccount + amountAddition;
            System.out.println("Итогвый счёт " + resSum + " бонусы рубли = " + bonus);
        }
    }
}