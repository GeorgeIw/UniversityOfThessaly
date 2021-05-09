package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class LarisaDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if(getIntent().hasExtra("Biochemistry")){
            LarisaBiochemistryDetails larisaBiochemistryDetails = new LarisaBiochemistryDetails();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaBiochemistryDetails);
            transaction.commit();
        } else{LarisaBiochemistryDetails larisaBiochemistryDetails = new LarisaBiochemistryDetails();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaBiochemistryDetails);
            transaction.commit();}
    }
}