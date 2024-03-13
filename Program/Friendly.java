/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

import java.util.ArrayList;
import java.util.List;

public class Friendly extends NPC {
    // Atribut
    private List<Item> penyimpanan;
    private List<Quest> listQuest;

    // Konstruktor
    public Friendly(String nama, String jenisKelamin, String role, int hp, int atk, int koin, String lokasi,
            String deskripsi) {
        super(nama, jenisKelamin, role, hp, atk, koin, lokasi, deskripsi);
        this.penyimpanan = new ArrayList<>();
        this.listQuest = new ArrayList<>();
    }

    // Setter dan Getter
    public void tambahItem(Item item) {
        penyimpanan.add(item);
    }

    public void tambahQuest(Quest quest) {
        listQuest.add(quest);
    }

    // Method menambah dan mengurangi item dan quest
    public void hapusItem(Item item) {
        penyimpanan.remove(item);
    }

    public void hapusQuest(Quest quest) {
        listQuest.remove(quest);
    }

    public List<Item> getPenyimpanan() {
        return penyimpanan;
    }

    public List<Quest> getListQuest() {
        return listQuest;
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