public class SoalSatuBuAul {
    public static void main(String[] args) {
        String namaKota[] = new String[7];
        namaKota[0]="Ambon";
        namaKota[1]="Blitar";
        namaKota[2]="Cianjur";
        namaKota[3]="Denpasar";
        namaKota[4]="Ende";
        namaKota[5]="Fakfak";
        namaKota[6]="Garut";
        int angka = 0;

        System.out.println("List Nama Kota: ");
        for (int i = 0; i < namaKota.length; i++) {
            angka++;
            System.out.print(angka + ".");
            System.out.println(namaKota[i]);
        }
        
    }
}