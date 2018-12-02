public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = {1_800_000, 5_000_000, 2_800_000};
        int[] total = new int[denver.length];
        int average = 0;

        for (int i = 0; i <= 2; total[i] = denver[i] + philadelphia[i], average = average + total[i], System.out.print("Produkcja w " + (2012 + i) + ": "),System.out.format("%,d%n", total[i]), i++) {
        }
        System.out.println("\n\n");
        average = 0;
        for (int i = 0; i <= 2; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.print("Produkcja w " + (2012 + i) + ": ");
            System.out.format("%,d%n", total[i]);
            average += total[i];
        }
        average = average / 3;

        System.out.print("ś".toUpperCase() + "Produkcja: ");
        System.out.format("%,d%n ", average);
    }
}
