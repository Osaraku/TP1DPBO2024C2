/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

import java.util.ArrayList;
import java.util.List;

public class PartyMember extends Character {
    // Atribut
    private String senjata;
    private List<Item> penyimpanan;

    // Konstruktor
    public PartyMember(String nama, String jenisKelamin, String role, int hp, int atk, int koin, String senjata) {
        super(nama, jenisKelamin, role, hp, atk, koin);
        this.penyimpanan = new ArrayList<>();
        this.senjata = senjata;
    }

    // Setter dan Getter
    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public String getSenjata() {
        return senjata;
    }

    public void tambahItem(Item item) {
        penyimpanan.add(item);
    }

    public void hapusItem(Item item) {
        penyimpanan.remove(item);
    }

    public List<Item> getPenyimpanan() {
        return penyimpanan;
    }

    // Method menerima damage dari serangan musuh
    public void menerimaDamage(int jumlahDamage) {
        System.out.println(super.getNama() + " menerima damage sebesar " + jumlahDamage);
        int hpSekarang = getHp();
        hpSekarang -= jumlahDamage;
        if (hpSekarang < 0) {
            System.out.println(super.getNama() + " dikalahkan");
        }
        setHp(hpSekarang);
    }

    // Method jual beli item
    public void jualItem(Item item, int harga) {
        if (penyimpanan.contains(item)) {
            penyimpanan.remove(item);
            tambahKoin(harga);
            System.out.println(
                    super.getNama() + ": Item " + item.getNama() + " berhasil dijual dengan harga " + harga + " koin.");
        } else {
            System.out.println(super.getNama() + ": Item " + item.getNama() + " tidak ada dalam penyimpanan.");
        }
    }

    public void beliItem(Item item, int harga) {
        if (getKoin() >= harga) {
            tambahItem(item);
            kurangiKoin(harga);
            System.out.println(
                    super.getNama() + ": Item " + item.getNama() + " berhasil dibeli dengan harga " + harga + " koin.");
        } else {
            System.out.println(super.getNama() + ": Koin tidak cukup untuk membeli item " + item.getNama() + ".");
        }
    }

    private void tambahKoin(int jumlah) {
        setKoin(getKoin() + jumlah);
    }

    private void kurangiKoin(int jumlah) {
        setKoin(getKoin() - jumlah);
    }
}
