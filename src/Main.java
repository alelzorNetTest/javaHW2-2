public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int initialAccount = 2200;
        int refillAmount = 1300;
        int bonus;
        int currentAccount;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
            currentAccount = initialAccount + refillAmount + bonus;
            System.out.println("bonus = " + bonus);
            System.out.println("current account = " + currentAccount);
        } else {
            bonus = 0;
            currentAccount = initialAccount + refillAmount + bonus;
            System.out.println("bonus = " + bonus);
            System.out.println("current account = " + currentAccount);
        }

    }
}
