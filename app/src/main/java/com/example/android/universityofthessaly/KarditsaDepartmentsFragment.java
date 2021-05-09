package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class KarditsaDepartmentsFragment extends Fragment {

    public KarditsaDepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootviewKarditsa = inflater.inflate(R.layout.activity_uth_depts,container, false);

        TextView cityName = rootviewKarditsa.findViewById(R.id.city_name);

        cityName.setText(R.string.karditsa_city);

        final ArrayList<Depts> KarditsaDepartments = new ArrayList<>();
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.karditsa_public_health));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.karditsa_vet));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.karditsa_forestry_wood));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.karditsa_food_science));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.integb_karditsa_forestry_enviroment));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.integb_karditsa_diet));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.integb_karditsa_wood_design));
        KarditsaDepartments.add(new Depts(R.color.colorPrimaryDark,R.string.integb_karditsa_food_science));

        DeptsAdapter KarditsaDeptsAdapter = new DeptsAdapter(getActivity(),KarditsaDepartments);

        ListView KarditsaDeptsList = rootviewKarditsa.findViewById(R.id.departments_list);

        KarditsaDeptsList.setAdapter(KarditsaDeptsAdapter);

        return rootviewKarditsa;
    }
}