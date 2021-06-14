package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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
        cityName.setBackgroundResource(R.color.darkYellow);

        ((UthDeptsActivity)getActivity()).updateStatusBarColor("#f0b922");

        final ArrayList<Depts> TrikalaDepartments = new ArrayList<>();

        TrikalaDepartments.add(new Depts(R.color.darkYellow,R.string.trikala_diet));
        TrikalaDepartments.add(new Depts(R.color.darkYellow,R.string.trikala_physical_education_athletics));
        TrikalaDepartments.add(new Depts(R.color.darkYellow,R.string.integb_trikala_civil_engineering));

        DeptsAdapter TrikalaDeptsAdapter = new DeptsAdapter(getActivity(),TrikalaDepartments);

        ListView TrikalaListView = rootViewTrikala.findViewById(R.id.departments_list);

        TrikalaListView.setAdapter(TrikalaDeptsAdapter);

        return rootViewTrikala;


    }
}