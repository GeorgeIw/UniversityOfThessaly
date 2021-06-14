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

public class LarisaNurseryFragment extends Fragment {

    public LarisaNurseryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details,container,false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.larisa_nursery);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.app_color);

        final ArrayList<DeptsDetails> deptsDetailsNursery = new ArrayList<>();

        deptsDetailsNursery.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsNursery.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsNursery.add(new DeptsDetails(R.drawable.studies_icon,R.string.studies));
        deptsDetailsNursery.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetailsNursery.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(getActivity(),deptsDetailsNursery);
        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setBackgroundResource(R.color.black);
        gridView.setAdapter(adapter);

        return rootView;
    }
}