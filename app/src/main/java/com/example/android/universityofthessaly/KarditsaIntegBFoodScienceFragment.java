package com.example.android.universityofthessaly;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class KarditsaIntegBFoodScienceFragment extends Fragment {


    public KarditsaIntegBFoodScienceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.integb_karditsa_food_science);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.darkMauve);

        ((KarditsaDeptsDetailsActivity)getActivity()).updateStatusBarColor("#910dbd");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.book_icon,R.string.studies));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterKarditsa adapter = new DetailsListAdapterKarditsa(getActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.grey);
        grid.setAdapter(adapter);

        return rootView;
    }
}