package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class SecretaryActivityKarditsa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secretary);

        if(getIntent().hasExtra("KpublicHealthSecretary") || getIntent().hasExtra("karditsa_public_health_secry_") || getIntent().hasExtra("KforestrySecretary")
        || getIntent().hasExtra("KfoodScienceSecretary") || getIntent().hasExtra("KintegbForestrySecretary") || getIntent().hasExtra("KintegbDietSecretary") || getIntent().hasExtra("KintegbWoodDesignSecretary")
        || getIntent().hasExtra("KintegbFoodScienceSecretary")){

            SecretaryKarditsaFragment secretaryKarditsaFragment = new SecretaryKarditsaFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.secretary_fragment_holder,secretaryKarditsaFragment);
            transaction.commit();

        }
    }
}