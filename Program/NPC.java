/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class NPC extends Character {
    // Atribut
    private String lokasi;
    private String deskripsi;

    // Konstruktor
    public NPC(String nama, String jenisKelamin, String role, int hp, int atk, int koin, String lokasi,
            String deskripsi) {
        super(nama, jenisKelamin, role, hp, atk, koin);
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
    }

    // Getter dan Setter untuk atribut lokasi dan deskripsi

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
