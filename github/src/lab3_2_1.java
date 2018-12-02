import java.util.StringTokenizer;

public class lab3_2_1 {
    public static void main(String[] args) {
        String data = "29/04/2016";
        StringTokenizer str;

        str = new StringTokenizer(data, "/");
        System.out.println("DD: " + str.nextToken());
        System.out.println("MM: " + str.nextToken());
        System.out.println("RRRR: " + str.nextToken());

    }
}
