import java.text.DecimalFormat;

public class Sample {
    int c;
    static final double PI = 3.12;

    //    psvm
    public static void main(String[] args) {
        int a, b, c, d;
        a = 2;
        b = 3;
        String name = "Wojtek";
        String lastname = "Kowalski";
        Sample sample = new Sample();
//        sout
        System.out.println(name);
        System.out.println(sample.c);


        MarsRobot robot = new MarsRobot();
        int localAreaCode = 324;


        final String name2;
        name2 = "Piotr";
//        name2 = "Krzysztof"; - stałe inicjujemy tylko raz.

        System.out.println(PI);
        long x = 500_000; //500000;
        double y = 12e22; //notacja wykłądnicza
        double z = 19E-95;
//        DecimalFormat df = new DecimalFormat(pattern: "#.################");

    }
}
