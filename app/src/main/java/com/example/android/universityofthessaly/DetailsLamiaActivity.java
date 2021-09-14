package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.detailsLamia.LamiaCsBiomedicineDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaCsDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaIntegbCompuEnginDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaIntegbPhysTherapyDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaMathsDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaPhysTherapyDetailsFragment;
import com.example.android.universityofthessaly.detailsLamia.LamiaPhysicsDetailsFragment;

public class DetailsLamiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("LamiaCsTeachers") || getIntent().hasExtra("LamiaCsAnnouncements")){
            LamiaCsDetailsFragment lamiaCsDetailsFragment = new LamiaCsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaCsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaCsBiomedicineTeachers") || getIntent().hasExtra("LamiaCsBiomedicineAnnouncements")){
            LamiaCsBiomedicineDetailsFragment lamiaCsBiomedicineDetailsFragment = new LamiaCsBiomedicineDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaCsBiomedicineDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaPhysTherapyTeachers") || getIntent().hasExtra("LamiaPhysTherapyAnnouncements")){
            LamiaPhysTherapyDetailsFragment lamiaPhysTherapyDetailsFragment = new LamiaPhysTherapyDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaPhysTherapyDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaMathsTeachers") || getIntent().hasExtra("LamiaMathsAnnouncements")){
            LamiaMathsDetailsFragment lamiaMathsDetailsFragment = new LamiaMathsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaMathsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaPhysicsTeachers") || getIntent().hasExtra("LamiaPhysicsAnnouncements")){
            LamiaPhysicsDetailsFragment lamiaPhysicsDetailsFragment = new LamiaPhysicsDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaPhysicsDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaIntegbCompuEnginTeachers") || getIntent().hasExtra("LamiaIntegbCompuEnginAnnouncements")){
            LamiaIntegbCompuEnginDetailsFragment lamiaIntegbCompuEnginDetailsFragment = new LamiaIntegbCompuEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaIntegbCompuEnginDetailsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LamiaIntegbPhysTherapyTeachers") || getIntent().hasExtra("LamiaIntegbPhysTherapyAnnouncements")){
            LamiaIntegbPhysTherapyDetailsFragment lamiaIntegbPhysTherapyDetailsFragment = new LamiaIntegbPhysTherapyDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,lamiaIntegbPhysTherapyDetailsFragment);
            transaction.commit();
        }
    }
}