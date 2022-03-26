package com.example.exercise_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class activity_2 extends AppCompatActivity {
    EditText taskint, taskjenis, tasklama;
    FloatingActionButton fab;
    String task, jenis, time, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        taskint = findViewById(R.id.edMasukanTask);
        taskjenis = findViewById(R.id.edmasukanjenistask);
        tasklama = findViewById(R.id.edmasukanlamatask);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                task = taskint.getText().toString();
                jenis = taskjenis.getText().toString();
                time = tasklama.getText().toString();

                if (task.isEmpty() || jenis.isEmpty() || time.isEmpty()) {
                    Snackbar.make(view, "Isi semua Data!", Snackbar.LENGTH_LONG).show();
                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Berhasil", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", task.trim());
                    b.putString("b", jenis.trim());
                    b.putString("c", time.trim());
                    Intent i = new Intent(getApplicationContext(), hasil.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }
}