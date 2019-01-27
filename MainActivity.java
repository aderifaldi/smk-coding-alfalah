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
private Button btnhello;
    private Button btnhello2;
    private TextView txtnama;
    private TextView txtumur;
    private TextView txtkelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisiasi variable
        btnhello = findViewById(R.id.btnhello);
        btnhello2 = findViewById(R.id.btnhello2);
        txtnama = findViewById(R.id.txtnama);
        txtumur = findViewById(R.id.txtumur);
        txtkelas = findViewById(R.id.txtkelas);
        btnhello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gantinama();
                gantiumur();
                gantikelas();
                gantiwarnaumur();
            }
        });
        btnhello2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                BilangHallo();
                pindahHalaman();
            }
        });

    }

    private void gantiwarnaumur() {
        txtumur.setTextColor(Color.parseColor("#FF00FF"));
    }

    private void gantikelas() {
        Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
    }

    private void gantiumur() {
        Toast.makeText(this, "10 th", Toast.LENGTH_SHORT).show();
    }

    private void gantinama() {
        Toast.makeText(this, "Ahmad", Toast.LENGTH_SHORT).show();
    }

    private void BilangHallo() {
        Toast.makeText(this, "Hallo", Toast.LENGTH_SHORT).show();
    }

    private void pindahHalaman() {
        Intent intentPindahHalaman =
                new Intent(MainActivity.this, Halaman2.class);

        //mengirim data dengan format: variabel, isi
        intentPindahHalaman.putExtra("nama", "Eli Siti Saadah");
        intentPindahHalaman.putExtra("umur", "17 th");

        startActivity(intentPindahHalaman);
    }
}
