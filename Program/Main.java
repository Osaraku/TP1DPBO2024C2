/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Tugas Praktikum 1
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek PartyLeader
        PartyLeader leader = new PartyLeader("Nova", "L", "DPS", 100, 50, 5000, "Auriel Bow", 4);

        // Membuat objek PartyMember
        PartyMember member1 = new PartyMember("Jane", "P", "Healer", 80, 40, 2000, "Staff of Yggdrasil");
        PartyMember member2 = new PartyMember("Sora", "L", "Rogue", 90, 45, 3500, "Kamish Dagger");
        PartyMember member3 = new PartyMember("Aloy", "P", "Tanker", 200, 15, 1500, "Shield of Atlas");

        // Menambahkan anggota party
        leader.tambahAnggota(member1);
        leader.tambahAnggota(member2);
        leader.tambahAnggota(member3);

        // Membuat objek Item
        Item item1 = new Item("Health Potion", "Restores 50 HP", 200, 7);
        Item item2 = new Item("Strength Potion", "Increase 20 Atk", 250, 2);
        Item item3 = new Item("Map", "Show map", 50, 1);
        Item item4 = new Item("Health Potion", "Restores 50 HP", 200, 2);
        Item item5 = new Item("Strength Potion", "Increase 20 Atk", 250, 1);
        Item item6 = new Item("Health Potion", "Restores 50 HP", 200, 5);
        Item item7 = new Item("Strength Potion", "Increase 20 Atk", 250, 4);
        Item item8 = new Item("Health Potion", "Restores 50 HP", 200, 6);
        Item item9 = new Item("Strength Potion", "Increase 20 Atk", 250, 3);

        // Menambahkan item ke penyimpanan party leader
        leader.tambahItem(item1);
        leader.tambahItem(item2);
        leader.tambahItem(item3);

        // Menambahkan item ke penyimpanan party member
        member1.tambahItem(item4);
        member1.tambahItem(item5);
        member2.tambahItem(item6);
        member2.tambahItem(item7);
        member3.tambahItem(item8);
        member3.tambahItem(item9);

        // Menampilkan informasi party leader dan member
        System.out.println("Informasi Party Hero:");
        System.out.println("---------------------");
        System.out.println("Party level: " + leader.getPartyLevel());
        System.out.println("Party Leader:");
        System.out.println(" - " + leader.getNama() + "(" + leader.getJenisKelamin() + ") | Role: " + leader.getRole()
                + ", Senjata: " + leader.getSenjata() + ", HP: " + leader.getHp() + ", ATK: "
                + leader.getAtk() + ", Koin: " + leader.getKoin());

        System.out.println();
        System.out.println("Anggota:");
        for (PartyMember anggota : leader.getAnggota()) {
            System.out
                    .println(" - " + anggota.getNama() + "(" + anggota.getJenisKelamin() + ") | Role: "
                            + anggota.getRole()
                            + ", Senjata: " + anggota.getSenjata() + ", HP: " + anggota.getHp() + ", ATK: "
                            + anggota.getAtk() + ", Koin: " + anggota.getKoin());
        }

        System.out.println();
        System.out.println("Penyimpanan:");
        System.out.print(" - " + leader.getNama() + ": ");
        for (Item item : leader.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member1.getNama() + ": ");
        for (Item item : member1.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member2.getNama() + ": ");
        for (Item item : member2.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member3.getNama() + ": ");
        for (Item item : member3.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.println();

        // Kegiatan yang dilakukan saat berpetualang
        System.out.println("Aktivitas dilakukan:");
        System.out.println("---------------------");

        System.out.println("- Pergi ke Eraveil");

        // Membuat objek Friendly dan menambahkan item dan quest yang dimiliki
        Friendly npc1 = new Friendly("Adrian", "L", "Merchant", 100, 10, 1000, "Eraveil",
                "Penjual barang yang ramah");

        Item item10 = new Item("Health Potion", "Restores 50 HP", 200, 5);
        Item item11 = new Item("Strength Potion", "Increase 20 Atk", 250, 4);
        Item item12 = new Item("Dragon Heart", "Increase Max HP sebesar 20", 2500, 1);

        Quest quest1 = new Quest("Gather Herbs", "Collect 5 herbs in the meadow", "Level 3 or higher");

        npc1.tambahItem(item10);
        npc1.tambahItem(item11);
        npc1.tambahItem(item12);
        npc1.tambahQuest(quest1);

        System.out.println("- Bertemu dengan Adrian " + npc1.getDeskripsi());

        // Menampilkan stat NPC
        System.out.println();
        System.out.println("Status Adrian: ");
        System.out.println("Koin: " + npc1.getKoin());
        System.out.print("Shop: ");
        for (Item item : npc1.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + " $" + item.getHarga() + ", ");
        }
        System.out.println();
        System.out.print("Quest: ");
        for (Quest quest : npc1.getListQuest()) {
            System.out.print(quest.getNama() + " -> " + quest.getDeskripsi() + " (" + quest.getSyaratAmbil() + "), ");
        }
        System.out.println();
        System.out.println();

        // Melakukan transaksi
        npc1.jualItem(item12, item12.getHarga());
        leader.beliItem(item12, item12.getHarga());
        leader.setHp(leader.getHp() + 20);

        // Menggunakan item
        System.out.println();
        System.out.println("- Nova menggunakan Dragon Heart");
        leader.hapusItem(item12);
        System.out.println();
        System.out.println("Status Nova saat ini:");
        System.out.println(leader.getNama() + "(" + leader.getJenisKelamin() + ") | Role: " + leader.getRole()
                + ", Senjata: " + leader.getSenjata() + ", HP: " + leader.getHp() + ", ATK: "
                + leader.getAtk() + ", Koin: " + leader.getKoin());

        System.out.println();
        System.out.println("- Mengambil quest Gather Herbs dari Adrian");

        // Menambahkan quest ke listQuest party
        if (leader.getPartyLevel() >= 3) {
            leader.tambahQuest(quest1);
        } else {
            System.out.println("Tidak dapat mengambil Quest dikarenakan tidak memenuhi syarat");
        }

        // Membuat objek Quest

        System.out.println();
        System.out.print("List Quest: ");
        for (Quest quest : leader.getListQuest()) {
            System.out.println(quest.getNama() + ", ");
        }

        System.out.println();
        System.out.println("- Pergi ke Stone Bridge");

        // Membuat objek Friendly dan menambahkan item dan quest yang dimiliki
        Friendly npc2 = new Friendly("Lyra", "P", "Traveler", 100, 10, 2000, "Stone Bridge",
                "sang penjelajah yang menyukai tantangan");

        Item item13 = new Item("Travel Journal", "Cerita Perjalanan sang Traveler", 5000, 1);

        Quest quest2 = new Quest("Kill the Monsters", "Defeat 10 monsters in the forest", "Level 5 or higher");

        npc2.tambahItem(item13);
        npc2.tambahQuest(quest2);

        System.out.println("- Bertemu dengan Lyra " + npc2.getDeskripsi());

        // Menampilkan stat NPC
        System.out.println();
        System.out.println("Status Lyra: ");
        System.out.println("Koin: " + npc2.getKoin());
        System.out.print("Shop: ");
        for (Item item : npc2.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + " $" + item.getHarga() + ", ");
        }
        System.out.println();
        System.out.print("Quest: ");
        for (Quest quest : npc2.getListQuest()) {
            System.out.print(quest.getNama() + " -> " + quest.getDeskripsi() + " (" + quest.getSyaratAmbil() + "), ");
        }
        System.out.println();
        System.out.println();

        // Melakukan transaksi
        member3.beliItem(item13, item13.getHarga());

        System.out.println();

        // Menambahkan quest ke listQuest party
        if (leader.getPartyLevel() >= 5) {
            leader.tambahQuest(quest2);
        } else {
            System.out.println("Tidak dapat mengambil Quest dikarenakan tidak memenuhi syarat");
        }

        System.out.println();
        System.out.println("- Pergi ke Shadow Forest");

        // Menambahkan NPC musuh
        Hostile npc3 = new Hostile("Thor", "L", "Boss", 500, 50, 1000, "Shadow Forest",
                "si tukang begal di Shadow Forest", "Da Hook", "Fresh Meat");

        System.out.println("- Bertemu dengan Thor " + npc3.getDeskripsi());

        System.out.print("- Stat Thor -> ");
        System.out.println("Senjata: " + leader.getSenjata() + ", HP: " + leader.getHp() + ", ATK: "
                + leader.getAtk() + ", Koin: " + leader.getKoin());

        // Pertarungan dimulai
        System.out.println();
        System.out.println("Battle Started");
        System.out.println("---------------------");

        member3.menerimaDamage(npc3.getAtk());
        member2.menerimaDamage(npc3.getAtk());
        npc3.menerimaDamage(leader.getAtk());
        npc3.menerimaDamage(member1.getAtk());
        npc3.menerimaDamage(member2.getAtk());
        npc3.menerimaDamage(member3.getAtk());
        member1.menerimaDamage(npc3.getAtk());
        leader.menerimaDamage(npc3.getAtk());
        npc3.menerimaDamage(member2.getAtk());
        npc3.menerimaDamage(leader.getAtk());
        npc3.menerimaDamage(member1.getAtk());
        member3.menerimaDamage(npc3.getAtk());
        member2.menerimaDamage(npc3.getAtk());
        npc3.menerimaDamage(leader.getAtk());
        npc3.menerimaDamage(member1.getAtk());
        npc3.menerimaDamage(member2.getAtk());
        member1.menerimaDamage(npc3.getAtk());
        leader.menerimaDamage(npc3.getAtk());
        npc3.menerimaDamage(leader.getAtk());
        npc3.menerimaDamage(leader.getAtk());

        // Reward dari mengalahkan musuh
        System.out.println();
        System.out.println("Mendapatkan " + npc3.getItemDrop());
        Item item14 = new Item(npc3.getItemDrop(), "Dagiing untuk meningkatkan max HP sebesar 200", 2000, 1);
        leader.tambahItem(item14);
        System.out.println("Level Party Hero meningkat!!");
        leader.setPartyLevel(leader.getPartyLevel() + 1);
        System.out.println();

        // Menampilkan informasi party leader dan member
        System.out.println("Informasi Party Hero:");
        System.out.println("---------------------");
        System.out.println("Party level: " + leader.getPartyLevel());
        System.out.println("Party Leader:");
        System.out.println(" - " + leader.getNama() + "(" + leader.getJenisKelamin() + ") | Role: " + leader.getRole()
                + ", Senjata: " + leader.getSenjata() + ", HP: " + leader.getHp() + ", ATK: "
                + leader.getAtk() + ", Koin: " + leader.getKoin());

        System.out.println();
        System.out.println("Anggota:");
        for (PartyMember anggota : leader.getAnggota()) {
            System.out
                    .println(" - " + anggota.getNama() + "(" + anggota.getJenisKelamin() + ") | Role: "
                            + anggota.getRole()
                            + ", Senjata: " + anggota.getSenjata() + ", HP: " + anggota.getHp() + ", ATK: "
                            + anggota.getAtk() + ", Koin: " + anggota.getKoin());
        }

        System.out.println();
        System.out.println("Penyimpanan:");
        System.out.print(" - " + leader.getNama() + ": ");
        for (Item item : leader.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member1.getNama() + ": ");
        for (Item item : member1.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member2.getNama() + ": ");
        for (Item item : member2.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
        System.out.print(" - " + member3.getNama() + ": ");
        for (Item item : member3.getPenyimpanan()) {
            System.out.print(item.getJumlah() + " " + item.getNama() + ", ");
        }
        System.out.println();
    }
}
