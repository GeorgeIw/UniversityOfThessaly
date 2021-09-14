package com.example.android.universityofthessaly;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class SecretaryLarisaFragment extends Fragment {

    public SecretaryLarisaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_secretary, container, false);

        ((SecretaryActivityLarisa) requireActivity()).updateStatusBarColor("#b71c1c");

        ScrollView scrollView = rootView.findViewById(R.id.scroll);
        scrollView.setBackgroundColor(getResources().getColor(R.color.redLightest));

        CardView cardView = rootView.findViewById(R.id.secratary_card);
        cardView.setBackgroundColor(getResources().getColor(R.color.white));

        TextView title = rootView.findViewById(R.id.secretary_title);
        title.setBackgroundColor(getResources().getColor(R.color.red));

        TextView department = rootView.findViewById(R.id.department);
        department.setBackgroundColor(getResources().getColor(R.color.redLight));

        TextView address = rootView.findViewById(R.id.address_text);
        TextView phoneNumber = rootView.findViewById(R.id.phone_number_text);
        TextView fax = rootView.findViewById(R.id.fax_text);
        TextView email = rootView.findViewById(R.id.email_text);

        if(getActivity().getIntent().hasExtra("LbiochemistrySecratary")) {
            department.setText(R.string.larisa_biochemistry_biotechnology);
            department.setTextSize(18);
            address.setText(R.string.larisa_biochemistry_secrcy_address);
            phoneNumber.setText(R.string.larisa_biochemistry_secrcy_phone_number);
            fax.setText(R.string.larisa_biochemistry_secrcy_fax);
            email.setText(R.string.larisa_biochemistry_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LmedicineSecretary")){
            department.setText(R.string.larisa_medicine);
            address.setText(R.string.larisa_medicine_secrcy_address);
            phoneNumber.setText(R.string.larisa_medicine_secrcy_phone_number);
            fax.setText(R.string.larisa_medicine_secrcy_fax);
            email.setText(R.string.larisa_medicine_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LnurserySecretary")){
            department.setText(R.string.larisa_nursery);
            address.setText(R.string.larisa_nursery_secrcy_address);
            phoneNumber.setText(R.string.larisa_nursery_secrcy_phone_number);
            fax.setText(R.string.larisa_secrcy_fax_no_fax);
            email.setText(R.string.larisa_nursery_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LBusinessAdminSecretary")){
            department.setText(R.string.larisa_business_administration);
            address.setText(R.string.larisa_business_admin_secrcy_address);
            phoneNumber.setText(R.string.larisa_business_admin_secrcy_phone_number);
            fax.setText(R.string.larisa_business_admin_secrcy_fax);
            email.setText(R.string.larisa_business_admin_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LaccFinanceSecretary")){
            department.setText(R.string.larisa_accounting_and_finance);
            address.setText(R.string.larisa_acc_finance_secrcy_address);
            phoneNumber.setText(R.string.larisa_acc_finance_secrcy_phone_number);
            fax.setText(R.string.larisa_acc_finance_secrcy_fax);
            email.setText(R.string.larisa_acc_finance_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LenviromentSecretary")){
            department.setText(R.string.larisa_environment);
            address.setText(R.string.larisa_enviroment_secrcy_address);
            phoneNumber.setText(R.string.larisa_enviroment_secrcy_phone_number);
            fax.setText(R.string.larisa_enviroment_secrcy_fax);
            email.setText(R.string.larisa_enviroment_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LenergySysSecretary")){
            department.setText(R.string.larisa_energy_systems);
            address.setText(R.string.larisa_energy_sys_secrcy_address);
            phoneNumber.setText(R.string.larisa_energy_sys_secrcy_phone_number);
            fax.setText(R.string.larisa_energy_sys_secrcy_fax);
            email.setText(R.string.larisa_energy_sys_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LdigitalSysSecretary")){
            department.setText(R.string.larisa_digital_systems);
            address.setText(R.string.larisa_digital_sys_secrcy_address);
            phoneNumber.setText(R.string.larisa_digital_sys_secrcy_phone_number);
            fax.setText(R.string.larisa_digital_sys_secrcy_fax);
            email.setText(R.string.larisa_digital_sys_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LagrotechnologySecretary")){
            department.setText(R.string.larisa_agriculture_agrotechnology);
            address.setText(R.string.larisa_agrotech_secrcy_address);
            phoneNumber.setText(R.string.larisa_agrotech_secrcy_phone_number);
            fax.setText(R.string.larisa_agrotech_secrcy_fax);
            email.setText(R.string.larisa_agrotech_secrcy_email);

        } else if(getActivity().getIntent().hasExtra("LanimalProdSecretary")){
            department.setText(R.string.larisa_agriculture_agrotechnology);
            address.setText(R.string.larisa_agrotech_secrcy_address);
            phoneNumber.setText(R.string.larisa_agrotech_secrcy_phone_number);
            fax.setText(R.string.larisa_agrotech_secrcy_fax);
            email.setText(R.string.larisa_agrotech_secrcy_email);
        }


        return rootView;
    }
}