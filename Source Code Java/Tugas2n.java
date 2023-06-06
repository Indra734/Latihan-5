public class Tugas2n {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length; i++) {
            var total = 0;
            for (int j = 0; j < i; j++) {
                total += array[j];
            }
            System.out.print(total + ", ");
        }

    }
}
