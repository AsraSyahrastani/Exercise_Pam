package com.example.exercise_pam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class hasil extends AppCompatActivity {

    TextView edTaskHasil, edHasilJenis, edWaktuHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        edTaskHasil = findViewById(R.id.edTaskHasil);
        edHasilJenis = findViewById(R.id.edHasilJenis);
        edWaktuHasil = findViewById(R.id.edWaktuHasil);

        Bundle bundle = getIntent().getExtras();

        String task = bundle.getString("a");
        String jenis = bundle.getString("b");
        String time = bundle.getString("c");

        edTaskHasil.setText(task);
        edHasilJenis.setText(jenis);
        edWaktuHasil.setText(time);
    }
}