package com.example.makananku;

import java.util.ArrayList;

public class artikelData {
    private static String[] judulArtikel = {
            "KALEDO",
            "KAPURUNG",
            "KUE TETU",
            "LABIA DANGE",
            "Lalampa",
            "PALUMARA",
            "TUMIS PENJA",
            "SARABA",
            "UTA DADA",
            "UTA KELO",
    };

    private static String[] isiArtikel = {
            "Kaki Lembu Donggala atau yang lebih dikenal dengan nama Kaledo ini adalah makanan khas masyarakat Donggala yang terletak di provinsi Sulawesi Tengah, tepatnya di kota Palu. Makanan ini mirip dengan sup buntut, bedanya tulangnya dari kaki lembu dan disajikan bukan dengan nasi melainkan dengan ubi. Tulangnya itu sendiri adalah ruas tulang lutut yang masih penuh dengan sum-sum. Ada juga yang mengatakan, bahwa Kaledo berasal dari Bahasa Kaili, bahasa penduduk Palu. Ka artinya Keras, dan Ledo artinya Tidak, sehingga dapat diartikan \"tidak keras\". Mengenai Kaledo ini, oleh Jamrin Abubakar seorang wartawan budaya di Donggala telah dibuatkan sebuah cerita rakyat atau legenda dengan judul Asal Mula Kaledo.",
            "Kappurung adalah salah satu makanan khas tradisional di Sulawesi Selatan, khususnya masyarakat daerah Luwu (Kota Palopo, Kabupaten Luwu, Luwu Utara, Luwu Timur) juga di Tawau, di Sabah,Malaysia yang dihuni masyarakat mayoritas suku Bugis. Makanan ini terbuat dari sari atau tepung sagu. Di daerah Maluku dikenal dengan nama Papeda. Kappurung dimasak dengan campuran ikan atau daging ayam dan aneka sayuran. Meski makanan tradisional, Kappurung mulai populer. Selain ditemukan di warung-warung khusus di Makassar juga telah masuk ke beberapa restoran, bersanding dengan makanan modern.Di daerah Luwu sendiri nama Kappurung' ini sering juga di sebut Pugalu atau Bugalu.",
            "Kue tetu, dibanyak daerah disebut kue perahu, merupakan olahan khas dari Kota Palu. Dibuat dari tepung terigu dengan campuran santan kental. Ditambahkan pula gula merah cair di bagian dalamnya.Sebetulnya, kue tetu merupakan penganan khas dari Suku Mandar. Kue ini ditemukan di banyak tempat di Pulau Sulawesi. Seperti dikutip Jejak-Jejak Mandar: Kamus, Sejarah, Kebudayaan dan Ensiklopedia Tokoh, tetu menjadi penganan terlezat khas dari Suku Mandar di Mandar dan Mamuju, Sulawesi Barat.",
            "labia dange merupakan makanan khas kota Palu, Dalam bahasa daerah setempat, labia berarti sagu dan dange yaitu pangang. Makanan labia dange berarti sagu panggang. Pengolahannya seperti pada pembuatan surabi dengan cara memanggangnya di atas bara dengan wajan tanah liat.",
            "merupakan makanan khas provinsi Gorontalo, Gorontalo atau yang juga dikenal dengan sebutan bumi serambi Madinah, memiliki keragaman kuliner yang sayang untuk dilewatkan. Contohnya saja lalampa. Lalampa adalah hidangan sejenis lemper yang diisi dengan ikan tongkol, yang kemudian dibungkus dengan daun pisang dan dibakar hingga harum.",
            "Kuliner khas suku Kaili ini merupakan olahan ikan yang dimasak berkuah. Bahan dasarnya biasanya menggunakan ikan bandeng, tongkol, ataupun kakap merah. Citarasa pedas didapat dari potongan cabai yang dimasukkan ke kuahnya.",
            "merupakan makanan khas kota Palu Sulawesi Tengah, bahan utama dari ikan penja yang berukurang sangat kecil, Mengolah ikan penja, biasa ditumis sederhana dengan bumbu seperti bawang merah, cabai, tomat, dan sedikit minyak kelapa. Walau bumbunya sederhana, rasa gurih dan kenyal ikan penja sangat enak. Selain langsung dijadikan lauk saat masih segar, ikan penja juga biasanya diolah dengan cara diasinkan dan dikeringkan seperti teri.",
            "merupakan minuman khas Makassar, Saraba adalah minuman penghangat badan yang miripdengan STMJ, dan biasanya sering dijumpai di Sulawesi Selatan khususnya didaerah Makassar. Minuman saraba ini mempunyai perbedaan yaitu apabila STMJterdiri dari susu, telur, madu dan jahe sedangkan minuman saraba ini diberitambahan santan, santan disini digunakan untuk menggantikan madu atauminuman saraba ini tidak memakai madu dalam pembuatannya.",
            "merupakan makanan khas kota Palu Sulawesi Tengah, Nama Uta Dada berasal dari bahasa Kaili, yang artinya adalah kuah santan. dalam kuah santan tersebut ada bahan utama yaitu ayam kampung.Daging ayam kampung dalam masakan Uta Dada justru dibakar lebih dulu. Ini yang bikin rasanya khas. dan dibakar menggunakan kayu bakar dan tanpa bawang putih dan biasanya disajikan bersama dengan ketupat.",
            "adalah makanan khas kota Palu Sulawesi Tengah, Uta Kelo (Sayur Kelor) adalah salah satu kuliner khas masyarakat Sulawesi Tengah. Kuliner yang satu ini identik dengan kehidupan salah satu suku terbesar yang mendiami kawasan Sulawesi Tengah yaitu suku Kaili. Cita rasanya yang khas dan unik menjadikannya sebagai salah satu identitas kuliner Sulawesi Tengah. Uta Kelo adalah kuliner yang berbahan dasar daun kelor dengan kuah santan kental. Sebagai pelengkap, biasanya ditambahkan irisan terung muda, pisang muda, dan lamale (udang halus). Kuah santan yang gurih, daun kelor yang segar, terung/pisang muda dengan tekstur yang lembut, dan rasa lamale yang khas menjadikan Uta Kelo sebagai salah satu menu wajib bagi masyarakat suku Kaili.",
    };

    private static int[] fotoArtikel = {
            R.drawable.kaledo,
            R.drawable.kapurung,
            R.drawable.kue_tetu,
            R.drawable.labia_dange,
            R.drawable.lalampa,
            R.drawable.palu_mara,
            R.drawable.penja_1,
            R.drawable.saraba,
            R.drawable.uta_dada,
            R.drawable.uta_kelo,
    };

    static ArrayList<artikel> getListData(){
        ArrayList<artikel> list = new ArrayList<>();
        for (int posisi = 0;posisi < judulArtikel.length;posisi++){
            artikel Artikel = new artikel();
            Artikel.setJudul(judulArtikel[posisi]);
            Artikel.setIsi(isiArtikel[posisi]);
            Artikel.setFotoProfil(fotoArtikel[posisi]);
            list.add(Artikel);
        }
        return list;
    }
}
