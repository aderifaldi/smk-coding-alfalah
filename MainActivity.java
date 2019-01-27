package id.smkcoding.helloworld;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//    Deklarasi variable
    private Button btnHello;
    private TextView txtNama;
    private ImageView imgProfile;
    private TextView txtUmur;
    private Button btnPindahHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan);

        //Inisiasi variable
        btnHello = findViewById(R.id.btnHello);
        txtNama = findViewById(R.id.txtNama);
        imgProfile = findViewById(R.id.imgProfile);
        txtUmur = findViewById(R.id.txtUmur);
        btnPindahHalaman = findViewById(R.id.btnPindahHalaman);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilangHalo();
                gantiNama();
                gantiGambar();
                gantiWarnaUmur();
            }
        });

        btnPindahHalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahHalaman();
            }
        });

    }

    private void pindahHalaman() {
        Intent pindahHalaman = new Intent(MainActivity.this, Halaman2.class);
        startActivity(pindahHalaman);
    }

    private void gantiWarnaUmur() {
//        txtUmur.setTextColor(getResources().getColor(R.color.colorPrimary));
        txtUmur.setTextColor(Color.parseColor("#FF00FF"));
    }

    private void gantiGambar() {
        imgProfile.setImageResource(R.drawable.ic_gunung);
    }

    private void gantiNama() {
        txtNama.setText("Wahyu");
    }

    private void bilangHalo() {
        Toast.makeText(MainActivity.this,
                "Halo SMK Al Falah",
                Toast.LENGTH_LONG).show();
    }
}
