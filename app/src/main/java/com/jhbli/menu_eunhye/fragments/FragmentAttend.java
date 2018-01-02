package com.jhbli.menu_eunhye.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jhbli.menu_eunhye.R;

public class FragmentAttend extends Fragment {
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Button btnAttend = (Button)getView().findViewById(R.id.btnAttend);
        btnAttend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "등하원관리페이지입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static FragmentAttend newInstance() {
        FragmentAttend fragment = new FragmentAttend();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attend, container, false);

        return view;
    }


}
