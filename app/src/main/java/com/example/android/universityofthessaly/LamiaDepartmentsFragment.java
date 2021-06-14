package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LamiaDepartmentsFragment extends Fragment {


    public LamiaDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootViewLamia = inflater.inflate(R.layout.activity_uth_depts, container, false);

        TextView cityName = rootViewLamia.findViewById(R.id.city_name);

        cityName.setText(R.string.lamia_city);
        cityName.setBackgroundResource(R.color.darkPurple);

        ((UthDeptsActivity)getActivity()).updateStatusBarColor("#a3105f");

        final ArrayList<Depts> LamiaDepartments = new ArrayList<>();

        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.lamia_computer_science));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.lamia_cs_biomedicine));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.lamia_physical_therapy));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.lamia_maths));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.lamia_physics));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.integb_lamia_computer_engineering));
        LamiaDepartments.add(new Depts(R.color.darkPurple,R.string.integb_lamia_physical_therapy));

        DeptsAdapter LamiaDeptsAdapter = new DeptsAdapter(getActivity(),LamiaDepartments);

        ListView LamiaDeptsList = rootViewLamia.findViewById(R.id.departments_list);

        LamiaDeptsList.setAdapter(LamiaDeptsAdapter);

        return rootViewLamia;
    }
}