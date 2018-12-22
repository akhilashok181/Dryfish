package com.example.akhil.dryfish;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity
{

    Button log;
    TextInputEditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username =findViewById(R.id.username);
        password =findViewById(R.id.password);
        log = findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        String u = username.getText().toString();
        String p = password.getText().toString();
        if (u.equals("user@gmail.com") && p.equals("123456"))
        {

            Intent intent = new Intent(getApplicationContext(), dash.class);
            startActivity(intent);
        }
        else
            {
            Toast.makeText(this, "username and password do not matched!", Toast.LENGTH_LONG).show();
        }
    }
}