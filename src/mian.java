import java.util.Scanner;

public class mian {

    public static void main(String[] args){
        int jawaban;
        int jm;
        int jMakanan;
        int larilagi;

        cat c = new cat("Badak");
        Scanner key = new Scanner(System.in);
        c.cetak();
        System.out.println("Aing mulai Lari ");
        System.out.print("Masukkan Jumlah Putaran Lari : ");
        jm = key.nextInt();
        c.run(jm);
        System.out.println("1 = ya | 0 = tidak");
        System.out.print("apakah ingin memberi makan? 1/0 : ");
        jawaban = key.nextInt();
        if(jawaban == 1){
            System.out.println("Masukkan jumlah makanan : ");
            jMakanan = key.nextInt();
            c.makan(jMakanan);
        }
        //c.run(10);
        c.sisaStamina();

            System.out.println("1 = ya | 0 = tidak");
            System.out.println("Anda ingin menyuruh kucing ini berlari lagi? 1/0");
            larilagi = key.nextInt();
            if (larilagi == 1) {
                System.out.println("Masukkan Jumlah Putaran Lari : ");
                jm = key.nextInt();
                c.run(jm);
                System.out.println("1 = ya | 0 = tidak");
                System.out.print("apakah ingin memberi makan? 1/0 : ");
                jawaban = key.nextInt();
                if (jawaban == 1) {
                    System.out.println("Masukkan jumlah makanan : ");
                    jMakanan = key.nextInt();
                    c.makan(jMakanan);
                    c.sisaStamina();
                    System.out.println("Terimakasih sudah memberi makan, tapi kucingnya mau push rank :)");
                }
            }



        System.out.print("Terimakasih ya sudah bermain");
    }

}
