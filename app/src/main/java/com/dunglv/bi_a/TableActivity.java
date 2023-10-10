package com.dunglv.bi_a;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dunglv.bi_a.databinding.ActivityTableBinding;


public class TableActivity extends AppCompatActivity {
    private ActivityTableBinding binding;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_table);
        onClick();
    }

    private void onClick() {
        binding.back.setOnClickListener(view -> finish());

        binding.tv1.setOnClickListener(view -> {
            check = true;
            binding.tv1.setBackgroundResource(R.drawable.custom_view);
        });

        binding.tv2.setOnClickListener(view -> {
            check = true;
            binding.tv2.setBackgroundResource(R.drawable.custom_view);
        });


        binding.tvYes.setOnClickListener(view -> {
            if (check) {
                Toast.makeText(this, "Bạn đã chọn xong bàn ", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Bạn chưa chọn bàn ", Toast.LENGTH_LONG).show();
            }
            finish();
        });


        binding.tvNo.setOnClickListener(view -> {
            Toast.makeText(this, "Bạn đã hủy chọn bàn", Toast.LENGTH_LONG).show();
            finish();
        });

    }

}
