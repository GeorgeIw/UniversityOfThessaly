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

public class VolosPolitismIndustryFragment extends Fragment {

    public VolosPolitismIndustryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.volos_politism_industry);
        title.setTextColor(Color.WHITE);
        title.setTextSize(20);
        title.setBackgroundResource(R.color.darkBlue);

        ((VolosDeptsDetailsActivity)getActivity()).updateStatusBarColor("#0e47e3");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.studies_icon,R.string.studies));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterVolos adapter = new DetailsListAdapterVolos(getActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.black);
        grid.setAdapter(adapter);

        return rootView;
    }
}