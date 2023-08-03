// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 20538; // стоимость одного билета;

        int rub = 20; // рублей для 1 бонусной мили
        int bonusTotal  = 1026; // миль

        System.out.println("Бонусов будет начислено за покупку одного билета:");
        System.out.println((ticketPrice / rub) + " миль");
    }
}