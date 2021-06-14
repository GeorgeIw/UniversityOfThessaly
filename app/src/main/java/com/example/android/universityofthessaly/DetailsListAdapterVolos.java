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

public class DetailsListAdapterVolos extends ArrayAdapter<DeptsDetails> {

    public DetailsListAdapterVolos(@NonNull Context context, ArrayList<DeptsDetails> deptsDetailsVolos) {
        super(context, 0,deptsDetailsVolos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View detailsViewVolos = convertView;

        if (detailsViewVolos == null){
            detailsViewVolos = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout_volos,parent, false);
        }

        DeptsDetails currentItem = (DeptsDetails) getItem(position);

        ImageView detailsImage = detailsViewVolos.findViewById(R.id.details_img);
        detailsImage.setImageResource(currentItem.getImage());

        TextView detailsText = detailsViewVolos.findViewById(R.id.name_text);
        detailsText.setText(currentItem.getName());

        return detailsViewVolos;
    }
}
