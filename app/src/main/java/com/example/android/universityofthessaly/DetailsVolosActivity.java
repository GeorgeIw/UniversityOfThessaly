package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.detailsVolos.VolosAgricultureDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosArcheologyDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosArchitectureDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosCivilEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosEconScienceDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosElectricalCsDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosIchthyologyDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosLinguIntercultDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosMechEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosPolitismIndustryDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosPreschoolEduDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosPrimaryEduDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosSpatialEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsVolos.VolosSpecialEduDetailsFragment;

public class DetailsVolosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("VolosArchitectureTeachers") || getIntent().hasExtra("VolosArchitectureAnnouncements")){
            VolosArchitectureDetailsFragment volosArchitectureDetailsFragment = new VolosArchitectureDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosArchitectureDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosAgricultureTeachers") || getIntent().hasExtra("VolosAgricultureAnnouncements")){
            VolosAgricultureDetailsFragment volosAgricultureDetailsFragment = new VolosAgricultureDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosAgricultureDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosIchtyologyTeachers") || getIntent().hasExtra("VolosIchthyologyAnnouncements")){
            VolosIchthyologyDetailsFragment volosIchthyologyDetailsFragment = new VolosIchthyologyDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosIchthyologyDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosArcheologyTeachers") || getIntent().hasExtra("VolosArcheologyAnnouncements")){
            VolosArcheologyDetailsFragment volosArcheologyDetailsFragment = new VolosArcheologyDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosArcheologyDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosCivilEnginTeachers") || getIntent().hasExtra("VolosCivilEnginAnnouncements")){
            VolosCivilEnginDetailsFragment volosCivilEnginDetailsFragment = new VolosCivilEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosCivilEnginDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosEconomicalScienceTeachers") || getIntent().hasExtra("VolosEconomicalScienceAnnouncements")){
            VolosEconScienceDetailsFragment volosEconScienceDetailsFragment = new VolosEconScienceDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosEconScienceDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosElectricalCsTeachers") || getIntent().hasExtra("VolosElectricalCsAnnouncements")){
            VolosElectricalCsDetailsFragment volosElectricalCsDetailsFragment = new VolosElectricalCsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosElectricalCsDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosLinguIntercultTeachers") || getIntent().hasExtra("VolosLinguIntercultAnnouncements")){
            VolosLinguIntercultDetailsFragment volosLinguIntercultDetailsFragment = new VolosLinguIntercultDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosLinguIntercultDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosMechEnginTeachers") || getIntent().hasExtra("VolosMechEnginAnnouncements")){
            VolosMechEnginDetailsFragment volosMechEnginDetailsFragment = new VolosMechEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosMechEnginDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosPolitismIndustryTeachers") || getIntent().hasExtra("VolosPolitismIndustryAnnouncements")){
            VolosPolitismIndustryDetailsFragment volosPolitismIndustryDetailsFragment = new VolosPolitismIndustryDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosPolitismIndustryDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosPreschoolEduTeachers") || getIntent().hasExtra("VolosPreschoolEduAnnouncements")){
            VolosPreschoolEduDetailsFragment volosPreschoolEduDetailsFragment = new VolosPreschoolEduDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosPreschoolEduDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosPrimaryEduTeachers") || getIntent().hasExtra("VolosPrimaryEduAnnouncements")){
            VolosPrimaryEduDetailsFragment volosPrimaryEduDetailsFragment = new VolosPrimaryEduDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosPrimaryEduDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosSpacialEnginTeachers") || getIntent().hasExtra("VolosSpacialEnginAnnouncements")){
            VolosSpatialEnginDetailsFragment volosSpatialEnginDetailsFragment = new VolosSpatialEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosSpatialEnginDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("VolosSpecialEduTeachers") || getIntent().hasExtra("VolosSpecialEduAnnouncements")){
            VolosSpecialEduDetailsFragment volosSpecialEduDetailsFragment = new VolosSpecialEduDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,volosSpecialEduDetailsFragment);
            transaction.commit();
        }
    }
}