public class SoalTigaBuAul {
    public static void main(String[] args) {
        String namaHewan[] = new String[5];
        namaHewan[0]="Kucing";
        namaHewan[1]="Anjing";
        namaHewan[2]="Ular";
        namaHewan[3]="Elang";
        namaHewan[4]="Ikan";
        int angka = 0;

        System.out.println("Daftar Hewan: ");
        for (int i = 0; i < namaHewan.length; i++) {
            angka++;
            if (namaHewan[i].length() > 4) {
                System.out.println(angka + "." + namaHewan[i]);
            }
        }
    }
}