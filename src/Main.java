public class Main {
    public static void main(String[] args) {
        // Для подсчитывания количества миль за билет, подставьте в 4 строку, значения price стоимтость билета
        int airPrice = 999;
        int milesBonus = airPrice / 20;
        System.out.println(milesBonus + " miles for " + airPrice + " rubles");
    }
}
