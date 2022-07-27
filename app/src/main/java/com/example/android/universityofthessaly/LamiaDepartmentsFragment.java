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
import java.util.List;
import java.util.Objects;

public class LamiaDepartmentsFragment extends Fragment {


    public LamiaDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootViewLamia = inflater.inflate(R.layout.activity_uth_depts, container, false);

        //get the TextView
        TextView cityName = rootViewLamia.findViewById(R.id.city_name);
        //set the Text of the TextView
        cityName.setText(R.string.lamia_city);
        //set the Background of the TextView
        cityName.setBackgroundResource(R.color.blueGrey);

        //change the color of the Status Bar
        ((UthDeptsActivity) requireActivity()).updateStatusBarColor("#37474F");

        //create the ArrayList
        final ArrayList<Depts> LamiaDepartments = new ArrayList<>();
        //add the components of the ArrayList
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.lamia_computer_science));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.lamia_cs_biomedicine));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.lamia_physical_therapy));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.lamia_maths));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.lamia_physics));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.integb_lamia_computer_engineering));
        LamiaDepartments.add(new Depts(R.color.blueGrey,R.string.integb_lamia_physical_therapy));

        //create a new instance of the Adapter
        DeptsAdapter LamiaDeptsAdapter = new DeptsAdapter(requireActivity(),LamiaDepartments);
        //get the ListView
        ListView LamiaDeptsList = rootViewLamia.findViewById(R.id.departments_list);
        //set the Adapter to the ListView
        LamiaDeptsList.setAdapter(LamiaDeptsAdapter);
        //set the Background of the ListView
        LamiaDeptsList.setBackgroundColor(getResources().getColor(R.color.white));

        //set the OnItemClickListener, so it can handle onClick effects
        LamiaDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //get the position of the List Item
                if (position == 0) {
                    //create the Intent
                    Intent computerScience = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    //add an extra value to the Intent
                    computerScience.putExtra("CSLamia", 0);
                    //start the Activity
                    startActivity(computerScience);
                } else if (position == 1) {
                    Intent csBiomedicine = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    csBiomedicine.putExtra("CSBiomedicineLamia", 1);
                    startActivity(csBiomedicine);
                } else if (position == 2) {
                    Intent physicalTherapy = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    physicalTherapy.putExtra("PhysicalTherapyLamia", 2);
                    startActivity(physicalTherapy);
                } else if (position == 3) {
                    Intent maths = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    maths.putExtra("MathsLamia", 3);
                    startActivity(maths);
                } else if (position == 4) {
                    Intent physics = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    physics.putExtra("PhysicsLamia", 4);
                    startActivity(physics);
                } else if (position == 5) {
                    Intent cEnginIntegB = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    cEnginIntegB.putExtra("ComputerEngineIntegBLamia", 5);
                    startActivity(cEnginIntegB);
                } else if (position == 6) {
                    Intent physicalTherapyIntegB = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    physicalTherapyIntegB.putExtra("PhysicalTherapyIntegBLamia", 6);
                    startActivity(physicalTherapyIntegB);
                }
            }
            });

        return rootViewLamia;
    }
}