package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;


public class SecretaryLarisaSecondFragment extends Fragment {


    public SecretaryLarisaSecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        ((SecretaryActivityLarisa) requireActivity()).updateStatusBarColor("#b71c1c");

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.redLighter));

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.redLightest));

        TextView title = rootView.findViewById(R.id.secretary_title);
        title.setBackgroundColor(getResources().getColor(R.color.red));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.redLight));

        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if(getActivity().getIntent().hasExtra("LintegbBusinessAdminSecretary")){
            department.setText(R.string.larisa_integb_buss_admin_address);
            address.setText(R.string.larisa_integb_buss_admin_address);
            phoneNumber.setText(R.string.larisa_integb_buss_admin_phone_number);
            fax.setText(R.string.larisa_integb_buss_admin_fax);
            email.setText(R.string.larisa_integb_buss_admin_email);

        } else if(getActivity().getIntent().hasExtra("LintegbElecEnginSecretary")){
            department.setText(R.string.integb_larisa_electrical_engineering);
            address.setText(R.string.larisa_integb_elec_engi_address);
            phoneNumber.setText(R.string.larisa_integb_elec_engi_phone_number);
            fax.setText(R.string.larisa_integb_elec_engi_fax);
            email.setText(R.string.larisa_integb_elec_engi_email);

        } else if(getActivity().getIntent().hasExtra("LintegbMedicalLabsSecretary")){
            department.setText(R.string.integb_larisa_medical_labs);
            address.setText(R.string.larisa_integb_medical_labs_address);
            phoneNumber.setText(R.string.larisa_integb_medical_labs_phone_number);
            fax.setText(R.string.larisa_integb_medical_labs_fax);
            email.setText(R.string.larisa_integb_medical_labs_email);

        } else if(getActivity().getIntent().hasExtra("LintegbLogisticsSecretary")){
            department.setText(R.string.integb_larisa_logistics);
            address.setText(R.string.larisa_integb_logistics_address);
            phoneNumber.setText(R.string.larisa_integb_logistics_phone_number);
            fax.setText(R.string.larisa_integb_logistics_fax);
            email.setText(R.string.larisa_integb_logistics_email);

        } else if(getActivity().getIntent().hasExtra("LintegbCsSecretary")){
            department.setText(R.string.integb_larisa_computer_science);
            address.setText(R.string.larisa_integb_cs_address);
            phoneNumber.setText(R.string.larisa_integb_cs_phone_number);
            fax.setText(R.string.larisa_integb_cs_fax);
            email.setText(R.string.larisa_integb_cs_email);

        } else if(getActivity().getIntent().hasExtra("LintegbMechEnginSecretary")){
            department.setText(R.string.integb_larisa_mechanical_engineering);
            address.setText(R.string.larisa_integb_mech_engin_address);
            phoneNumber.setText(R.string.larisa_integb_mech_engin_phone_number);
            fax.setText(R.string.larisa_integb_mech_engin_fax);
            email.setText(R.string.larisa_integb_mech_engin_email);

        } else if(getActivity().getIntent().hasExtra("LintegbNurserySecretary")){
            department.setText(R.string.integb_larisa_nursery);
            address.setText(R.string.larisa_integb_nursery_address);
            phoneNumber.setText(R.string.larisa_integb_nursery_phone_number);
            fax.setText(R.string.larisa_integb_nursery_fax);
            email.setText(R.string.larisa_integb_nursery_email);

        } else if(getActivity().getIntent().hasExtra("LintegbCivilEnginSecretary")){
            department.setText(R.string.integb_larisa_civil_engineering);
            address.setText(R.string.larisa_integb_civil_engin_address);
            phoneNumber.setText(R.string.larisa_integb_civil_engin_phone_number);
            fax.setText(R.string.larisa_integb_civil_engin_fax);
            email.setText(R.string.larisa_integb_civil_engin_email);

        } else if(getActivity().getIntent().hasExtra("LintegbAgricultureSecretary")){
            department.setText(R.string.integb_larisa_agricultural_technicians);
            address.setText(R.string.larisa_integb_agricultural_address);
            phoneNumber.setText(R.string.larisa_integb_agricultural_phone_number);
            fax.setText(R.string.larisa_integb_agricultural_fax);
            email.setText(R.string.larisa_integb_agricultural_email);
        }

        return rootView;
    }
}