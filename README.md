# TP1DPBO2024C2

## Janji
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin

## Desain Program
![TP1DPBO drawio](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/6461826e-d58d-4797-a452-f315512886b7)

## Penjelasan Desain Program
Terdapat 8 kelas pada program ini, antara lain:
1. Character
- Kelas Character memiliki atribut-atribut seperti nama, jenisKelamin, role, hp, atk, dan koin yang merepresentasikan karakter dalam suatu permainan.
- Atribut-atribut ini dapat diakses dan dimodifikasi melalui metode-metode getter dan setter yang disediakan.
2. NPC
- Kelas NPC merupakan turunan dari kelas Character dalam Java.
- Kelas ini memiliki atribut lokasi dan deskripsi.
- Terdapat metode getter dan setter untuk atribut lokasi dan deskripsi.
3. Item
   - kelas Item merepresentasikan sebuah item yang dapat digunakan oleh karakter.
   - Kelas ini memiliki atribut nama, deskripsi, harga, dan jumlah untuk mendefinisikan karakteristik item.
   - Terdapat metode getter dan setter untuk atribut-atribut tersebut.
4. Quest
   - kelas Quest merepresentasikan quest yang dapat dilakukan oleh Player.
   - Kelas ini memiliki atribut nama, deskripsi, dan syaratAmbil untuk mendefinisikan karakteristik quest.
   - Terdapat metode getter dan setter untuk atribut-atribut tersebut.
5. Friendly
   - Kelas Friendly yang merupakan turunan dari kelas NPC yang baik.
   - Kelas ini memiliki atribut penyimpanan dan listQuest.
   - Terdapat konstruktor yang digunakan untuk menginisialisasi objek dengan nilai-nilai atribut yang diberikan.
   - Terdapat metode untuk menambah dan menghapus item dalam daftar penyimpanan serta menambah dan menghapus quest dalam daftar listQuest.
   - Terdapat metode untuk melakukan transaksi jual beli item.
6. Hostile
   - Kelas Hostile merupakan turunan dari kelas NPC yang jahat.
   - Kelas ini memiliki atribut senjata dan itemDrop.
   - Terdapat konstruktor yang digunakan untuk menginisialisasi objek dengan nilai-nilai atribut yang diberikan.
   - Terdapat metode getter dan setter untuk atribut senjata dan itemDrop.
   - Terdapat metode menerimaDamage yang digunakan untuk mengurangi jumlah HP karakter saat menerima serangan dari musuh.
7.  PartyMember
   - Kelas PartyMember merupakan turunan dari kelas Character.
   - Kelas ini memiliki atribut senjata dan penyimpanan (daftar item yang disimpan).
   - Terdapat metode untuk menambah dan menghapus item dalam daftar penyimpanan.
   - Metode menerimaDamage digunakan untuk mengurangi hit points (hp) saat menerima serangan musuh.
   - Terdapat metode untuk melakukan transaksi jual beli item.
8. PartyLeader
   - Kelas PartyLeader merupakan turunan dari kelas Character.
   - Kelas ini memiliki atribut tambahan seperti senjata, anggota, penyimpanan, listQuest, dan partyLevel.
   - Terdapat metode untuk menambah dan menghapus anggota, item, serta quest dalam kelompok.
   - Terdapat metode untuk menerima damage, jual beli item, dan manipulasi koin.

## Alur Program

## Dokumentasi
![screenshot-1](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/9bab655b-12c7-466f-a50d-9551c48e8619)
![screenshot-2](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/dceab8fb-631d-4329-b22b-ebc85d860584)
![screenshot-3](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/89dbd434-3b40-4e41-8cb0-cd314f1ef371)
![screenshot-4](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/ce4b56ed-2290-4cc8-8812-07fdb83f03d4)
