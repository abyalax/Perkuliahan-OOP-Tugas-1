package utils;


import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static String formatCurrency(Long number) {
        Locale localeID = Locale.of("id", "ID");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(localeID);
        return currencyFormat.format(number);
    }
}
