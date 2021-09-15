package com.example.android.universityofthessaly;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class LarisaBiochemistryFragment extends Fragment {


    public LarisaBiochemistryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView titleView = rootView.findViewById(R.id.depts_details);
        titleView.setText(R.string.larisa_biochemistry_biotechnology);
        titleView.setTextColor(Color.WHITE);
        titleView.setBackgroundResource(R.color.red);

        ((LarisaDeptsDetailsActivity) requireActivity()).updateStatusBarColor("#b71c1c");

        final ArrayList<DeptsDetails> deptsDetailsBiochemistry = new ArrayList<>();

        deptsDetailsBiochemistry.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsBiochemistry.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsBiochemistry.add(new DeptsDetails(R.drawable.web_icon,R.string.website));
        deptsDetailsBiochemistry.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetailsBiochemistry.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(getActivity(),deptsDetailsBiochemistry);
        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setBackgroundResource(R.color.redLight);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position == 0){
                    Intent teachers = new Intent(getActivity(), DetailsLarisaActivity.class);
                    teachers.putExtra("LarisaBiochemistryTeachers",0);
                    startActivity(teachers);
                } else if(position == 1) {
                    Intent announcements = new Intent(getActivity(),DetailsLarisaActivity.class);
                    announcements.putExtra("LarisaBiochemistryAnnouncements",1);
                    startActivity(announcements);
                } else if(position == 2){
                    Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bio.uth.gr/"));
                    startActivity(browser);
                } else if(position == 4){
                    Intent secretary = new Intent(getActivity(), SecretaryActivityLarisa.class);
                    secretary.putExtra("LbiochemistrySecratary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}