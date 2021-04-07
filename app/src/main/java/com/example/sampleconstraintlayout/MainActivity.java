package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    TextView regis;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.mnDaftar) {
            Intent i = new Intent(getApplicationContext(), formPendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        edemail = findViewById(R.id.edEmail);

        edpassword = findViewById(R.id.edPassword);

        regis = findViewById(R.id.regis);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), FormRegister.class);

                startActivity(i);

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                String email = "admin@mail.com";

                String pass = "123";
                if (!validateEmail() | !validatePassword()) {
                    return;
                }
                if(nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_LONG);

                    t.show();
                    Bundle b = new Bundle();
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                    i.putExtras(b);

                    startActivity(i);

                }else if (!nama.equals(email) && password.equals(pass)){
                    Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG).show();
                }else if (nama.equals(email) && !password.equals(pass)) {
                    Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG).show();
                }else if(!nama.equals(email) &&  (!password.equals(pass))){
                    Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validateEmail() {
        String emailInput = edemail.getEditableText().toString().trim();

        if (emailInput.isEmpty()) {
            edemail.setError("Email tidak boleh kosong!");
            return false;
        } else {
            edemail.setError(null);
            return true;
        }
    }
    private boolean validatePassword() {
        String emailInput = edpassword.getEditableText().toString().trim();

        if (emailInput.isEmpty()) {
            edpassword.setError("Password tidak boleh kosong!");
            return false;
        } else {
            edpassword.setError(null);
            return true;
        }
    }
}
