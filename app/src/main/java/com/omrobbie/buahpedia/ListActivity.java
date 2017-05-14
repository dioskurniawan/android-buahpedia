package com.omrobbie.buahpedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);

        // masukkan item ke dalam data
        final ArrayList<ListData> data = new ArrayList<>();
        data.add(new ListData(R.drawable.buah_anggur, "Anggur", "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae.\n\nBuah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.\n\nBuah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme tubuh, serta mampu mencegah terbentuknya sel kanker dan berbagai penyakit lainnya.\n\nAktivitas ini juga terkait dengan adanya senyawa metabolit sekunder di dalam buah anggur yang berperan sebagai senyawa antioksidan yang mampu menangkal radikal bebas."));
        data.add(new ListData(R.drawable.buah_apel, "Apel", "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel.\n\nBuah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.\n\nKebanyakan apel bagus dimakan mentah-mentah (tak dimasak), dan juga digunakan banyak jenis makanan pesta. Apel dimasak sampai lembek untuk dibuat saus apel. Apel juga dibuat untuk menjadi minuman sari buah apel."));
        data.add(new ListData(R.drawable.buah_jeruk, "Jeruk", "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan).\n\nAnggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.\n\nSebutan \"jeruk\" kadang-kadang juga disematkan pada beberapa anggota marga lain yang masih berkerabat dalam suku yang sama, seperti kingkit.\n\nDalam bahasa sehari-hari, penyebutan \"jeruk\" atau \"limau\" (di Sumatra dan Malaysia) seringkali berarti \"jeruk keprok\" atau \"jeruk manis\". Di Jawa, \"limau\" (atau \"limo\") berarti \"jeruk nipis\"."));
        data.add(new ListData(R.drawable.buah_kiwi, "Kiwi", "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, Tiongkok.\n\nBuah ini awalnya bernama Gosberi Cina, buah ini dinamai kembali dengan alasan ekspor marketing pada tahun 1950-an, menjadi melonette, kemudian kiwi. Nama buah ini berasal dari kiwi — burung yang tak bisa terbang dari Selandia Baru."));
        data.add(new ListData(R.drawable.buah_mangga, "Mangga", "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dan suku Anacardiaceae. Nama ilmiahnya adalah Mangifera indica.\n\nNama buah ini berasal dari Malayalam maanga. Kata ini dipadankan dalam bahasa Indonesia menjadi mangga; dan pada pihak lain, kata ini dibawa ke Eropa oleh orang-orang Portugis dan diserap menjadi manga (bahasa Portugis), mango (bahasa Inggris) dan lain-lain. Nama ilmiahnya sendiri kira-kira mengandung arti: “(pohon) yang berbuah mangga, berasal dari India”."));
        data.add(new ListData(R.drawable.buah_manggis, "Manggis", "Manggis (Garcinia mangostana L.) adalah sejenis pohon hijau abadi dari daerah tropika yang diyakini berasal dari Kepulauan Nusantara.\n\nBuahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah. Buah manggis dalam perdagangan dikenal sebagai \"ratu buah\", sebagai pasangan durian, si \"raja buah\".\n\nBuah ini mengandung mempunyai aktivitas antiinflamasi dan antioksidan. Sehingga di luar negeri buah manggis dikenal sebagai buah yang memiliki kadar antioksidan tertinggi di dunia."));
        data.add(new ListData(R.drawable.buah_nanas, "Nanas", "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae).\n\nBuahnya dalam bahasa Inggris disebut sebagai pineapple karena bentuknya yang seperti pohon pinus. Nama 'nanas' berasal dari sebutan orang Tupi untuk buah ini: anana, yang bermakna \"buah yang sangat baik\".\n\nBurung penghisap madu (hummingbird) merupakan penyerbuk alamiah dari buah ini, meskipun berbagai serangga juga memiliki peran yang sama."));
        data.add(new ListData(R.drawable.buah_pepaya, "Pepaya", "Pepaya (Carica papaya L.), atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya.\n\nC. papaya adalah satu-satunya jenis dalam genus Carica. Nama pepaya dalam bahasa Indonesia diambil dari bahasa Belanda, \"papaja\", yang pada gilirannya juga mengambil dari nama bahasa Arawak, \"papaya\". Dalam bahasa Jawa pepaya disebut \"katès\" dan dalam bahasa Sunda \"gedang\"."));
        data.add(new ListData(R.drawable.buah_semangka, "Semangka", "Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan.\n\nTanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci."));

        // set adapter
        ListAdapter adapter = new ListAdapter(this, R.layout.listitem, data);
        lvList.setAdapter(adapter);

        // bikin action saat data item di list di klik
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent listDetail = new Intent(getApplicationContext(), ListDetail.class);
                listDetail.putExtra("image", data.get(position).image);
                listDetail.putExtra("title", data.get(position).title);
                listDetail.putExtra("description", data.get(position).description);
                startActivity(listDetail);
            }
        });
    }
}