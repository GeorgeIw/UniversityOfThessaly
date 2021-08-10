package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecretaryTrikalaFragment extends Fragment {

    public SecretaryTrikalaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        ((SecretaryActivityTrikala)getActivity()).updateStatusBarColor("#004D40");

        TextView title = rootView.findViewById(R.id.secretary_title);
        title.setBackgroundColor(getResources().getColor(R.color.teal));

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.teal300));

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.white));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.teal600));
        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if(getActivity().getIntent().hasExtra("TdietSecretary")){
            department.setText(R.string.trikala_diet);
            address.setText(R.string.trikala_diet_secry_address);
            phoneNumber.setText(R.string.trikala_diet_secry_phone_number);
            fax.setText(R.string.trikala_diet_secry_fax);
            email.setText(R.string.trikala_diet_secry_email);
        } else if(getActivity().getIntent().hasExtra("TphysEduSecretary")){
            department.setText(R.string.trikala_physical_education_athletics);
            address.setText(R.string.trikala_phys_edu_secry_address);
            phoneNumber.setText(R.string.trikala_phys_edu_secry_phone_number);
            fax.setText(R.string.trikala_phys_edu_secry_fax);
            email.setText(R.string.trikala_phys_edu_secry_email);
        } else if(getActivity().getIntent().hasExtra("TcivilEnginSecretary")){
            department.setText(R.string.integb_trikala_civil_engineering);
            address.setText(R.string.trikala_integb_civil_engin_secry_address);
            phoneNumber.setText(R.string.trikala_integb_civil_engin_secry_phone_number);
            fax.setText(R.string.trikala_integb_civil_engin_secry_fax);
            email.setText(R.string.trikala_integb_civil_engin_secry_email);
        }

        return rootView;
    }
}