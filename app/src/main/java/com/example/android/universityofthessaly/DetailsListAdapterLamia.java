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

public class DetailsListAdapterLamia extends ArrayAdapter<DeptsDetails> {

    public DetailsListAdapterLamia(@NonNull Context context, ArrayList<DeptsDetails> deptsDetailsLamia) {
        super(context, 0, deptsDetailsLamia);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View detailsViewLamia = convertView;

        if (detailsViewLamia == null) {
            detailsViewLamia = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout_lamia, parent, false);
        }

        DeptsDetails currentItem = getItem(position);

        ImageView detailsImage = detailsViewLamia.findViewById(R.id.details_img);
        detailsImage.setImageResource(currentItem.getImage());

        TextView detailsText = detailsViewLamia.findViewById(R.id.name_text);
        detailsText.setText(currentItem.getName());

        return detailsViewLamia;
    }
}
