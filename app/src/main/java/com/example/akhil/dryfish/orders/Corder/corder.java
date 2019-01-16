package com.example.akhil.dryfish.orders.Corder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akhil.dryfish.R;

import java.util.ArrayList;


public class corder extends Fragment {
    RecyclerView rv;
    COArrayAdapter adapter;
    ArrayList<COInventory> array_name = new ArrayList<COInventory>();
    public corder() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_corder, container, false);
        rv = v.findViewById(R.id.corv);
        adapter = new COArrayAdapter(array_name,getActivity());
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        inputdata();
        return v;
    }



    private void inputdata() {
        COInventory c1 = new COInventory("kozhuva" );
        array_name.add(c1);
        COInventory c2 = new COInventory("PRAWN");
        array_name.add(c2);


    }
}
