package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SecretaryActivityLamia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secretary);

        if(getIntent().hasExtra("LamiaCsSecretary") || getIntent().hasExtra("LamiaCsBiomedicineSecretary") || getIntent().hasExtra("LamiaPhysTherapySecretary")
        || getIntent().hasExtra("LamiaMathsSecretary") || getIntent().hasExtra("LamiaPhysicsSecretary") || getIntent().hasExtra("LamiaIntegBcsSecretary")
        || getIntent().hasExtra("LamiaIntegbPhysTherapySecretary")){

            SecretaryLamiaFragment secretaryLamiaFragment = new SecretaryLamiaFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.secretary_fragment_holder,secretaryLamiaFragment);
            transaction.commit();
        }
    }

    public void updateStatusBarColor(String color){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
}