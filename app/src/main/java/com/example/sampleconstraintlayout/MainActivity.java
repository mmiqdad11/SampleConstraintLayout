package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        edemail = findViewById(R.id.edEmail);

        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                if(nama.equals("admin@mail.com") && password.equals("123")) {
                    Toast.makeText(getApplicationContext(),
                    "Login Berhasil", Toast.LENGTH_LONG).show();
                }else if (!nama.equals("admin@mail.com") && password.equals("123")){
                    Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG).show();
                }else if (nama.equals("admin@mail.com") && !password.equals("123")) {
                    Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG).show();
                }else if(!nama.equals("admin@mail.com") &&  (!password.equals("123"))){
                    Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
