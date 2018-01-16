package com.jhbli.menu_eunhye.fragments;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.jhbli.menu_eunhye.BusInfoActivity;
import com.jhbli.menu_eunhye.MainActivity;
import com.jhbli.menu_eunhye.R;

import java.util.ArrayList;

public class FragmentBus extends Fragment {
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        ListView list = (ListView)getView().findViewById(R.id.listView1);
        final String[] busStop = {"KB 골든 라이프 케어 센터", "A역", "B역", "C역", "D역", "KB 골든 라이프 케어 센터"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, busStop);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), BusInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bus, container, false);
        getActivity().setTitle("셔틀버스 조회");

        return view;
    }

}
