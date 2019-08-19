package com.example.soallatihanpwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button gofood1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);

        Button gofood1 = findViewById(R.id.button);
        gofood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                intent.putExtra(Main3Activity.NAMA_EXTRA, editText.getText().toString());
                intent.putExtra(Main3Activity.ALAMAT_EXTRA, editText2.getText().toString());
                intent.putExtra(Main3Activity.PESANAN_EXTRA, editText3.getText().toString());
                startActivity(intent);
            }
        });
    }
}
