package no.sykehusetkjokkenet.hjertetkafemoss.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class FrontActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(v -> startActivity(new Intent(FrontActivity.this, MainActivity.class)));
    }
}