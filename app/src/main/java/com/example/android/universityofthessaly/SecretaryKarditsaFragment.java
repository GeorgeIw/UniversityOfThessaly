package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecretaryKarditsaFragment extends Fragment {


    public SecretaryKarditsaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.white));

        TextView title = rootView.findViewById(R.id.secretary_title);
        title.setBackgroundColor(getResources().getColor(R.color.deepOrange));

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.deepOrangeLighter));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.deepOrangeLight));
        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if (getActivity().getIntent().hasExtra("KpublicHealthSecretary")) {
            department.setText(R.string.karditsa_public_health);
            address.setText(R.string.karditsa_public_health_secry_address);
            phoneNumber.setText(R.string.karditsa_public_health_secry_phone_number);
            fax.setText(R.string.karditsa_public_health_secry_fax);
            email.setText(R.string.karditsa_public_health_secry_email);

        } else if (getActivity().getIntent().hasExtra("karditsa_public_health_secry_")) {
            department.setText(R.string.karditsa_vet);
            address.setText(R.string.karditsa_vet_secry_address);
            phoneNumber.setText(R.string.karditsa_vet_secry_phone_number);
            fax.setText(R.string.karditsa_vet_secry_fax);
            email.setText(R.string.karditsa_vet_secry_email);

        } else if (getActivity().getIntent().hasExtra("KforestrySecretary")) {
            department.setText(R.string.karditsa_forestry_wood);
            address.setText(R.string.karditsa_forestry_secry_address);
            phoneNumber.setText(R.string.karditsa_forestry_secry_phone_number);
            fax.setText(R.string.karditsa_forestry_secry_fax);
            email.setText(R.string.karditsa_forestry_secry_email);

        } else if (getActivity().getIntent().hasExtra("KfoodScienceSecretary")) {
            department.setText(R.string.karditsa_food_science);
            address.setText(R.string.karditsa_integb_food_science_secry_address);
            phoneNumber.setText(R.string.karditsa_integb_food_science_secry_phone_number);
            fax.setText(R.string.karditsa_integb_food_science_secry_fax);
            email.setText(R.string.karditsa_integb_food_science_secry_email);

        } else if (getActivity().getIntent().hasExtra("KintegbForestrySecretary")) {
            department.setText(R.string.integb_karditsa_forestry_enviroment);
            address.setText(R.string.karditsa_integb_forestry_secry_address);
            phoneNumber.setText(R.string.karditsa_integb_forestry_secry_phone_number);
            fax.setText(R.string.karditsa_integb_forestry_secry_fax);
            email.setText(R.string.karditsa_integb_forestry_secry_email);

        } else if (getActivity().getIntent().hasExtra("KintegbDietSecretary")) {
            department.setText(R.string.integb_karditsa_diet);
            address.setText(R.string.karditsa_integb_diet_secry_address);
            phoneNumber.setText(R.string.karditsa_integb_diet_secry_phone_number);
            fax.setText(R.string.karditsa_integb_diet_secry_fax);
            email.setText(R.string.karditsa_integb_diet_secry_email);

        } else if (getActivity().getIntent().hasExtra("KintegbWoodDesignSecretary")) {
            department.setText(R.string.integb_karditsa_wood_design);
            address.setText(R.string.karditsa_integb_wood_design_secry_address);
            phoneNumber.setText(R.string.karditsa_integb_wood_design_secry_phone_number);
            fax.setText(R.string.karditsa_integb_wood_design_secry_fax);
            email.setText(R.string.karditsa_integb_wood_design_secry_email);

        } else if (getActivity().getIntent().hasExtra("KintegbFoodScienceSecretary")) {
            department.setText(R.string.integb_karditsa_food_science);
            address.setText(R.string.karditsa_integb_food_science_secry_address);
            phoneNumber.setText(R.string.karditsa_integb_food_science_secry_phone_number);
            fax.setText(R.string.karditsa_integb_food_science_secry_fax);
            email.setText(R.string.karditsa_integb_food_science_secry_email);
        }

        return rootView;
    }
}