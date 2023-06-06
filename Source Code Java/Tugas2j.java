public class Tugas2j {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                int selisih = array[i + 1] - array[i];
                int nilaiPositif = Math.abs(selisih);
                System.out.print(nilaiPositif + ", ");
            }
        }

    }
}
