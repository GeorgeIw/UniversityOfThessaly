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

public class VolosAgricultureFragment extends Fragment {

    public VolosAgricultureFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.volos_agriculture);
        title.setTextColor(Color.WHITE);
        title.setTextSize(20);
        title.setBackgroundResource(R.color.indigo);

        ((VolosDeptsDetailsActivity) Objects.requireNonNull(getActivity())).updateStatusBarColor("#1A237E");

        final ArrayList<DeptsDetails> deptsDetails = new ArrayList<>();

        deptsDetails.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetails.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetails.add(new DeptsDetails(R.drawable.book_icon,R.string.studies));
        deptsDetails.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetails.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterVolos adapter = new DetailsListAdapterVolos(getActivity(),deptsDetails);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.indigoGridBackground);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 4){
                    Intent secretary = new Intent(getActivity(),SecretaryActivityVolos.class);
                    secretary.putExtra("VagricultureSecretary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}