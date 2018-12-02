public class lab3_2_3 {
    public static void main(String[] args) {
        Test3 jeden = new Test3();
        System.out.println(Test3.licznik);
        Test3 dwa = new Test3();
        System.out.println(Test3.licznik);
        Test3 trzy = new Test3();
        System.out.println(Test3.licznik);

    }

}

class Test3 {
    static int licznik;
    Test3() {
        licznik++;
    }
}