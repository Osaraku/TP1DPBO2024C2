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
1. Pertama, objek PartyLeader dengan atribut yang diberikan seperti nama, jenis kelamin, peran, HP, ATK, koin, senjata, dan level party dibuat dengan nama "Nova".
2. Selanjutnya, objek PartyMember dibuat dengan atribut yang diberikan seperti nama, jenis kelamin, peran, HP, ATK, koin, dan senjata. Terdapat tiga anggota party yaitu "Jane", "Sora", dan "Aloy".
3. Anggota party ditambahkan ke party leader menggunakan metode tambahAnggota.
4. Objek Item dibuat dengan atribut seperti nama, deskripsi, harga, dan jumlah.
5. Item-item ditambahkan ke penyimpanan party leader dan party member menggunakan metode tambahItem.
6. Informasi party leader dan anggota ditampilkan dengan menggunakan metode getter untuk mengakses atribut-atribut yang relevan.
7. Penyimpanan item partyLeader dan anggota ditampilkan dengan menggunakan metode getter untuk mengakses atribut-atribut yang relevan.
8. Program mencetak aktivitas yang dilakukan saat berpetualang.
9. Objek NPC Friendly dengan nama "Adrian" dibuat dengan atribut yang diberikan seperti nama, jenis kelamin, peran, HP, ATK, koin, lokasi, dan deskripsi.
10. Objek Item dengan nama "Health Potion", "Strength Potion", dan "Dragon Heart" dibuat dengan atribut yang diberikan seperti nama, deskripsi, harga, dan jumlah.
11. Objek Quest dengan nama "Gather Herbs" dibuat dengan atribut yang diberikan seperti nama, deskripsi, dan syarat ambil.
12. Item-item ditambahkan ke penyimpanan NPC "Adrian" menggunakan metode tambahItem.
13. Quest ditambahkan ke list quest NPC "Adrian" menggunakan metode tambahQuest.
14. Informasi stat NPC "Adrian" ditampilkan menggunakan metode getter untuk mengakses atribut-atribut yang relevan.
15. Dilakukan transaksi jual dan beli item antara NPC "Adrian" dan party leader menggunakan metode jualItem dan beliItem. 
16. Party leader menggunakan item "Dragon Heart" dengan menghapus item tersebut dari penyimpanan menggunakan metode hapusItem. Selain itu, HP party leader juga ditingkatkan karena menggunakan item Dragon Heart.
17. Informasi status party leader setelah menggunakan item ditampilkan menggunakan metode getter untuk mengakses atribut-atribut yang relevan.
18. Quest "Gather Herbs" diambil dari NPC "Adrian" dan ditambahkan ke list quest party leader menggunakan metode tambahQuest.
19. List quest party leader ditampilkan.
20. Program mencetak aktivitas berikutnya yaitu pergi ke "Stone Bridge".
21. Objek NPC Friendly dengan nama "Lyra" dibuat dengan atribut yang diberikan seperti nama, jenis kelamin, peran, HP, ATK, koin, lokasi, dan deskripsi.
22. Objek Item dengan nama "Travel Journal" dibuat dengan atribut yang diberikan seperti nama, deskripsi, harga, dan jumlah.
23. Objek Quest dengan nama "Kill the Monsters" dibuat dengan atribut yang diberikan seperti nama, deskripsi, dan syarat ambil.
24. Item ditambahkan ke penyimpanan NPC "Lyra" menggunakan metode tambahItem.
25. Quest ditambahkan ke list quest NPC "Lyra" menggunakan metode tambahQuest.
26. Informasi stat NPC "Lyra" ditampilkan menggunakan metode getter untuk mengakses atribut-atribut yang relevan.
27. Melakukan transaksi pembelian item dari NPC "Lyra" oleh anggota party menggunakan metode beliItem.
28. Jika party leader memiliki level party yang mencukupi, quest "Kill the Monsters" ditambahkan ke list quest party leader menggunakan metode tambahQuest.
29. Program mencetak aktivitas berikutnya yaitu pergi ke "Shadow Forest".
30. NPC musuh "Thor" ditambahkan sebagai bos di lokasi "Shadow Forest".
31. Pertarungan dimulai antara party dan NPC "Thor".
32. Selama pertarungan, setiap anggota party dan NPC "Thor" saling menyerang dan menerima serangan.
33. Setelah pertarungan selesai, party berhasil mengalahkan NPC "Thor".
34. Party menerima hadiah berupa item yang dijatuhkan oleh NPC "Thor". Item tersebut adalah "Fresh Meat".
35. Item "Fresh Meat" ditambahkan ke penyimpanan party leader menggunakan metode tambahItem.
36. Level party leader ditingkatkan dengan menambahkan 1 ke level saat ini menggunakan setPartyLevel.
37. Informasi detail tentang party leader dan anggota party ditampilkan.

## Dokumentasi
![screenshot-1](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/9bab655b-12c7-466f-a50d-9551c48e8619)
![screenshot-2](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/87bdf087-4614-490a-9bb7-f386d3ac3d6d)
![screenshot-3](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/89dbd434-3b40-4e41-8cb0-cd314f1ef371)
![screenshot-4](https://github.com/Osaraku/TP1DPBO2024C2/assets/117560099/ce4b56ed-2290-4cc8-8812-07fdb83f03d4)
