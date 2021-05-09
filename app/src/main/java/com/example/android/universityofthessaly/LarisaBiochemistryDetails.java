package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LarisaBiochemistryDetails extends Fragment {


    public LarisaBiochemistryDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView titleView = rootView.findViewById(R.id.depts_details);
        titleView.setText(R.string.larisa_biochemistry_biotechnology);
        titleView.setBackgroundResource(R.color.app_color);

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.announcements));

        DetailsListAdapter adapter = new DetailsListAdapter(getActivity(),deptsDetails);
        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setBackgroundResource(R.color.colorPrimary);
        gridView.setAdapter(adapter);

        return rootView;
    }
}