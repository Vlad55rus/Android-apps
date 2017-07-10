package ru.omgtu.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    Intent intent;
    Button pereh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        intent = new Intent(ActivityTwo.this, Main.class);
        pereh = (Button) findViewById(R.id.bnOk);
        View.OnClickListener per = new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        };
        pereh.setOnClickListener(per);
    }
}