public class Main {
    public static void main(String[] args) {

        int newAmount = 100;
        int sumPlus = 10000;
        int bonus;

        if (sumPlus > 1000) {
            bonus = sumPlus / newAmount;
        } else {
            bonus = 0;
        }

        int allCash = sumPlus + newAmount;
        System.out.println("Итоговый баланс равен " + (allCash + bonus));
        System.out.println("Бонус равен " + bonus);
    }
}
