package daylastweek;

import java.text.DecimalFormat;

public class Decimal {
    public static void main(String[] args) {
        double d = 123.4567;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String s = df.format(d);
    }
}
