package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;

public class SecretaryLamiaFragment extends Fragment {


    public SecretaryLamiaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        ((SecretaryActivityLamia) requireActivity()).updateStatusBarColor("#37474F");

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.blueGreyLightest));

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.white));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.blueGreyLight));

        TextView secretaryTitle = rootView.findViewById(R.id.secretary_title);
        secretaryTitle.setBackgroundColor(getResources().getColor(R.color.blueGrey));

        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if(getActivity().getIntent().hasExtra("LamiaCsSecretary")){
            department.setText(R.string.lamia_computer_science);
            address.setText(R.string.lamia_cs_secry_address);
            phoneNumber.setText(R.string.lamia_cs_secry_phone_number);
            fax.setText(R.string.lamia_cs_secry_fax);
            email.setText(R.string.lamia_cs_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaCsBiomedicineSecretary")){
            department.setText(R.string.lamia_cs_biomedicine);
            address.setText(R.string.lamia_cs_biomedicine_secry_address);
            phoneNumber.setText(R.string.lamia_cs_biomedicine_secry_phone_number);
            fax.setText(R.string.lamia_cs_biomedicine_secry_fax);
            email.setText(R.string.lamia_cs_biomedicine_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaPhysTherapySecretary")){
            department.setText(R.string.lamia_physical_therapy);
            address.setText(R.string.lamia_physical_therapy_secry_address);
            phoneNumber.setText(R.string.lamia_physical_therapy_secry_phone_number);
            fax.setText(R.string.lamia_physical_therapy_secry_fax);
            email.setText(R.string.lamia_physical_therapy_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaMathsSecretary")){
            department.setText(R.string.lamia_maths);
            address.setText(R.string.lamia_maths_secry_address);
            phoneNumber.setText(R.string.lamia_maths_secry_phone_number);
            fax.setText(R.string.lamia_maths_secry_fax);
            email.setText(R.string.lamia_maths_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaPhysicsSecretary")){
            department.setText(R.string.lamia_physics);
            address.setText(R.string.lamia_physics_secry_address);
            phoneNumber.setText(R.string.lamia_physics_secry_phone_number);
            fax.setText(R.string.lamia_physics_secry_fax);
            email.setText(R.string.lamia_physics_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaIntegBcsSecretary")){
            department.setText(R.string.integb_lamia_computer_engineering);
            address.setText(R.string.lamia_integb_cs_secry_address);
            phoneNumber.setText(R.string.lamia_integb_cs_secry_phone_number);
            fax.setText(R.string.lamia_integb_cs_secry_fax);
            email.setText(R.string.lamia_integb_cs_secry_email);
        } else if(getActivity().getIntent().hasExtra("LamiaIntegbPhysTherapySecretary")){
            department.setText(R.string.integb_lamia_physical_therapy);
            address.setText(R.string.lamia_integb_phys_therapy_secry_address);
            phoneNumber.setText(R.string.lamia_integb_phys_therapy_secry_phone_number);
            fax.setText(R.string.lamia_integb_phys_therapy_secry_fax);
            email.setText(R.string.lamia_integb_phys_therapy_secry_email);
        }


        return rootView;
    }
}