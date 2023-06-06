public class Tugas2h {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        var hasil = 0;

        for (int i = 0; i < array.length; i++) {
            hasil += array[i];
        }

        System.out.println(hasil);

    }
}
