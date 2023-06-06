public class Tugas2m {
    public static void main(String[] args) {

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlahSelisih = 0;

        for (int i = 0; i < angka.length - 1; i++) {
            int selisih = angka[i] - angka[i + 1];
            jumlahSelisih += Math.abs(selisih);
        }
        System.out.println(jumlahSelisih);
    }
}
