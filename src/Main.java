public class Main {

    public static void main(String[] args) {

        int balance = 165; //баланс клиента
        int payment = 1596; // на сколько пополнил счет
        int percent = payment / 100; // бонусные рубли

        int fullBalance;
        if (payment > 1000){
            fullBalance = balance + payment + percent;
        } else {
            fullBalance = balance + payment;
        }
        if (payment > 1000) {
            System.out.println("Ваш баланс " + fullBalance);
            System.out.println("Бонусов начислено " + percent);
        } else {
            System.out.println("Ваш баланс " + fullBalance);
        }

    }
}