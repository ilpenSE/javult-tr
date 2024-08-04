public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            System.out.println(i);
            i++;
        }// çıktı: 0 1 2 3

        for (int j = 0; j < 4; j++) {
            System.out.println(j);
        }// çıktı: 0 1 2 3

        int[] ints = new int[]{0, 1, 2, 3, 4};
        for (int integer : ints) {
            System.out.println(integer);
        }// çıktı: 0 1 2 3 4
    }
}
