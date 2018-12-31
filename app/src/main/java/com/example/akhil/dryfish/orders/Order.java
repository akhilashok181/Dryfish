package com.example.akhil.dryfish.orders;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.example.akhil.dryfish.R;

public class Order extends AppCompatActivity {

   ViewPager simpleViewPager;
   TabLayout tabLayout;

   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_order);
// get the reference of ViewPager and TabLayout
      simpleViewPager = (ViewPager) findViewById(R.id.simpleViewPager);
      tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);
// Create a new Tab named "First"
      TabLayout.Tab firstTab = tabLayout.newTab();
      firstTab.setText("Current Order"); // set the Text for the first Tab
      tabLayout.addTab(firstTab); // add  the tab at in the TabLayout
// Create a new Tab named "Second"
      TabLayout.Tab secondTab = tabLayout.newTab();
      secondTab.setText("Past Order"); // set the Text for the second Tab
      tabLayout.addTab(secondTab); // add  the tab  in the TabLayout
//Page Adapter
      PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
      simpleViewPager.setAdapter(adapter);
// addOnPageChangeListener event change the tab on slide
      simpleViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
      tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
         @Override
         public void onTabSelected(TabLayout.Tab tab) {

            simpleViewPager.setCurrentItem(tab.getPosition());

         }

         @Override
         public void onTabUnselected(TabLayout.Tab tab) {

         }

         @Override
         public void onTabReselected(TabLayout.Tab tab) {

         }


      });
   }
}