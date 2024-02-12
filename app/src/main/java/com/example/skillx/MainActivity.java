package com.example.skillx;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.skillx.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        editTextUsername = findViewById(R.id.editTextUsername);
//        editTextPassword = findViewById(R.id.editTextPassword);
//        buttonLogin = findViewById(R.id.buttonLogin);
//        textViewResult = findViewById(R.id.textViewResult);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Perform authentication logic here (e.g., check username and password).
                // Display result in textViewResult.
                // For example:
                if (username.equals("user") && password.equals("password")) {
                    textViewResult.setText("Login successful!");
                } else {
                    textViewResult.setText("Login failed!");
                }
            }
        });
    }
}
