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
        cityName.setBackgroundResource(R.color.indigo);

        ((UthDeptsActivity) requireActivity()).updateStatusBarColor("#1A237E");

        //create the ArrayList Departments
        final ArrayList<Depts> VolosDepartments = new ArrayList<>();


        //Add the components of the ArrayList
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_architecture));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_elec_computer_engineers));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_spatial_engineering));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_mechanical_engineering));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_civil_engineering));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_primary_education));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_special_education));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_preschool_education));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_linguistic_intercultural));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_archeology_anthropology));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_politism_industry));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_economical_science));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_agronomy_ichthyology));
        VolosDepartments.add(new Depts(R.color.indigo,R.string.volos_agriculture));

        //create the adapter instance
        DeptsAdapter adapter = new DeptsAdapter(getActivity(),VolosDepartments);

        //get the view with id : departments_list
        ListView VolosDeptsList = rootView.findViewById(R.id.departments_list);

        //set the adapter on VolosDeptList ListView
        VolosDeptsList.setAdapter(adapter);
        VolosDeptsList.setBackgroundColor(getResources().getColor(R.color.white));

        VolosDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent architecture = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    architecture.putExtra("ArchitectureVolos",0);
                    startActivity(architecture);
                } else if(position == 1){
                    Intent electricalCs = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    electricalCs.putExtra("ElectricalCsVolos",1);
                    startActivity(electricalCs);
                } else if(position == 2){
                    Intent spatialEngin = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    spatialEngin.putExtra("SpatialEnginVolos",2);
                    startActivity(spatialEngin);
                } else if(position == 3){
                    Intent mechEngine = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    mechEngine.putExtra("MechEngineVolos",3);
                    startActivity(mechEngine);
                } else if(position == 4){
                    Intent civilEngin = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    civilEngin.putExtra("CivilEngineVolos",4);
                    startActivity(civilEngin);
                } else if(position == 5){
                    Intent primaryEducation = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    primaryEducation.putExtra("PrimaryEducationVolos",5);
                    startActivity(primaryEducation);
                } else if(position == 6){
                    Intent specialEducation = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    specialEducation.putExtra("SpecialEducationVolos",6);
                    startActivity(specialEducation);
                } else if(position == 7){
                    Intent preschoolEducation = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    preschoolEducation.putExtra("PreschoolEducationVolos",7);
                    startActivity(preschoolEducation);
                } else if(position == 8){
                    Intent linguIntercultural = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    linguIntercultural.putExtra("LinguInterculturalVolos",8);
                    startActivity(linguIntercultural);
                } else if(position == 9){
                    Intent archeologyAnthropology = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    archeologyAnthropology.putExtra("ArcheologyAnthropologyVolos",9);
                    startActivity(archeologyAnthropology);
                } else if(position == 10){
                    Intent politismIndustry = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    politismIndustry.putExtra("PolitismIndustryVolos",10);
                    startActivity(politismIndustry);
                } else if(position == 11){
                    Intent economicalScience = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    economicalScience.putExtra("EconomicalScienceVolos",11);
                    startActivity(economicalScience);
                } else if(position == 12){
                    Intent agronomyIchthyology = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    agronomyIchthyology.putExtra("AgronomyIchthyologyVolos",12);
                    startActivity(agronomyIchthyology);
                } else if(position == 13){
                    Intent agriculture = new Intent(getActivity(),VolosDeptsDetailsActivity.class);
                    agriculture.putExtra("AgricultureVolos",13);
                    startActivity(agriculture);
                }
            }
        });

        return rootView;
    }
}