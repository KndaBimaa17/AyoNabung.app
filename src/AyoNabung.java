public class AyoNabung {
    public static void main(String[] args) {
        // Potensi nabung perminggu
        int jatahMingguan = 900_000;
        int pengeluaranMingguan = 400_000;
        int nabungMingguan = jatahMingguan - pengeluaranMingguan;
        System.out.println("Potensi nabung perminggu: " + nabungMingguan + " ribu");

        // Jumlah hari pertahun
        int hariPerBulan = 30;
        int bulanPerTahun = 12;
        int satuTahun = hariPerBulan * bulanPerTahun + 6; // 366
        System.out.println("Satu tahun: " + satuTahun + " hari");

        // Sisa hari dan minggu tahun ini
        int maret24 = (bulanPerTahun - 9) * (hariPerBulan) - (hariPerBulan - 24); // 84
        int sisaHari2024 = satuTahun - maret24;
        int jumlahMingguSampaiAkhirTahun = sisaHari2024 / 7; // 40
        System.out.println("Sisa hari sejak 24 Maret adalah: " + sisaHari2024 + " hari");
        System.out.println("atau sama dengan: " + jumlahMingguSampaiAkhirTahun + " minggu");

        int jumlahNabungSampaiAkhirTahun = nabungMingguan * jumlahMingguSampaiAkhirTahun;
        System.out.println(jumlahNabungSampaiAkhirTahun);
    }
}