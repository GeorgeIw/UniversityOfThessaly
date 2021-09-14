package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.android.universityofthessaly.DetailsTrikala.TrikalaCivilEnginDetailsFragment;
import com.example.android.universityofthessaly.DetailsTrikala.TrikalaDietDetailsFragment;
import com.example.android.universityofthessaly.DetailsTrikala.TrikalaPhysicalEduDetailsFragment;

public class DetailsTrikalaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_details);

        if(getIntent().hasExtra("TrikalaDietTeachers") || getIntent().hasExtra("TrikalaDietAnnouncements")){
            TrikalaDietDetailsFragment trikalaDietDetailsFragment = new TrikalaDietDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,trikalaDietDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("TrikalaPhysicalEduTeachers") || getIntent().hasExtra("TrikalaPhysicalEduAnnouncements")){
            TrikalaPhysicalEduDetailsFragment trikalaPhysicalEduDetailsFragment = new TrikalaPhysicalEduDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,trikalaPhysicalEduDetailsFragment);
            transaction.commit();

        } else if(getIntent().hasExtra("TrikalaCivilEnginTeachers") || getIntent().hasExtra("TrikalaCivilEnginAnnouncements")){
            TrikalaCivilEnginDetailsFragment trikalaCivilEnginDetailsFragment = new TrikalaCivilEnginDetailsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.department_details_fragment_holder,trikalaCivilEnginDetailsFragment);
            transaction.commit();
        }
    }
}