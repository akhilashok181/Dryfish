package com.example.akhil.dryfish.orders;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import com.example.akhil.dryfish.R;

public class order extends Activity {


   ActionBar.Tab tab1,tab2;

   android.support.v4.app.Fragment fragment1 = new corder();
   android.support.v4.app.Fragment fragment2 = new pastorder();


   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_order);
      ActionBar actionBar = getActionBar();

      actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
      tab1 = actionBar.newTab().setText("CURRENT ORDER");
      tab2 = actionBar.newTab().setText("PAST ORDER");

      tab1.setTabListener(new TabListener(fragment1));
      tab2.setTabListener(new TabListener(fragment2));

      // Adds tabs to the actionbar
      actionBar.addTab(tab1);
      actionBar.addTab(tab2);

   }

}
