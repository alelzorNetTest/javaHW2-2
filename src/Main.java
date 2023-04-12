public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int initial_account = 2200;
        int refill_amount = 1300;
        int current_account;
        int bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (refill_amount > 1000) {
            bonus = refill_amount/100;
            current_account = initial_account + refill_amount + bonus;
            System.out.println("bonus = " + bonus);
            System.out.println("current account = " + current_account);
        } else {
            bonus = 0;
            current_account = initial_account + refill_amount + bonus;
            System.out.println("bonus = " + bonus);
            System.out.println("current account = " + current_account);
        }

    }
}
