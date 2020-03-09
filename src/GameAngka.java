import java.util.Scanner;

public class GameAngka {

    // Jawaban disimpan disini
    int jawaban;

    // Jumlah kesempatan menebak disimpan disini
    int kesempatan;

    // Untuk memainkan game
    public void play() {
        // Acak jawaban terlebih dahulu
        jawaban = 1 + (int) Math.round(Math.random() * 20);

        // Tentukan jumlah kesempatan menebak
        kesempatan = 5;

        // Intro
        System.out.println("Hai");
        System.out.println("Ini adalah permainan tebak angka");
        System.out.println("================================");

        // Variabel untuk tebakan
        int tebakan = -1;

        // Ulangi selama kesempatan masih ada dan tebakan masih salah
        while (kesempatan > 0 && tebakan != jawaban) {

            // Pesan
            System.out.print("Tebak antara 1 - 20: ");

            // Ambil input tebakan
            Scanner input = new Scanner(System.in);
            tebakan = input.nextInt();

            // Cek hasil tebakan
            if (tebakan == jawaban) {
                // Jika benar, kasih pesan
                System.out.println("Benar!! Jawabannya adalah " + jawaban);
            } else {
                // Kurangi jumlah kesempatan
                kesempatan--;
                // Cek tebakan salah
                if (tebakan > jawaban) {
                    System.out.println("### Opss salah! Masih terlalu besar.");
                    System.out.println("Kesempatan tinggal : " + kesempatan);
                    System.out.println();
                } else {
                    System.out.println("### Opss salah! Terlalu kecil.");
                    System.out.println("Kesempatan tinggal : " + kesempatan);
                    System.out.println();
                }
            }

        }

        if( kesempatan == 0 ) {
            System.out.println("Kesempatan sudah habis, silahkan ulangi lagi.");
        } else {
            System.out.println("Selamat yah. Saat ini kita belum kasih hadiah.");
        }
    }

    public static void main(String[] args) {

        GameAngka app = new GameAngka();
        app.play();

    }
}
