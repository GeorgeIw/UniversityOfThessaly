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

        //set the Background color of the View
        CityName.setBackgroundColor(getResources().getColor(R.color.red));

        ((UthDeptsActivity) requireActivity()).updateStatusBarColor("#b71c1c");

        //Create the ArrayList Departments using the Depts class
        final ArrayList<Depts> LarisaDepartments = new ArrayList<>();

        //Add the components of the ArrayList
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_biochemistry_biotechnology));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_medicine));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_nursery));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_business_administration));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_accounting_and_finance));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_environment));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_energy_systems));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_digital_systems));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_agriculture_agrotechnology));
        LarisaDepartments.add(new Depts(R.color.red,R.string.larisa_animal_production_science));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_business_administration));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_electrical_engineering));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_medical_labs));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_logistics));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_computer_science));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_mechanical_engineering));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_nursery));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_civil_engineering));
        LarisaDepartments.add(new Depts(R.color.red,R.string.integb_larisa_agricultural_technicians));

        //Create a new instance of the Adapter
        DeptsAdapter adapter = new DeptsAdapter(requireActivity(),LarisaDepartments);

        //Get the id of the ListView
        ListView LarisaDeptsList = rootView.findViewById(R.id.departments_list);

        //Set the adapter to the ListView 'DeptsList'
        LarisaDeptsList.setAdapter(adapter);

        //set the Background Color of the ListView "LarisaDeptsList"
        LarisaDeptsList.setBackgroundColor(getResources().getColor(R.color.white));

        LarisaDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent biochemistry = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    biochemistry.putExtra("Biochemistry",1);
                    startActivity(biochemistry);
                } else if(position == 1) {
                    Intent medicine = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    medicine.putExtra("Medicine",2);
                    startActivity(medicine);
                } else if(position == 2) {
                    Intent nursery = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    nursery.putExtra("Nursery",3);
                    startActivity(nursery);
                } else if(position == 3){
                    Intent businessAdmin = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    businessAdmin.putExtra("BusinessAdmin",4);
                    startActivity(businessAdmin);
                } else if(position == 4){
                    Intent accFinance = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    accFinance.putExtra("AccFinance",5);
                    startActivity(accFinance);
                } else if(position == 5){
                    Intent environment = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    environment.putExtra("Environment",6);
                    startActivity(environment);
                } else if(position == 6){
                    Intent healthSys = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    healthSys.putExtra("HealthSystems",7);
                    startActivity(healthSys);
                } else if(position == 7){
                    Intent digitalSys = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    digitalSys.putExtra("DigitalSystems",8);
                    startActivity(digitalSys);
                } else if(position == 8){
                    Intent agriculture = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    agriculture.putExtra("Agriculture",9);
                    startActivity(agriculture);
                } else if(position == 9){
                    Intent animalScience = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    animalScience.putExtra("AnimalScience",10);
                    startActivity(animalScience);
                } else if(position == 10){
                    Intent businessAdminIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    businessAdminIntegB.putExtra("BusinessAdministrationIntegB",11);
                    startActivity(businessAdminIntegB);
                } else if(position == 11){
                    Intent electricalEnginIntegB = new Intent (getActivity(),LarisaDeptsDetailsActivity.class);
                    electricalEnginIntegB.putExtra("ElectricalEnginIntegB",12);
                    startActivity(electricalEnginIntegB);
                } else if(position == 12){
                    Intent medicalLabsIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    medicalLabsIntegB.putExtra("MedicalLabsIntegB",13);
                    startActivity(medicalLabsIntegB);
                } else if(position == 13){
                    Intent accFinanceIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    accFinanceIntegB.putExtra("AccFinanceIntegB",14);
                    startActivity(accFinanceIntegB);
                } else if(position == 14){
                    Intent computerScienceIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    computerScienceIntegB.putExtra("ComputerScienceIntegB",15);
                    startActivity(computerScienceIntegB);
                } else if(position == 15){
                    Intent mechEnginIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    mechEnginIntegB.putExtra("MechEngineIntegB",16);
                    startActivity(mechEnginIntegB);
                } else if(position == 16){
                    Intent nurseryIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    nurseryIntegB.putExtra("NurseryIntegB",17);
                    startActivity(nurseryIntegB);
                } else if(position == 17){
                    Intent civilEnginIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    civilEnginIntegB.putExtra("CivilEnginIntegB",18);
                    startActivity(civilEnginIntegB);
                } else if(position == 18){
                    Intent agriculturalIntegB = new Intent(getActivity(),LarisaDeptsDetailsActivity.class);
                    agriculturalIntegB.putExtra("AgriculturalIntegB",19);
                    startActivity(agriculturalIntegB);
                }
            }
        });

        return rootView;
    }
}