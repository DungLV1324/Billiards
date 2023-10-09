package com.dunglv.bi_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dunglv.bi_a.databinding.ActivityGayBinding;

public class StickActivity extends AppCompatActivity {
    private ActivityGayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_gay);
        onClick();
    }

    private void onClick() {
        binding.back.setOnClickListener(view -> finish());
        binding.tv1.setOnClickListener(view -> {
            binding.tv1.setBackgroundResource(R.drawable.custom_view);

        });

        binding.tv2.setOnClickListener(view -> {
            binding.tv2.setBackgroundResource(R.drawable.custom_view);


        });
        binding.tv3.setOnClickListener(view -> {
            binding.tv3.setBackgroundResource(R.drawable.custom_view);


        });
        binding.tvYes.setOnClickListener(view -> {
            binding.tvYes.setBackgroundResource(R.drawable.custom_view);
            Toast.makeText(this, "Bạn đã chọn xong gậy ", Toast.LENGTH_SHORT).show();
            finish();

        });

        binding.tvNo.setOnClickListener(view -> {
            binding.tvNo.setBackgroundResource(R.drawable.custom_view);
            Toast.makeText(this, "Bạn đã hủy chọn gậy", Toast.LENGTH_SHORT).show();
            finish();

        });

    }

}
