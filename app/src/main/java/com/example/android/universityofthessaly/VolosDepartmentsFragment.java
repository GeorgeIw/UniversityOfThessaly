package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class VolosDepartmentsFragment extends Fragment {

    public VolosDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.activity_uth_depts, container, false);

       //store the view with id : city_name to cityName variable
        TextView cityName = rootView.findViewById(R.id.city_name);

        //set the text on cityName
        cityName.setText(R.string.volos_city);

        //create the ArrayList Departments
        final ArrayList<Depts> VolosDepartments = new ArrayList<>();

        //Add the components of the ArrayList
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_architecture));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_elec_computer_engineers_));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_spatial_engineering));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_mechanical_engineering));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_civil_engineering));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_primary_education));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_special_teaching));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_preschool_education));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_linguistic_intercultural));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_archeology_anthropology));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_politism_industry));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_economical_science));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_agronomy_ichthyology));
        VolosDepartments.add(new Depts(R.color.colorAccent,R.string.volos_agriculture));

        //create the adapter instance
        DeptsAdapter adapter = new DeptsAdapter(getActivity(),VolosDepartments);

        //get the view with id : departments_list
        ListView VolosDeptsList = rootView.findViewById(R.id.departments_list);

        //set the adapter on VolosDeptList ListView
        VolosDeptsList.setAdapter(adapter);

        return rootView;
    }
}