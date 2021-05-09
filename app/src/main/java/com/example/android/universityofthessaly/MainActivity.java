package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView larisaTextView = findViewById(R.id.larisa);
        larisaTextView.setOnClickListener(this);

        TextView volosTextView = findViewById(R.id.volos);
        volosTextView.setOnClickListener(this);

        TextView lamiaTextView = findViewById(R.id.lamia);
        lamiaTextView.setOnClickListener(this);

        TextView trikalaTextView = findViewById(R.id.trikala);
        trikalaTextView.setOnClickListener(this);

        TextView karditsaTextView = findViewById(R.id.karditsa);
        karditsaTextView.setOnClickListener(this);

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.larisa :
                Intent larisaDeptsIntent = new Intent(MainActivity.this,UthDeptsActivity.class);
                larisaDeptsIntent.putExtra("larisaExtra",1);
                startActivity(larisaDeptsIntent);
                break;
            case R.id.volos :
                Intent volosDeptsIntent = new Intent(MainActivity.this,UthDeptsActivity.class);
                volosDeptsIntent.putExtra("volosExtra",2);
                startActivity(volosDeptsIntent);
                break;
            case R.id.lamia :
                Intent lamiaDeptsIntent = new Intent(MainActivity.this,UthDeptsActivity.class);
                lamiaDeptsIntent.putExtra("lamiaExtra",3);
                startActivity(lamiaDeptsIntent);
                break;
            case R.id.trikala :
                Intent trikalaDeptsIntent = new Intent(MainActivity.this,UthDeptsActivity.class);
                trikalaDeptsIntent.putExtra("trikalaExtra",4);
                startActivity(trikalaDeptsIntent);
                break;
            case R.id.karditsa :
                Intent karditsaDeptsIntent = new Intent(MainActivity.this,UthDeptsActivity.class);
                karditsaDeptsIntent.putExtra("karditsaExtra",5);
                startActivity(karditsaDeptsIntent);
                break;
        }
    }
}