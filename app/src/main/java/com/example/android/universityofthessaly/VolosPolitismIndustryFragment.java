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
        title.setBackgroundResource(R.color.indigo);

        ((VolosDeptsDetailsActivity) requireActivity()).updateStatusBarColor("#1A237E");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.web_icon,R.string.website));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterVolos adapter = new DetailsListAdapterVolos(requireActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.indigoGridBackground);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent teachers = new Intent(getActivity(),DetailsVolosActivity.class);
                    teachers.putExtra("VolosPolitismIndustryTeachers",0);
                    startActivity(teachers);
                } else if(position == 1){
                    Intent announcements = new Intent(getActivity(),DetailsVolosActivity.class);
                    announcements.putExtra("VolosPolitismIndustryAnnouncements",1);
                    startActivity(announcements);
                } else if(position == 2){
                    Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uth.gr/spoydes/proptychiakes/schools-departments/sholi-anthropistikon-kai-koinonikon-epistimon/tmima-politismoy-kai-dimioyrgikon-meson-kai-biomihanion"));
                    startActivity(browser);
                } else if(position ==4){
                    Intent secretary = new Intent(getActivity(),SecretaryActivityVolos.class);
                    secretary.putExtra("VpolitismIndustrySecretary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}