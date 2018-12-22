package com.example.akhil.dryfish.cart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akhil.dryfish.R;
import com.example.akhil.dryfish.home.ArrayAdapter;
import com.example.akhil.dryfish.home.Inventory;

import java.util.ArrayList;


public class CartFragment extends Fragment {
    RecyclerView rv;
    com.example.akhil.dryfish.home.ArrayAdapter adapter;
    ArrayList<com.example.akhil.dryfish.home.Inventory> array_name = new ArrayList<>();


    RecyclerView recyclerView;
    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_cart, container, false);
        rv = v.findViewById(R.id.cartrv);
        adapter = new ArrayAdapter(array_name);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        inputdata();
        return v;
    }

    private void inputdata() {
        com.example.akhil.dryfish.home.Inventory d1 = new com.example.akhil.dryfish.home.Inventory(R.drawable.kozhuva,"KOZHUVA","North paravur","150");
        array_name.add(d1);
        com.example.akhil.dryfish.home.Inventory d2 = new com.example.akhil.dryfish.home.Inventory(R.drawable.prawns,"PRAWN","North paravur","100");
        array_name.add(d2);



    }


}
