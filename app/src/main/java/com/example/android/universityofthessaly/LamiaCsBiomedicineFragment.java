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

public class LamiaCsBiomedicineFragment extends Fragment {

    public LamiaCsBiomedicineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        //get the TextView
        TextView title = rootView.findViewById(R.id.depts_details);
        //set the Text
        title.setText(R.string.lamia_cs_biomedicine);
        //set the Color of the Text
        title.setTextColor(Color.WHITE);
        //set the Background
        title.setBackgroundResource(R.color.blueGrey);

        //change the color of the Status Bar
        ((LamiaDeptsDetailsActivity) requireActivity()).updateStatusBarColor("#37474F");

        //create the ArrayList
        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();
        //add the components of the ArrayList
        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.web_icon,R.string.website));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        //create a new instance of the Adapter
        DetailsListAdapterLamia adapter = new DetailsListAdapterLamia(requireActivity(),deptsDetails);
        //get the GridView
        GridView grid = rootView.findViewById(R.id.grid);
        //set then Background of the GridView
        grid.setBackgroundResource(R.color.blueGreyLight);
        //set the Adapter to the GridView
        grid.setAdapter(adapter);

        //set the OnItemClickListener, so it can handle onClick effects
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //get the position of the List Item
                if(position == 0){
                    //create the Intent
                    Intent teachers = new Intent(getActivity(),DetailsLamiaActivity.class);
                    //add an Extra value to the Intent
                    teachers.putExtra("LamiaCsBiomedicineTeachers",0);
                    //start the Activity
                    startActivity(teachers);
                } else if(position == 1){
                    Intent announcements = new Intent(getActivity(),DetailsLamiaActivity.class);
                    announcements.putExtra("LamiaCsBiomedicineAnnouncements",1);
                    startActivity(announcements);
                } else if(position == 2){
                    //create the Intent
                    //add the url to be opened
                    Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dib.uth.gr/"));
                    startActivity(browser);
                } else if(position == 3){
                    Intent secretary = new Intent(getActivity(),SecretaryActivityLamia.class);
                    secretary.putExtra("LamiaCsBiomedicineSecretary",3);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}