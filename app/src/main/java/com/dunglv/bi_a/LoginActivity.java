package com.dunglv.bi_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dunglv.bi_a.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        onClick();
    }

    private void onClick() {
        binding.login.setOnClickListener(view -> {
            if (binding.edMk.getText().toString().trim().isEmpty() || binding.edTk.getText().toString().trim().isEmpty()) {
                Toast.makeText(this, "Bạn chưa nhập tài khoản hoặc mật khẩu ", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}