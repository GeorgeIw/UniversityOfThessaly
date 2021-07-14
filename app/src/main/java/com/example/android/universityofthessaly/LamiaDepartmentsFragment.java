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

        LamiaDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent computerScience = new Intent(getActivity(), LamiaDeptsDetailsActivity.class);
                    computerScience.putExtra("CSLamia", 0);
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