package no.sykehusetkjokkenet.hjertetkafemoss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import no.sykehusetkjokkenet.hjertetkafemoss.MainActivity;
import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class FrontActivity extends AppCompatActivity {
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FrontActivity.this, MainActivity.class));
            }
        });
    }
}