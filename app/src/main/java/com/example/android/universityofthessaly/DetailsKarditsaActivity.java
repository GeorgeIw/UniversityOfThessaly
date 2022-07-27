package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.detailsKarditsa.KarditsaFoodScienceDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaForestryWoodDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaIntegbDietDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaIntegbFoodScienceDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaIntegbForestryDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaIntegbWoodDesignDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaPublicHealthDetailsFragment;
import com.example.android.universityofthessaly.detailsKarditsa.KarditsaVetDetailsFragment;

public class DetailsKarditsaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("KarditsaPublicHealthTeachers") || getIntent().hasExtra("KarditsaPublicHealthAnnouncements")){
            KarditsaPublicHealthDetailsFragment karditsaPublicHealthDetailsFragment = new KarditsaPublicHealthDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaPublicHealthDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaVetTeachers") || getIntent().hasExtra("KarditsaVetAnnouncements")){
            KarditsaVetDetailsFragment karditsaVetDetailsFragment = new KarditsaVetDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaVetDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaForestryWoodTeachers") || getIntent().hasExtra("KarditsaForestryWoodAnnouncements")){
            KarditsaForestryWoodDetailsFragment karditsaForestryWoodDetailsFragment = new KarditsaForestryWoodDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaForestryWoodDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaFoodScienceTeachers") || getIntent().hasExtra("KarditsaFoodScienceAnnouncements")){
            KarditsaFoodScienceDetailsFragment karditsaFoodScienceDetailsFragment = new KarditsaFoodScienceDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaFoodScienceDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaIntegbForestryTeachers") || getIntent().hasExtra("KarditsaIntegbForestryAnnouncements")){
            KarditsaIntegbForestryDetailsFragment karditsaIntegbForestryDetailsFragment = new KarditsaIntegbForestryDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaIntegbForestryDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaIntegbDietTeachers") || getIntent().hasExtra("KarditsaIntegbDietAnnouncements")){
            KarditsaIntegbDietDetailsFragment karditsaIntegbDietDetailsFragment = new KarditsaIntegbDietDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaIntegbDietDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaIntegbWoodDesignTeachers") || getIntent().hasExtra("KarditsaIntegbWoodDesignAnnouncements")){
            KarditsaIntegbWoodDesignDetailsFragment karditsaIntegbWoodDesignDetailsFragment = new KarditsaIntegbWoodDesignDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaIntegbWoodDesignDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("KarditsaIntegbFoodScienceTeachers") || getIntent().hasExtra("KarditsaIntegbFoodScienceAnnouncements")){
            KarditsaIntegbFoodScienceDetailsFragment karditsaIntegbFoodScienceDetailsFragment = new KarditsaIntegbFoodScienceDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,karditsaIntegbFoodScienceDetailsFragment);
            transaction.commit();
        }
    }
}