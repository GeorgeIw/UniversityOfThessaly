package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbAgriculturalDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbBusinessAdminDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbCivilEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbCsDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbElEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbLogisticsDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbMechEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbMedicalLabsDetailsFragment;
import com.example.android.universityofthessaly.detailsLarisa.LarisaIntegbNurseryDetailsFragment;

public class DetailsLarisaSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("LarisaIntegbBusinessAdminTeachers") || getIntent().hasExtra("LarisaIntegbBusinessAdminAnnouncemets")){
            LarisaIntegbBusinessAdminDetailsFragment larisaIntegbBusinessAdminDetailsFragment = new LarisaIntegbBusinessAdminDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbBusinessAdminDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbElEnginTeachers") || getIntent().hasExtra("LarisaIntegbElEnginAnnouncements")){
            LarisaIntegbElEnginDetailsFragment larisaIntegbElEnginDetailsFragment = new LarisaIntegbElEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbElEnginDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbMedicalLabsTeachers") || getIntent().hasExtra("LarisaIntegbMedicalLabsAnnouncements")){
            LarisaIntegbMedicalLabsDetailsFragment larisaIntegbMedicalLabsDetailsFragment = new LarisaIntegbMedicalLabsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbMedicalLabsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbLogisticsTeachers") || getIntent().hasExtra("LarisaIntegbLogisticsAnnouncements")){
            LarisaIntegbLogisticsDetailsFragment larisaIntegbLogisticsDetailsFragment = new LarisaIntegbLogisticsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbLogisticsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbCsTeachers") || getIntent().hasExtra("LarisaIntegbCsAnnouncements")){
            LarisaIntegbCsDetailsFragment larisaIntegbCsDetailsFragment = new LarisaIntegbCsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbCsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbMechEnginTeachers") || getIntent().hasExtra("LarisaIntegbMechEnginAnnouncements")){
            LarisaIntegbMechEnginDetailsFragment larisaIntegbMechEnginDetailsFragment = new LarisaIntegbMechEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbMechEnginDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbNurseryTeachers") || getIntent().hasExtra("LarisaIntegbNurseryAnnouncements")){
            LarisaIntegbNurseryDetailsFragment larisaIntegbNurseryDetailsFragment = new LarisaIntegbNurseryDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbNurseryDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbCivilEnginTeachers") || getIntent().hasExtra("LarisaIntegbCivilEnginAnnouncements")){
            LarisaIntegbCivilEnginDetailsFragment larisaIntegbCivilEnginDetailsFragment = new LarisaIntegbCivilEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbCivilEnginDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LarisaIntegbAgriculturalTeachers") || getIntent().hasExtra("LarisaIntegbAgriculturalAnnouncements")){
            LarisaIntegbAgriculturalDetailsFragment larisaIntegbAgriculturalDetailsFragment = new LarisaIntegbAgriculturalDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,larisaIntegbAgriculturalDetailsFragment);
            transaction.commit();
        }
    }
}