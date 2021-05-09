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


public class LarisaDepartmentsFragment extends Fragment {

    public LarisaDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.activity_uth_depts, container, false);

        //Get the id of the TextView
        TextView CityName = rootView.findViewById(R.id.city_name);

        //Set the text of CityName view
        CityName.setText(R.string.larisa_city);

        //Create the ArrayList Departments using the Depts class
        final ArrayList<Depts> LarisaDepartments = new ArrayList<>();

        //Add the components of the ArrayList
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_biochemistry_biotechnology));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_medicine));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_nursery));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_business_administration));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_accounting_and_finance));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_environment));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_heath_systems));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_digital_systems));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_agriculture_agrotechnology));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.larisa_animal_production_science));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_business_administration));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_electrical_engineering));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_medical_labs));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_accounting_and_finance));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_computer_science));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_mechanical_engineering));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_nursery));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_civil_engineering));
        LarisaDepartments.add(new Depts(R.color.app_color,R.string.integb_larisa_agricultural_technicians));

        //Create a new instance of the Adapter
        DeptsAdapter adapter = new DeptsAdapter(getActivity(),LarisaDepartments);

        //Get the id of the ListView
        ListView LarisaDeptsList = rootView.findViewById(R.id.departments_list);

        //Set the adapter to the ListView 'DeptsList'
        LarisaDeptsList.setAdapter(adapter);

        LarisaDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent biochemistry = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    biochemistry.putExtra("Biochemistry",1);
                    startActivity(biochemistry);
                } else {
                    Intent biochemistry = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    biochemistry.putExtra("Biochemistry",1);
                    startActivity(biochemistry);
                }
            }
        });

        return rootView;
    }
}