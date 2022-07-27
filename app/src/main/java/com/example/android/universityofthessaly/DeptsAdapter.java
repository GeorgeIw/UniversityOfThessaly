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

        //recycle the views on the screen
        //load only the views that the user is currently viewing and not the whole list
        View DeptView = convertView;
        if(DeptView == null){
            DeptView = LayoutInflater.from(getContext()).inflate(R.layout.depts_layout,parent,false);
        }

        //variable to get the position of each List item
        Depts currentDept = getItem(position);

        // find the view with id list_item_starting_color and store it to Starting color variable
        TextView StartingColor = DeptView.findViewById(R.id.list_item_starting_color);

        //set the Background resource of this view
        StartingColor.setBackgroundResource(currentDept.getStartingColor());

        TextView DeptName = DeptView.findViewById(R.id.dept_name);

        //set the Text of this view
        DeptName.setText(currentDept.getDeptname());

        return DeptView;
    }
}
