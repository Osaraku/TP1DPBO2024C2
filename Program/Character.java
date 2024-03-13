/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Character {
    // Atribut
    private String nama;
    private String jenisKelamin;
    private String role;
    private int hp;
    private int atk;
    private int koin;

    // Konstruktor
    public Character(String nama, String jenisKelamin, String role, int hp, int atk, int koin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.role = role;
        this.hp = hp;
        this.atk = atk;
        this.koin = koin;
    }

    // Getter dan Setter untuk setiap atribut

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getKoin() {
        return koin;
    }

    public void setKoin(int koin) {
        this.koin = koin;
    }
}