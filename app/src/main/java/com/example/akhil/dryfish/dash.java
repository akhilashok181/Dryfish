package com.example.akhil.dryfish;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.akhil.dryfish.cart.CartFragment;
import com.example.akhil.dryfish.home.HomeFragment;

public class dash extends AppCompatActivity {


    private FrameLayout frameLayout;
    private BottomNavigationView bottomNavigationView;

    private HomeFragment homeFragment;
    private SearchFragment serchFragment;
    private CartFragment cartFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        bottomNavigationView= (BottomNavigationView) findViewById(R.id.navigation);
        frameLayout= (FrameLayout) findViewById(R.id.main_frame);

        homeFragment = new HomeFragment();
        serchFragment = new SearchFragment();
        cartFragment = new  CartFragment();
        profileFragment = new  ProfileFragment();

        setFragment(homeFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.navigation_home : bottomNavigationView.setItemBackgroundResource(R.color.fbutton_color_transparent);
                        setFragment(homeFragment);
                        return true;
                    case R.id.navigation_search : bottomNavigationView.setItemBackgroundResource(R.color.fbutton_color_transparent);
                        setFragment(serchFragment);
                        return true;
                    case R.id.navigation_cart : bottomNavigationView.setItemBackgroundResource(R.color.fbutton_color_transparent);
                        setFragment(cartFragment);
                        return true;
                    case R.id.navigation_profile : bottomNavigationView.setItemBackgroundResource(R.color.fbutton_color_transparent);
                        setFragment(profileFragment);
                        return true;
                    default:
                        return false;

                }
            }
        });
    }
    private  void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }

}
