import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AyoNabung2 {
    public static void main(String[] args) {
        // Potensi nabung perminggu
        int jatahMingguan = 0;
        int pengeluaranMingguan = 0;
        int nabungMingguan = jatahMingguan - pengeluaranMingguan;

        // Jumlah hari pertahun
        int hariPerBulan = 30;
        int bulanPerTahun = 12;
        int satuTahun = hariPerBulan * bulanPerTahun + 6; // 366

        // Sisa hari dan minggu tahun ini
        int maret24 = (bulanPerTahun - 9) * (hariPerBulan) - (hariPerBulan - 24); // 84
        int sisaHari2024 = satuTahun - maret24;
        int jumlahMingguSampaiAkhirTahun = sisaHari2024 / 7; // 40
        int jumlahNabungSampaiAkhirTahun = nabungMingguan * jumlahMingguSampaiAkhirTahun;
        int totalTabungan = nabungMingguan * jumlahMingguSampaiAkhirTahun;
        System.out.println("Jumlah hari dalam satu tahun adalah " + satuTahun + " hari");
        System.out.println("Sisa hari sejak 24 Maret adalah " + sisaHari2024 + " hari, atau " + jumlahMingguSampaiAkhirTahun + " minggu");

        // Formatting the integer to include periods as thousand separators
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
        String formattedOutput1 = numberFormat.format(jatahMingguan);
        String formattedOutput2 = numberFormat.format(pengeluaranMingguan);
        String formattedOutput3 = numberFormat.format(nabungMingguan);
        String formattedOutput4 = numberFormat.format(totalTabungan);
        System.out.println("Pemasukkan saya perminggu adalah: Rp." + formattedOutput1);
        System.out.println("Pengeluaran saya perminggu adalah: Rp." + formattedOutput2);
        System.out.println("Besaran uang yang dapat ditabung tiap minggunya adalah: Rp." + formattedOutput3);
        System.out.println("Jika kamu menabung uang sebesar Rp." + formattedOutput3 + " perminggu sampai akhir tahun, kamu akan memiliki tabungan sebesar Rp." + formattedOutput4);
    }
}