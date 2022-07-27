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
        cityName.setBackgroundResource(R.color.deepOrange);

        ((UthDeptsActivity) requireActivity()).updateStatusBarColor("#BF360C");

        final ArrayList<Depts> KarditsaDepartments = new ArrayList<>();
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.karditsa_public_health));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.karditsa_vet));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.karditsa_forestry_wood));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.karditsa_food_science));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.integb_karditsa_forestry_enviroment));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.integb_karditsa_diet));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.integb_karditsa_wood_design));
        KarditsaDepartments.add(new Depts(R.color.deepOrange,R.string.integb_karditsa_food_science));

        DeptsAdapter KarditsaDeptsAdapter = new DeptsAdapter(requireActivity(),KarditsaDepartments);

        ListView KarditsaDeptsList = rootviewKarditsa.findViewById(R.id.departments_list);

        KarditsaDeptsList.setAdapter(KarditsaDeptsAdapter);
        KarditsaDeptsList.setBackgroundColor(getResources().getColor(R.color.white));

        KarditsaDeptsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent publicHealth = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    publicHealth.putExtra("KarditsaPublicHealth",0);
                    startActivity(publicHealth);
                } else if(position == 1){
                    Intent vet = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    vet.putExtra("KarditsaVet",1);
                    startActivity(vet);
                } else if(position == 2){
                    Intent forestryWood = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    forestryWood.putExtra("KarditsaForestryWood",2);
                    startActivity(forestryWood);
                } else if(position == 3){
                    Intent foodScience = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    foodScience.putExtra("KarditsaFoodScience",3);
                    startActivity(foodScience);
                } else if(position == 4){
                    Intent integbForestry = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    integbForestry.putExtra("KarditsaIntegBForestry",4);
                    startActivity(integbForestry);
                } else if(position == 5){
                    Intent integBDiet = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    integBDiet.putExtra("KarditsaIntegBDiet",5);
                    startActivity(integBDiet);
                } else if(position == 6){
                    Intent integBWood = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    integBWood.putExtra("KarditsaIntegBWood",6);
                    startActivity(integBWood);
                } else {
                    Intent integBFoodScience = new Intent(getActivity(),KarditsaDeptsDetailsActivity.class);
                    integBFoodScience.putExtra("KarditsaIntegBFoodScience",7);
                    startActivity(integBFoodScience);
                }
            }
        });

        return rootviewKarditsa;
    }
}