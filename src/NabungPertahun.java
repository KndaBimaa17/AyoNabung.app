import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NabungPertahun {
    public static void main(String[] args) {
        var nabungSimulator = new nabungSimulator();
        nabungSimulator.startNabung();
    } // psvm closetag

    static class nabungSimulator {
        public void startNabung() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println(" ");
                System.out.println("--------- Simulasi Menabung Secara Rutin ---------");
                System.out.println("1. Intruksi Lengkap");
                System.out.println("2. Langsung Menabung");
                System.out.println("3. Selesaikan Simulasi");
                System.out.print("\nMasukkan Pilihanmu: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        instructions();
                        break;
                    case 2:
                        mulaiNabung(scanner);
                        break;
                    case 3:
                        System.out.println("Semangat menabungnya! Sampai Jumpa Lagi");
                        System.exit(0);
                    default:
                        System.out.println("Pilihan salah, Silahkan nomor yang sesuai");
                } // switch closetag
            } // while closetag
        } // startNabung closetag

        // Logic Perbulan
        public void logicNabungPerbulan() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jatah perbulan anda: Rp.");
            int jatahPerbulan = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan pengeluaran perbulan anda: Rp.");
            int pengeluaranPerbulan = scanner.nextInt();
            scanner.nextLine();

            // output 1
            int nabungPerbulan = jatahPerbulan - pengeluaranPerbulan;
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
            String formattedNabungPerbulan = numberFormat.format(nabungPerbulan);
            System.out.println("Potensial nabung anda perbulan adalah: Rp." + formattedNabungPerbulan);

            // next logic
            int banyakHariDalamSatuTahun = 366;
            int jumlahBulanSampaiAkhirTahun = banyakHariDalamSatuTahun / 30;
            int jumlahNabungSampaiAkhirTahun = nabungPerbulan * jumlahBulanSampaiAkhirTahun;
            String formattedJumlahNabungSampaiAkhirTahun = numberFormat.format(jumlahNabungSampaiAkhirTahun);
            System.out.println("Jika anda rutin menabung sebesar potensial anda, maka satu tahun dari sekarang anda akan memiliki tabungan sebesar: Rp." + formattedJumlahNabungSampaiAkhirTahun);
            System.out.println("---------------------------------------------");
            System.out.println("Apa yang ingin anda lakukan selanjutnya?");
            System.out.println("1. Mencoba nabung dengan pemasukkan berbeda");
            System.out.println("2. Kembali ke menu awal");
            System.out.println("3. Keluar aplikasi");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                opsiTahun();
            }
            else if (input == 2) {
                startNabung();
            }
            else if (input == 3) {
                System.out.println("Semangat menabungnya! Sampai Jumpa Lagi");
                System.exit(0);
            }
            else {
                System.out.println("Invalid Option");
            }
        }

        // Logic Perhari
        public void logicNabungPerhari() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jatah harian anda: Rp.");
            int jatahHarian = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan pengeluaran harian anda: Rp.");
            int pengeluaranHarian = scanner.nextInt();
            scanner.nextLine();

            // output 1
            int nabungHarian = jatahHarian - pengeluaranHarian;
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
            String formattedNabungHarian = numberFormat.format(nabungHarian);
            System.out.println("Potensial nabung anda perhari adalah: Rp." + formattedNabungHarian);

            // next logic
            int banyakHariDalamSatuTahun = 366;
            int jumlahNabungSampaiAkhirTahun = nabungHarian * banyakHariDalamSatuTahun;
            String formattedJumlahNabungSampaiAkhirTahun = numberFormat.format(jumlahNabungSampaiAkhirTahun);
            System.out.println("Jika anda rutin menabung sebesar potensial anda, maka satu tahun dari sekarang anda akan memiliki tabungan sebesar: Rp." + formattedJumlahNabungSampaiAkhirTahun);
            System.out.println("---------------------------------------------");
            System.out.println("Apa yang ingin anda lakukan selanjutnya?");
            System.out.println("1. Mencoba nabung dengan pemasukkan berbeda");
            System.out.println("2. Kembali ke menu awal");
            System.out.println("3. Keluar aplikasi");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                opsiTahun();
            }
            else if (input == 2) {
                startNabung();
            }
            else if (input == 3) {
                System.out.println("Semangat menabungnya! Sampai Jumpa Lagi");
                System.exit(0);
            }
            else {
                System.out.println("Invalid Option");
            }
        }

        // Logic Perminggu
        public void logicNabungPerminggu() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jatah mingguan anda: Rp.");
            int jatahMingguan = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan pengeluaran mingguan anda: Rp.");
            int pengeluaranMingguan = scanner.nextInt();
            scanner.nextLine();

            // output 1
            int nabungMingguan = jatahMingguan - pengeluaranMingguan;
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
            String formattedNabungMingguan = numberFormat.format(nabungMingguan);
            System.out.println("Potensial nabung anda perminggu adalah: Rp." + formattedNabungMingguan);

            // next logic
            int banyakHariDalamSatuTahun = 366;
            int jumlahMingguSampaiAkhirTahun = banyakHariDalamSatuTahun / 7;
            int jumlahNabungSampaiAkhirTahun = nabungMingguan * jumlahMingguSampaiAkhirTahun;
            String formattedJumlahNabungSampaiAkhirTahun = numberFormat.format(jumlahNabungSampaiAkhirTahun);
            System.out.println("Jika anda rutin menabung sebesar potensial anda, maka satu tahun dari sekarang anda akan memiliki tabungan sebesar: Rp." + formattedJumlahNabungSampaiAkhirTahun);
            System.out.println("---------------------------------------------");
            System.out.println("Apa yang ingin anda lakukan selanjutnya?");
            System.out.println("1. Mencoba nabung dengan pemasukkan berbeda");
            System.out.println("2. Kembali ke menu awal");
            System.out.println("3. Keluar aplikasi");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                opsiTahun();
            }
            else if (input == 2) {
                startNabung();
            }
            else if (input == 3) {
                System.out.println("Semangat menabungnya! Sampai Jumpa Lagi");
                System.exit(0);
            }
            else {
                System.out.println("Invalid Option");
            }
        }

        private void mulaiNabung(Scanner scanner) {
            boolean lanjutLagi = true;

            while(lanjutLagi) {
                System.out.println("Mari kita mulai");
                opsiTahun();
            }
        } // mulaiNabung closetag

        private void instructions() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("---------- INSTRUKSI AyoNabung ----------");
            System.out.println("Untuk setiap jawaban benar akan mendapatkan satu poin.");
            System.out.print("Silakan ketik '1' untuk kembali ke menu utama: ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                startNabung();
            } else {
                System.out.println("Input tidak valid. Kembali ke menu utama.");
            }
        } // instruction closetag

        private void opsiTahun() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("-------------------- Opsi Lama Menabung --------------------");
            System.out.println("1. Perbulan selama setahun");
            System.out.println("2. Perminggu selama setahun");
            System.out.println("3. Perhari selama setahun");
            System.out.println("4. Kembali ke menu utama");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    logicNabungPerbulan();
                    break;
                case 2:
                    logicNabungPerminggu();
                    break;
                case 3:
                    logicNabungPerhari();
                    break;
                case 4:
                    System.out.println("Semangat menabungnya! Sampai Jumpa Lagi");
                    startNabung();
                default:
                    System.out.println("Pilihan salah, Silahkan nomor yang sesuai");
            } // switch closetag
        }

    } // nabungSimulator closetag

} // main class closetag
