package com.dunglv.bi_a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.dunglv.bi_a.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        onClick();
    }

    private void onClick() {
        binding.back.setOnClickListener(view -> finish());
        binding.tvTable.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TableActivity.class);
            startActivity(intent);

        });
        binding.tvStick.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, StickActivity.class);
            startActivity(intent);

        });

    }

}