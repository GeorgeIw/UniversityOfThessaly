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


public class KarditsaIntegBDietFragment extends Fragment {

    public KarditsaIntegBDietFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.integb_karditsa_diet);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.deepOrange);

        ((KarditsaDeptsDetailsActivity)requireActivity()).updateStatusBarColor("#BF360C");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.book_icon,R.string.studies));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterKarditsa adapter = new DetailsListAdapterKarditsa(requireActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.deepOrangeLight);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent teachers = new Intent(getActivity(),DetailsKarditsaActivity.class);
                    teachers.putExtra("KarditsaIntegbDietTeachers",0);
                    startActivity(teachers);

                } else if(position == 1){
                    Intent announcements = new Intent(getActivity(),DetailsKarditsaActivity.class);
                    announcements.putExtra("KarditsaIntegbDietAnnouncements",1);
                    startActivity(announcements);

                } else if(position == 4){
                    Intent secretary = new Intent(getActivity(),SecretaryActivityKarditsa.class);
                    secretary.putExtra("KintegbDietSecretary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}