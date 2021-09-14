package com.example.android.universityofthessaly;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class LamiaPhysicsFragment extends Fragment {

    public LamiaPhysicsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.lamia_physics);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.blueGrey);

        ((LamiaDeptsDetailsActivity) requireActivity()).updateStatusBarColor("#37474F");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.book_icon,R.string.studies));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLamia adapter = new DetailsListAdapterLamia(requireActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.blueGreyLight);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent teachers = new Intent(getActivity(),DetailsLamiaActivity.class);
                    teachers.putExtra("LamiaPhysicsTeachers",0);
                    startActivity(teachers);
                } else if(position == 1){
                    Intent announcements = new Intent(getActivity(),DetailsLamiaActivity.class);
                    announcements.putExtra("LamiaPhysicsAnnouncements",1);
                    startActivity(announcements);
                }
                if(position == 4){
                    Intent secretary = new Intent(getActivity(),SecretaryActivityLamia.class);
                    secretary.putExtra("LamiaPhysicsSecretary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}