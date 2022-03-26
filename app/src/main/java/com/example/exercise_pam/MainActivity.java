package com.example.exercise_pam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edname, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.bSignin);
        edname = findViewById(R.id.edname);
        edpassword = findViewById(R.id.edpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edname.getText().toString();
                password = edpassword.getText().toString();

                String name = "asra";
                String pass = "111";

                if (password.isEmpty() || nama.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email & Password wajib Diisi!", Toast.LENGTH_LONG);

                    t.show();
                }
                if (password.equals(pass) && nama.equals(name)) {

                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), activity_2.class);
                    i.putExtras(b);

                    startActivity(i);

                }
                else {

                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}