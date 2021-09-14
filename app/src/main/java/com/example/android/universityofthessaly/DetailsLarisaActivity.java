package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.detailsLarisa.LarisaAgricultureDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaAnimalScienceDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaBiochemistryDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaBusinessAdminDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaDigitalSysDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaEnergySysDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaEnviromentDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaFinanceDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaMedicineDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaNurseryDetailsFragment;

public class DetailsLarisaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("LarisaBiochemistryTeachers") || getIntent().hasExtra("LarisaBiochemistryAnnouncements")){
            LarisaBiochemistryDetailsFragment larisaBiochemistryDetailsFragment = new LarisaBiochemistryDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaBiochemistryDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("LarisaMedicineTeachers") || getIntent().hasExtra("LarisaMedicineAnnouncements")){
            LarisaMedicineDetailsFragment larisaMedicineDetailsFragment = new LarisaMedicineDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaMedicineDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("LarisaNurseryTeachers") || getIntent().hasExtra("LarisaNurseryAnnouncements")){
            LarisaNurseryDetailsFragment larisaNurseryDetailsFragment = new LarisaNurseryDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaNurseryDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("LarisaBusinessAdminTeachers") || getIntent().hasExtra("LarisaBusinessAdminAnnouncements")){
            LarisaBusinessAdminDetailsFragment larisaBusinessAdminDetailsFragment = new LarisaBusinessAdminDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaBusinessAdminDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaFinanceTeachers") || getIntent().hasExtra("LarisaFinanceAnnouncements")){
            LarisaFinanceDetailsFragment larisaFinanceDetailsFragment = new LarisaFinanceDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaFinanceDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaEnviromentTeachers") || getIntent().hasExtra("LarisaEnviromentAnnouncements")){
            LarisaEnviromentDetailsFragment larisaEnviromentDetailsFragment = new LarisaEnviromentDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaEnviromentDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaEnergySysDetailsTeachers") || getIntent().hasExtra("LarisaEnergySysDetailsAnnouncements")){
            LarisaEnergySysDetailsFragment larisaEnergySysDetailsFragment = new LarisaEnergySysDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaEnergySysDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaDigitalSysTeachers") || getIntent().hasExtra("LarisaDigitalSysAnnouncements")){
            LarisaDigitalSysDetailsFragment larisaDigitalSysDetailsFragment = new LarisaDigitalSysDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaDigitalSysDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaAgricultureTeachers") || getIntent().hasExtra("LarisaAgricultureAnnouncements")){
            LarisaAgricultureDetailsFragment larisaAgricultureDetailsFragment = new LarisaAgricultureDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaAgricultureDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaAnimalScienceTeachers") || getIntent().hasExtra("LarisaAnimalScienceAnnouncements")){
            LarisaAnimalScienceDetailsFragment larisaAnimalScienceDetailsFragment = new LarisaAnimalScienceDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaAnimalScienceDetailsFragment);
            transaction.commit();
        }
        }
    }