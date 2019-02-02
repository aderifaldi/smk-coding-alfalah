package id.smkcoding.siswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private TextView txtSelamatDatang;

    private Bundle bundle;
    private String nama;

    private List<Nilai> nilai;

    private RecyclerView listNilai;

    private LinearLayoutManager linearLayoutManager;
    private NilaiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtSelamatDatang = findViewById(R.id.txtSelamatDatang);
        listNilai = findViewById(R.id.listNilai);

        adapter = new NilaiAdapter(this);
        linearLayoutManager = new LinearLayoutManager(this);

        listNilai.setAdapter(adapter);
        listNilai.setLayoutManager(linearLayoutManager);

        ambilData();

        nilai = new ArrayList<>();

        nilai.add(new Nilai("Matematika", 50));
        nilai.add(new Nilai("Bilogi", 65));

        loadNilai();

    }

    private void loadNilai() {
        for (int i = 0; i < nilai.size(); i++) {
            adapter.getData().add(nilai.get(i));
            adapter.notifyItemInserted(adapter.getData().size() - 1);
        }

        adapter.notifyDataSetChanged();

    }

    private void ambilData() {
        bundle = getIntent().getExtras();
        nama = bundle.getString("nama");

        txtSelamatDatang.setText("Selamat datang, " + nama);
    }
}
