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

public class LarisaAccFinanceFragment extends Fragment {

    public LarisaAccFinanceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_depts_details, container, false);

        TextView title = rootView.findViewById(R.id.depts_details);
        title.setText(R.string.larisa_accounting_and_finance);
        title.setTextColor(Color.WHITE);
        title.setBackgroundResource(R.color.red);

        ((LarisaDeptsDetailsActivity) Objects.requireNonNull(getActivity())).updateStatusBarColor("#b71c1c");

        final ArrayList<DeptsDetails> deptsDetailsAccFinance = new ArrayList<>();

        deptsDetailsAccFinance.add(new DeptsDetails(R.drawable.teacher_icon_new_png,R.string.teachers));
        deptsDetailsAccFinance.add(new DeptsDetails(R.drawable.announcement_icon_png,R.string.announcements));
        deptsDetailsAccFinance.add(new DeptsDetails(R.drawable.book_icon,R.string.studies));
        deptsDetailsAccFinance.add(new DeptsDetails(R.drawable.map_icon,R.string.map));
        deptsDetailsAccFinance.add(new DeptsDetails(R.drawable.secretary_icon,R.string.secretary));

        DetailsListAdapterLarisa adapter = new DetailsListAdapterLarisa(getActivity(),deptsDetailsAccFinance);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setBackgroundResource(R.color.redLight);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 4){
                    Intent secretary = new Intent(getActivity(), SecretaryActivityLarisa.class);
                    secretary.putExtra("LaccFinanceSecretary",4);
                    startActivity(secretary);
                }
            }
        });

        return rootView;
    }
}