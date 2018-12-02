public class lab3_3_2 {
    public static void main(String[] args) {
        long slowo = 0;
        switch (args[0]) {
            case "jeden":
                slowo = 1;
                break;
            case "dwa":
                slowo = 2;
                break;
            case "trzy":
                slowo = 3;
                break;
            case "cztery":
                slowo = 4;
                break;
            case "pieć":
                slowo = 5;
                break;
            case "sześć":
                slowo = 6;
                break;
            case "siedem":
                slowo = 7;
                break;
            case "osiem":
                slowo = 8;
                break;
            case "dziewięć":
                slowo = 9;
                break;
            case "dziesięć":
                slowo = 10;
                break;
        }
        System.out.println(args[0] + " -> " + slowo);
    }
}
