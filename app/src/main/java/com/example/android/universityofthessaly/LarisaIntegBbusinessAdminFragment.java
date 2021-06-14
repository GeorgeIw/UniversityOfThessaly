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

public class LarisaIntegBbusinessAdminFragment extends Fragment {


    public LarisaIntegBbusinessAdminFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.integb_larisa_business_administration);
        title.setTextColor(Color.WHITE);
        title.setTextSize(20);
        title.setBackgroundResource(R.color.app_color);

        final ArrayList<DeptsDetails> deptsDetailsintegBbusinessAdmin = new ArrayList<>();

        deptsDetailsintegBbusinessAdmin.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsintegBbusinessAdmin.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsintegBbusinessAdmin.add(new DeptsDetails(R.drawable.studies_icon,R.string.studies));
        deptsDetailsintegBbusinessAdmin.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetailsintegBbusinessAdmin.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(getActivity(),deptsDetailsintegBbusinessAdmin);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.black);
        grid.setAdapter(adapter);

        return rootView;
    }
}