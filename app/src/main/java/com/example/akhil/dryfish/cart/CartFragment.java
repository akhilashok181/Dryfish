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

import java.util.ArrayList;


public class CartFragment extends Fragment {
    RecyclerView rv;
    com.example.akhil.dryfish.cart.ArrayAdapter adapter;
    ArrayList<com.example.akhil.dryfish.cart.Inventory> array_name = new ArrayList<com.example.akhil.dryfish.cart.Inventory>();


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
        adapter = new com.example.akhil.dryfish.cart.ArrayAdapter(array_name);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        inputdata();
        return v;
    }

    private void inputdata() {
        com.example.akhil.dryfish.cart.Inventory c1 = new com.example.akhil.dryfish.cart.Inventory("kozhuva","kochi","400");
        array_name.add(c1);
        com.example.akhil.dryfish.cart.Inventory c2 = new com.example.akhil.dryfish.cart.Inventory("PRAWN","North paravur","100");
        array_name.add(c2);



    }


}
