

public class cat {


    String nama;
    int stamina;
    String suara;


    public cat(String nama){
        this.nama=nama;
        this.stamina= 100;
        this.suara="mbeek..aunggg";

    }

    public void run(int stamina){
        for(int i=0; i<stamina;i++) {
            if (this.stamina == 0) {
                System.out.println("aing capek homan!");
            } else {
                System.out.println("masih kuat");
                this.stamina = this.stamina - 10;
            }
        }
    }

    public void sisaStamina(){
        System.out.println("Sisa Stamina : " + this.stamina);
    }

    public void cetak(){
        System.out.println("Nama    : " + nama);
        System.out.println("Stamina : " + stamina);
        System.out.println("Suara   : " + suara);
    }

    private void makanan(){
        this.stamina = this.stamina + 10;
    }

    public void makan(int eat){
        for(int i=0;i<eat;i++){
            makanan();
        }
    }





}
