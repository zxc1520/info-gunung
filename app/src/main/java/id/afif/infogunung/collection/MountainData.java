package id.afif.infogunung.collection;

import java.util.ArrayList;

import id.afif.infogunung.R;

public class MountainData {

    private static String[] mountName = {
            "Gunung Argopuro",
            "Gunung Arjuno",
            "Gunung Buthak",
            "Gunung Bromo",
            "Gunung Ijen",
            "Gunung Kawi",
            "Gunung Kelud",
            "Gunung Liman",
            "Gunung Panderman",
            "Gunung Penanggungan",
            "Gunung Welirang",
            "Gunung Semeru"
    };

    private static String[] details = {
            "Gunung Argopuro merupakan gunung terpanjang di Pulau Jawa dengan panjang trek mencapai 40 kilometer. Gunung ini menjadi favorit para pendaki karena menyimpan pesona yang indah, kekayaan flora-fauna yang masih terjaga dengan keadaan alam masih asri mengingat masih belum banyak terjamah oleh wisatawan maupun pendaki. ",
            "Gunung Arjuno adalah sebuah gunung berapi kerucut (istirahat) di Jawa Timur, Indonesia dengan ketinggian 3.339 m dpl. Gunung Arjuno secara administratif terletak di perbatasan Kota Batu, Kabupaten Malang, dan Kabupaten Pasuruan dan berada di bawah pengelolaan Taman Hutan Raya Raden Soerjo. Gunung Arjuno bersebelahan dengan Gunung Welirang, Gunung Kembar I, dan Gunung Kembar II. Puncak Gunung Arjuno terletak pada satu punggungan yang sama dengan puncak gunung Welirang, sehingga kompleks ini sering disebut juga dengan Arjuno-Welirang.",
            "Gunung Butak adalah gunung stratovolcano yang terletak di Kabupaten Malang, Jawa Timur, Indonesia. Gunung Butak terletak berdekatan dengan Gunung Kawi. Tidak diketemukan catatan sejarah atas erupsi dari Gunung Butak sampai saat ini.[1] Gunung ini berada pada posisi -7,922566˚ dan 112,451688˚ dengan ketinggial 2.868 mdpl(9,409 ft).",
            "Gunung Bromo ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
            "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Merapi. Gunung Ijen terakhir meletus pada tahun 1999. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire (api biru) di dalam kawah yang terletak di puncaknya. Pendakian gunung ini bisa dimulai dari dua tempat. Pendaki bisa berangkat dari Banyuwangi ataupun dari Bondowoso.",
            "Gunung Kawi adalah sebuah gunung berapi di Kabupaten Malang, Jawa Timur, Indonesia, dekat dengan Gunung Butak. Tidak ada catatan sejarah mengenai letusan gunung berapi ini. Gunung ini cukup dikenal karena adanya tempat ziarah Pesarean Gunung Kawi.",
            "Gunung Kelud, dalam aksara jawa ꦒꦸꦤꦸꦁꦏꦼꦭꦸꦠ꧀ adalah sebuah gunung berapi di Provinsi Jawa Timur, Indonesia, yang tergolong aktif. Gunung ini berada di perbatasan antara Kabupaten Kediri, Kabupaten Blitar, dan Kabupaten Malang, kira-kira 35 km sebelah timur pusat Kota Kediri dan 25 km sebelah utara pusat Kota Blitar",
            "Gunung Liman adalah sebuah gunung berapi yang terletak di Jawa Timur, Indonesia. Gunung Liman secara administratif termasuk dalam wilayah dua kabupaten yaitu Kabupaten Ponorogo dan Kabupaten Nganjuk. ",
            "Gunung Panderman adalah sebuah gunung di Kota Batu, Jawa Timur, Indonesia, dengan puncaknya Basundara yang berketinggian 2.045 mdpl. Bagi yang ingin menanjak atau menikmati pemandangan kota Batu Malang dari puncak Gunung Panderman maka diperlukan waktu kira-kira 3-4 jam untuk mendaki dan menuruni Gunung Panderman hingga sampai kepuncaknya.",
            "Gunung Penanggungan adalah gunung berapi kerucut dalam kondisi istirahat yang berada di Jawa Timur, Indonesia. Posisinya berada di perbatasan dua kabupaten, yaitu Kabupaten Mojokerto dan Kabupaten Pasuruan dan berjarak kurang lebih 55 km sebelah selatan kota Surabaya.",
            "Gunung Welirang adalah sebuah gunung berapi aktif dengan ketinggian 3.156 m dpl yang secara administratif terletak di perbatasan Kota Batu, Kabupaten Pasuruan, dan Kabupaten Mojokerto, Jawa Timur, Indonesia. Gunung Welirang berada dalam pengelolaan Taman Hutan Raya Raden Soerjo.",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut."
    };

    private static int[] images = {
            R.drawable.argopuro,
            R.drawable.arjuni,
            R.drawable.butak,
            R.drawable.bromo,
            R.drawable.ijen,
            R.drawable.kawi,
            R.drawable.kelud,
            R.drawable.liman,
            R.drawable.panderman,
            R.drawable.penanggungan,
            R.mipmap.welirang,
            R.drawable.semeru
    };

    public static ArrayList<Mountain> getListData() {
        ArrayList<Mountain> list = new ArrayList<>();
        for (int position = 0; position < mountName.length; position++) {
            Mountain mountain = new Mountain();
            mountain.setName(mountName[position]);
            mountain.setDetail(details[position]);
            mountain.setImage(images[position]);
            list.add(mountain);
        }
        return list;
    }
}