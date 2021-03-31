package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;


public class ActivityLihatData extends AppCompatActivity{
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Inayah" :
                tvnama.setText("Inayah");
                tvnomor.setText("081222333441");
                break;
            case "Ilham" :
                tvnama.setText("Ilham");
                tvnomor.setText("081222333442");
                break;
            case "Eris" :
                tvnama.setText("Eris");
                tvnomor.setText("081222333443");
                break;
            case "Fikri" :
                tvnama.setText("Fikri");
                tvnomor.setText("081222333444");
                break;
            case "Maul" :
                tvnama.setText("Maul");
                tvnomor.setText("081222333445");
                break;
            case "Intan" :
                tvnama.setText("Intan");
                tvnomor.setText("081222333446");
                break;
            case "Vina" :
                tvnama.setText("Vina");
                tvnomor.setText("081222333447");
                break;
            case "Gita" :
                tvnama.setText("Gita");
                tvnomor.setText("081222333448");
                break;
            case "Lutfi" :
                tvnama.setText("Lutfi");
                tvnomor.setText("081222333449");
                break;
            case "Vian" :
                tvnama.setText("Vian");
                tvnomor.setText("081222333440");
                break;
        }
    }
}

