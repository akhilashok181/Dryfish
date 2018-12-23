package com.example.akhil.dryfish.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.akhil.dryfish.R;
import com.example.akhil.dryfish.Registration;

import java.util.ArrayList;
import java.util.Timer;


public class HomeFragment extends Fragment {
    CardView itemcard;
    RecyclerView rv;
    ArrayAdapter adapter;
    ArrayList<Inventory> array_name = new ArrayList<>();
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;


    RecyclerView recyclerView;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        //VIEWFLIPPER
        viewPager = v.findViewById(R.id.viewPager);

        sliderDotspanel = v.findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
       // timer.scheduleAtFixedRate(new dash().MyTimerTask(), 2000, 4000);



        //RECYCLE
        rv = v.findViewById(R.id.rvhome);
        adapter = new ArrayAdapter(array_name);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        inputdata();
        return v;
    }

    private void inputdata() {
        Inventory d1 = new Inventory(R.drawable.kozhuva,"KOZHUVA","North paravur","150");
        array_name.add(d1);
        Inventory d2 = new Inventory(R.drawable.prawns,"PRAWN","North paravur","100");
        array_name.add(d2);
        Inventory d3 = new Inventory(R.drawable.machhli,"MACHHLI","North paravur","80");
        array_name.add(d3);
        Inventory d4 = new Inventory(R.drawable.shark,"SHARK","North paravur","200");
        array_name.add(d4);
        Inventory d5 = new Inventory(R.drawable.mullan,"MULLAN","North paravur","100");
        array_name.add(d5);

    }



}
