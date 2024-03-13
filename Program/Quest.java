/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Quest {
    // Atribut
    private String nama;
    private String deskripsi;
    private String syaratAmbil;

    // Konstruktor
    public Quest(String nama, String deskripsi, String syaratAmbil) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.syaratAmbil = syaratAmbil;
    }

    // Getter dan Setter untuk atribut nama, deskripsi, dan syaratAmbil

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getSyaratAmbil() {
        return syaratAmbil;
    }

    public void setSyaratAmbil(String syaratAmbil) {
        this.syaratAmbil = syaratAmbil;
    }
}