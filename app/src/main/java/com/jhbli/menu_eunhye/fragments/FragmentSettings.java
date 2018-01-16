package com.jhbli.menu_eunhye.fragments;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jhbli.menu_eunhye.BusInfoActivity;
import com.jhbli.menu_eunhye.MainActivity;
import com.jhbli.menu_eunhye.NoticeActivity1;
import com.jhbli.menu_eunhye.R;

public class FragmentSettings extends Fragment {
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Button btnSettings = (Button)getView().findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NoticeActivity1.class);
                startActivity(intent);            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        getActivity().setTitle("설정");


        return view;
    }
}
