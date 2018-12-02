public class sample4 {
    public static void main(String[] args) {
        int[][][] array = {{{1}, {1, 2, 3}}, {{1, 2}, {2}}};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int[][] i : array) {
            count2=0;
            for (int[] j : i) {
                count3=0;
                for (int k : j) {
                    System.out.println("array["+count1 +"]" + "["+count2 +"]"+ "["+count3 +"] = " + k);
                    count3++;
                }
                count2++;
            }
            count1++;
        }
    }
}