package com.example.android.universityofthessaly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DetailsListAdapterLarisa extends ArrayAdapter<DeptsDetails> {


    public DetailsListAdapterLarisa(@NonNull Context context, ArrayList<DeptsDetails> detailsList) {
        super(context, 0, detailsList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View DetailsViewLarisa = convertView;
        if(DetailsViewLarisa == null){
            DetailsViewLarisa = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout_larisa,parent, false);
        }

        DeptsDetails currentItem = getItem(position);

        ImageView DetailImage = DetailsViewLarisa.findViewById(R.id.details_img);
        DetailImage.setImageResource(currentItem.getImage());

        TextView DetailName = DetailsViewLarisa.findViewById(R.id.name_text);
        DetailName.setText(currentItem.getName());

        return DetailsViewLarisa;
    }
}
