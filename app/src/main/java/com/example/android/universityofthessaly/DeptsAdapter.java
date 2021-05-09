package com.example.android.universityofthessaly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class DeptsAdapter extends ArrayAdapter<Depts> {

    public DeptsAdapter(@NonNull Context context, ArrayList<Depts> Departments) {
        super(context, 0, Departments);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View DeptView = convertView;
        if(DeptView == null){
            DeptView = LayoutInflater.from(getContext()).inflate(R.layout.depts_layout,parent,false);
        }

        Depts currentDept = getItem(position);

        TextView StartingColor = DeptView.findViewById(R.id.list_item_starting_color);
        StartingColor.setBackgroundResource(currentDept.getStartingColor());

        TextView DeptName = DeptView.findViewById(R.id.dept_name);
        DeptName.setText(currentDept.getDeptname());

        return DeptView;
    }
}
