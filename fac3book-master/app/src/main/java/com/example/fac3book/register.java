package com.example.fac3book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username = (EditText) findViewById(R.id.username_regis);
        EditText password = (EditText) findViewById(R.id.password_regis);
        EditText confirm_password = (EditText) findViewById(R.id.confirm_password_regis);
        EditText email = (EditText) findViewById(R.id.email_regis);
        Button register = (Button) findViewById(R.id.register_button);
    }

    public void redirect(View v){
        Intent i = new Intent(getApplicationContext(),login.class);
        startActivity(i);
    }
}