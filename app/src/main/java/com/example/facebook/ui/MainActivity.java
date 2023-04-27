package com.example.facebook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.facebook.R;
import com.example.facebook.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //check password is correct

                Intent intent = new Intent(MainActivity.this, Calculator.class);
                intent.putExtra("EMAIL",binding.edEmail.getText().toString());
                startActivity(intent);

            }
        });


    }
}