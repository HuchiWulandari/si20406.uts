package com.example.spacemobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.layout1);
        card2 = (CardView) findViewById(R.id.layout2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {
            case R.id.layout1:
                i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;

            case R.id.layout2:
                i = new Intent(this, ThirdActivity.class);
                startActivity(i);
                break;
        }
    }
}
