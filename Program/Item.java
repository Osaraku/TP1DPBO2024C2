/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Item {
    // Atribut
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlah;

    // Konstruktor
    public Item(String nama, String deskripsi, int harga, int jumlah) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Getter dan Setter untuk atribut nama, deskripsi, dan harga

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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
