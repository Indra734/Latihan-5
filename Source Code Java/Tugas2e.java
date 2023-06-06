public class Tugas2e {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).contains("2")) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
