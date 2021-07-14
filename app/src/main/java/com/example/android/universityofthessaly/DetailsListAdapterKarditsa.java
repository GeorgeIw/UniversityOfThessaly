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

public class DetailsListAdapterKarditsa extends ArrayAdapter<DeptsDetails> {

    public DetailsListAdapterKarditsa(@NonNull Context context, ArrayList<DeptsDetails> deptsDetailsKarditsa) {
        super(context, 0, deptsDetailsKarditsa);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View  detailsViewKarditsa= convertView;

        if (detailsViewKarditsa == null) {
            detailsViewKarditsa = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout_karditsa, parent, false);
        }

        DeptsDetails currentItem =  getItem(position);

        ImageView detailsImage = detailsViewKarditsa.findViewById(R.id.details_img);
        detailsImage.setImageResource(currentItem.getImage());

        TextView detailsText = detailsViewKarditsa.findViewById(R.id.name_text);
        detailsText.setText(currentItem.getName());

        return detailsViewKarditsa;
    }
}
