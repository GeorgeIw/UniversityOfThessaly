package com.example.android.universityofthessaly;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class TrikalaDepartmentsFragment extends Fragment {


    public TrikalaDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootViewTrikala = inflater.inflate(R.layout.activity_uth_depts, container, false);

        TextView cityName = rootViewTrikala.findViewById(R.id.city_name);

        cityName.setText(R.string.trikala_city);
        cityName.setBackgroundResource(R.color.teal);

        ((UthDeptsActivity) requireActivity()).updateStatusBarColor("#004D40");

        final ArrayList<Depts> TrikalaDepartments = new ArrayList<>();

        TrikalaDepartments.add(new Depts(R.color.teal,R.string.trikala_diet));
        TrikalaDepartments.add(new Depts(R.color.teal,R.string.trikala_physical_education_athletics));
        TrikalaDepartments.add(new Depts(R.color.teal,R.string.integb_trikala_civil_engineering));

        DeptsAdapter TrikalaDeptsAdapter = new DeptsAdapter(requireActivity(),TrikalaDepartments);

        ListView TrikalaListView = rootViewTrikala.findViewById(R.id.departments_list);

        TrikalaListView.setAdapter(TrikalaDeptsAdapter);
        TrikalaListView.setBackgroundColor(getResources().getColor(R.color.white));

        TrikalaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent diet = new Intent(getActivity(),TrikalaDeptsDetailsActivity.class);
                    diet.putExtra("TrikalaDiet",0);
                    startActivity(diet);
                } else if(position == 1){
                    Intent physicalEducation = new Intent(getActivity(),TrikalaDeptsDetailsActivity.class);
                    physicalEducation.putExtra("TrikalaPhysicalEdu",1);
                    startActivity(physicalEducation);
                } else {
                    Intent civilEngin = new Intent(getActivity(),TrikalaDeptsDetailsActivity.class);
                    civilEngin.putExtra("TrikalaCivilEngin",2);
                    startActivity(civilEngin);
                }
            }
        });

        return rootViewTrikala;


    }
}