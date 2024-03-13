/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Hostile extends NPC {
    // Atribut
    private String senjata;
    private String itemDrop;

    // Konstruktor
    public Hostile(String nama, String jenisKelamin, String role, int hp, int atk, int koin, String lokasi,
            String deskripsi, String senjata, String itemDrop) {
        super(nama, jenisKelamin, role, hp, atk, koin, lokasi, deskripsi);
        this.senjata = senjata;
        this.itemDrop = itemDrop;
    }

    // Getter dan Setter untuk atribut senjata dan itemDrop

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public String getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(String itemDrop) {
        this.itemDrop = itemDrop;
    }

    // Method menerima damage dari musuh
    public void menerimaDamage(int jumlahDamage) {
        System.out.println(super.getNama() + " menerima damage sebesar " + jumlahDamage);
        int hpSekarang = getHp();
        hpSekarang -= jumlahDamage;
        if (hpSekarang < 0) {
            System.out.println(super.getNama() + " dikalahkan");
        }
        setHp(hpSekarang);
    }
}
