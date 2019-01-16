package com.example.akhil.dryfish.orders.Porder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akhil.dryfish.R;


import java.util.ArrayList;



public class pastorder extends Fragment {
    RecyclerView rv;
    POArrayAdapter adapter;
    ArrayList<POInventory> array_name = new ArrayList<POInventory>();



    public pastorder() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pastorder, container, false);
        rv = v.findViewById(R.id.porv);
        adapter = new POArrayAdapter(array_name,getActivity());
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        inputdata();
        return v;
    }
    private void inputdata() {
        POInventory c1 = new POInventory("kozhuva", "Delivered:24-5-2018","10:30 AM");
        array_name.add(c1);
        POInventory c2 = new POInventory("PRAWN", "Delivered:22-2-2018", "11:00 AM");
        array_name.add(c2);


    }
}
