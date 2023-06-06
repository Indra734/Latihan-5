public class Tugas2b {
    public static void main(String[] args) {

        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        var angka = 20;
        boolean ditemukan = false;
        int i;

        for (i = 0; i < array.length; i++) {
            if (array[i] == angka) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(array[i]);
        } else {
            System.out.println("Angka tidak ditemukan");
        }

    }
}
