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
import java.util.Objects;

public class LarisaDigitalSysFragment extends Fragment {

    public LarisaDigitalSysFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        //store the view with id : depts_details in a variable
        TextView title = rootView.findViewById(R.id.depts_details);

        //set the text for the title
        title.setText(R.string.larisa_digital_systems);

        //set the color of the text in title
        title.setTextColor(Color.WHITE);

        //se the color of the Background
        title.setBackgroundResource(R.color.red);

        ((LarisaDeptsDetailsActivity) requireActivity()).updateStatusBarColor("#b71c1c");

        //create the Array List object
        final ArrayList<DeptsDetails> deptsDetailsDigitalSys = new ArrayList<>();

        //add the components of the Array List
        deptsDetailsDigitalSys.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsDigitalSys.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsDigitalSys.add(new DeptsDetails(R.drawable.web_icon,R.string.website));
        deptsDetailsDigitalSys.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        //create the adapter
        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(requireActivity(),deptsDetailsDigitalSys);

        //find and store the view
        GridView grid = rootView.findViewById(R.id.grid);

        //set the background color of the grid
        grid.setBackgroundResource(R.color.redLight);

        //set the adapter on grid
        grid.setAdapter(adapter);

        //create the click listener for the grid
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //the item in position 0
                if(position == 0){
                    //create the Intent teachers
                    Intent teachers = new Intent(getActivity(),DetailsLarisaActivity.class);
                    //add an extra value to the Intent
                    teachers.putExtra("LarisaDigitalSysTeachers",0);
                    //start the activity with this intent
                    startActivity(teachers);
                } else if(position == 1){
                    Intent announcements = new Intent(getActivity(),DetailsLarisaActivity.class);
                    announcements.putExtra("LarisaDigitalSysAnnouncements",1);
                    startActivity(announcements);
                    //the item in position 2
                } else if(position == 2) {
                    //create the Intent and add the url which it will use
                    Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ds.uth.gr/"));
                    //start the activity with this intent
                    //with this command, a new browser window will open with the link stored on the Intent
                    startActivity(browser);
                } else if(position == 3){
                    //create the intent
                    Intent secretary = new Intent(getActivity(), SecretaryActivityLarisa.class);
                    //put an extra value
                    secretary.putExtra("LdigitalSysSecretary",3);
                    //start the transaction
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}