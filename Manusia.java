public class Manusia{
    private String nama;
    private boolean PunyaTV;

    public Manusia(){

    }

    public Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return this.nama;
    }

    public void beliTV(TVku tiviku){
        PunyaTV = true;
    }

    public void jualSemuaTV(){
        PunyaTV = false;
    }

    public boolean cekTV(){
        return PunyaTV;
    }
}