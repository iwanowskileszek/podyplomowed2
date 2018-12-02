public class lab3_2_2v2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.height = 10;
        test.weight = 20;
        test.depth = 30;
        System.out.println("Wymiary: \t" + test.height + "\t" + test.weight + "\t" + test.depth);
    }
}

class Test {
    int height, weight, depth;
}