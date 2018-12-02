public class lab3_3_1 {
    public static void main(String[] args) {
        int year = 2019;

        System.out.println("Wszystkie daty roku " + year + ": ");
        for (int month = 1; month <= 12; month++) {

            if (args.length > 0) {
                month = Integer.parseInt(args[0]);
            }
            if (args.length > 1) {
                year = Integer.parseInt(args[1]);
            }
            for (int day = 1; day <=DayCounter.countDays(month, year); day++){
                System.out.println(day + "/" + month + "/" + year);
            }
        }
    }
}
