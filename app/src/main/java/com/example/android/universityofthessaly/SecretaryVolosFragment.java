package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.appcompat.widget.DecorContentParent;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;

public class SecretaryVolosFragment extends Fragment {


    public SecretaryVolosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        ((SecretaryActivityVolos) requireActivity()).updateStatusBarColor("#1A237E");

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.white));

        TextView title = rootView.findViewById(R.id.secretary_title);
        title.setBackgroundColor(getResources().getColor(R.color.indigo));
        title.setTextColor(getResources().getColor(R.color.white));

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.indigoGridList));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.indigoDetailsBackground));
        department.setTextColor(getResources().getColor(R.color.white));

        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if(getActivity().getIntent().hasExtra("VarchitectureSecretary")){
            department.setText(R.string.volos_architecture);
            address.setText(R.string.volos_architecture_address);
            phoneNumber.setText(R.string.volos_architecture_phone_number);
            fax.setText(R.string.volos_architecture_fax);
            email.setText(R.string.volos_architecture_email);
        } else if(getActivity().getIntent().hasExtra("VelectricalCsSecretary")){
            department.setText(R.string.volos_elec_computer_engineers);
            address.setText(R.string.volos_elec_engin_secry_address);
            phoneNumber.setText(R.string.volos_elec_engin_secry_phone_number);
            fax.setText(R.string.volos_elec_engin_secry_fax);
            email.setText(R.string.volos_elec_engin_secry_email);
        } else if(getActivity().getIntent().hasExtra("VspatianEnginSecretary")){
            department.setText(R.string.volos_spatial_engineering);
            address.setText(R.string.volos_spacial_engin_secry_address);
            phoneNumber.setText(R.string.volos_spacial_engin_secry_phone_number);
            fax.setText(R.string.volos_spacial_engin_secry_fax);
            email.setText(R.string.volos_spacial_engin_secry_email);
        } else if(getActivity().getIntent().hasExtra("VmechEnginSecretary")){
            department.setText(R.string.volos_mechanical_engineering);
            address.setText(R.string.volos_mech_engin_secry_address);
            phoneNumber.setText(R.string.volos_mech_engin_secry_phone_number);
            fax.setText(R.string.volos_mech_engin_secry_fax);
            email.setText(R.string.volos_mech_engin_secry_email);
        } else if(getActivity().getIntent().hasExtra("VcivilEnginSecretary")){
            department.setText(R.string.volos_civil_engineering);
            address.setText(R.string.volos_civil_engin_secry_address);
            phoneNumber.setText(R.string.volos_civil_engin_secry_phone_number);
            fax.setText(R.string.volos_civil_engin_secry_fax);
            email.setText(R.string.volos_civil_engin_secry_email);
        } else if(getActivity().getIntent().hasExtra("VprimaryEduSecretary")){
            department.setText(R.string.volos_primary_education);
            address.setText(R.string.volos_primary_edu_secry_address);
            phoneNumber.setText(R.string.volos_primary_edu_secry_phone_number);
            fax.setText(R.string.volos_primary_edu_secry_fax);
            email.setText(R.string.volos_primary_edu_secry_email);
        } else if(getActivity().getIntent().hasExtra("VspecialEduSecretary")){
            department.setText(R.string.volos_special_education);
            address.setText(R.string.volos_special_edu_secry_address);
            phoneNumber.setText(R.string.volos_special_edu_secry_phone_number);
            fax.setText(R.string.volos_special_edu_secry_fax);
            email.setText(R.string.volos_special_edu_secry_email);
        } else if(getActivity().getIntent().hasExtra("VpreschoolEduSecretary")){
            department.setText(R.string.volos_preschool_education);
            address.setText(R.string.volos_preschool_edu_secry_address);
            phoneNumber.setText(R.string.volos_preschool_edu_secry_phone_number);
            fax.setText(R.string.volos_preschool_edu_secry_fax);
            email.setText(R.string.volos_preschool_edu_secry_email);
        } else if(getActivity().getIntent().hasExtra("VlingualSecretary")){
            department.setText(R.string.volos_linguistic_intercultural);
            address.setText(R.string.volos_linguistic_secry_address);
            phoneNumber.setText(R.string.volos_linguistic_secry_phone_number);
            fax.setText(R.string.volos_linguistic_secry_fax);
            email.setText(R.string.volos_linguistic_secry_email);
        } else if(getActivity().getIntent().hasExtra("VarcheologySecretary")){
            department.setText(R.string.volos_archeology_anthropology);
            address.setText(R.string.volos_archeology_secry_address);
            phoneNumber.setText(R.string.volos_archeology_secry_phone_number);
            fax.setText(R.string.volos_archeology_secry_fax);
            email.setText(R.string.volos_archeology_secry_email);
        } else if(getActivity().getIntent().hasExtra("VpolitismIndustrySecretary")){
            department.setText(R.string.volos_politism_industry);
            address.setText(R.string.volos_politism_industry_secry_address);
            phoneNumber.setText(R.string.volos_politism_industry_secry_phone_number);
            fax.setText(R.string.volos_politism_industry_secry_fax);
            email.setText(R.string.volos_politism_industry_secry_email);
        } else if(getActivity().getIntent().hasExtra("VeconomicalScienceSecretary")){
            department.setText(R.string.volos_economical_science);
            address.setText(R.string.volos_economical_science_secry_address);
            phoneNumber.setText(R.string.volos_economical_science_secry_phone_number);
            fax.setText(R.string.volos_economical_science_secry_fax);
            email.setText(R.string.volos_economical_science_secry_email);
        } else if(getActivity().getIntent().hasExtra("VagroIchtyologySecretary")){
            department.setText(R.string.volos_agronomy_ichthyology);
            address.setText(R.string.volos_agro_ithyology_secry_address);
            phoneNumber.setText(R.string.volos_agro_ithyology_secry_phone_number);
            fax.setText(R.string.volos_agro_ithyology_secry_fax);
            email.setText(R.string.volos_agro_ithyology_secry_email);
        } else if(getActivity().getIntent().hasExtra("VagricultureSecretary")){
            department.setText(R.string.volos_agriculture);
            address.setText(R.string.volos_agriculture_secry_address);
            phoneNumber.setText(R.string.volos_agriculture_secry_phone_number);
            fax.setText(R.string.volos_agriculture_secry_fax);
            email.setText(R.string.volos_agriculture_secry_email);
        }

        return rootView;
    }
}