public class Tugas2i {
    public static void main(String[] args) {

        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length - 1; i++){
            int selisih = array[i] - array[i + 1];
            int nilaiPositif = Math.abs(selisih);
            System.out.print(nilaiPositif+", ");
        }
    }
}
