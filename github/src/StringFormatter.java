import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {
        int accounBalance = 15_005;
        System.out.printf("Saldo: %,d zł %n", accounBalance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.3f %n", pi);
        System.out.printf(new Locale("us"),"%.7f %n", pi);

    }
}
