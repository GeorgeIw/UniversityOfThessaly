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


public class LarisaEnviromentFragment extends Fragment {

    public LarisaEnviromentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.larisa_environment);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.app_color);

        final ArrayList<DeptsDetails> deptsDetailsEnviroment = new ArrayList<>();

        deptsDetailsEnviroment.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsEnviroment.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsEnviroment.add(new DeptsDetails(R.drawable.studies_icon,R.string.studies));
        deptsDetailsEnviroment.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetailsEnviroment.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(getActivity(),deptsDetailsEnviroment);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.grey);
        grid.setAdapter(adapter);

        return rootView;
    }
}