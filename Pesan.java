package Penggajian;

public class Pesan {
    private String NPM;
    private String Nama;
    private int gajipokok;
    private int totalgaji;
    private int tunjangan;
    private int pajak;
    
    public Pesan (String npm, String nama, int gajipokok, int totalgaji, int tunjangan, int pajak) {
        this.NPM = npm;
        this.Nama = nama;
        this.gajipokok = gajipokok;
        this.totalgaji = totalgaji;
        this.tunjangan = tunjangan;
        this.pajak = pajak;
        
    }
    
    public void setNpm(String NPM) {
        this.NPM = NPM;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setgajipokok(int gajipokok){
        this.gajipokok = gajipokok;
    }
    public void settotalgaji (int totalgaji){
        this.totalgaji = totalgaji;
    }
    public void settunjangan (int tunjangan){
        this.tunjangan = tunjangan;
    }
    public void setpajak (int pajak){
        this.pajak = pajak;
    }
    public String getNpm(){
        return NPM;
    }
    public String getNama(){
        return Nama;
    }
    public int getgajipokok(){
        return gajipokok;
    }
    public int gettotalgaji(){
        return totalgaji;
    }
    public int gettunjangan(){
        return tunjangan;
    }
    public int pajak(){
        return pajak;
    }
}

