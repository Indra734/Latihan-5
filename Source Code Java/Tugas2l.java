public class Tugas2l {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length - 1; i++) {
            int selisih = array[i] + array[i + 1];
            if (selisih % 2 == 0) {
                System.out.print(selisih + ", ");
            }
        }

    }
}
