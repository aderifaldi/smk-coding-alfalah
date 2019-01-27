package id.smkcoding.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    private TextView txtNama;
    private TextView txtUmur;

    private String nama;
    private String umur;

    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan);

        //ambil data
        bundle = getIntent().getExtras();
        nama = bundle.getString("nama");
        umur = bundle.getString("umur");

        txtNama = findViewById(R.id.txtNama);
        txtUmur = findViewById(R.id.txtUmur);

        gantiNamadanUmur();

    }

    private void gantiNamadanUmur() {
        txtNama.setText(nama);
        txtUmur.setText(umur);
    }


}
