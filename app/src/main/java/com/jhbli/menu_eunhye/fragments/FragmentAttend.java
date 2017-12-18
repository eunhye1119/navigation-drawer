package com.jhbli.menu_eunhye.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jhbli.menu_eunhye.R;

public class FragmentAttend extends Fragment {

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
