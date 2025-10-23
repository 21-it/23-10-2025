public class SoalDuaBuAul {
    public static void main(String[] args) {
        String mataPelajaran[] = new String[6];
        mataPelajaran[0]="Matematika";
        mataPelajaran[1]="Bahasa Indonesia";
        mataPelajaran[2]="Bahasa Inggris";
        mataPelajaran[3]="IPA";
        mataPelajaran[4]="IPS";
        mataPelajaran[5]="PJOK";
        int angka = 0;

        System.out.println("Daftar Mata Pelajaran: ");
        for (int i = 0; i < mataPelajaran.length; i++) {
            angka++;
            System.out.println(angka + "." + mataPelajaran[i]);
        }

    }
}