package com.piotrowski.gibek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                clickCount++;
                if(clickCount > 2) clickCount = 0;
                switch(clickCount) {
                    case 1:
                        btn.setText("Dzień dobry");
                        break;
                    case 2:
                        btn.setText("Do widzenia");
                        break;
                    case 0:
                        btn.setText("Kliknij");
                    default:
                        btn.setText("Kliknij");
                }

            }
        });
    }
}