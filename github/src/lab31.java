public class lab31 {
    public static void main(String[] args) {
        //1
        int inwestycja = 14000;
        double wartosc = ((inwestycja * 1.4) - 1500) * 1.12;
        System.out.println(wartosc);

        //2
        int liczbaA = 7;
        int liczbaB = 3;
        System.out.println( "Wynik z dzielenia i reszta z dzielenia: " +liczbaA / liczbaB + "\t" + liczbaA%liczbaB);

        //3
        int liczbaDziesietna = 15;
//        System.out.printf("%b%n", liczbaDziesietna);
//        System.out.printf("%B%n", liczbaDziesietna);
//        System.out.printf("%o%n", liczbaDziesietna);
//        System.out.printf("%h%n", liczbaDziesietna);
//        System.out.printf("%d%n%n%n", liczbaDziesietna);

        System.out.println(Integer.toBinaryString(liczbaDziesietna));
        System.out.println(Integer.toOctalString(liczbaDziesietna));
        System.out.println(Integer.toHexString(liczbaDziesietna));

    }
}
