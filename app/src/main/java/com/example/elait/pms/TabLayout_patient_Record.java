package com.example.elait.pms;

/**
 * Created by User on 2017-01-24.
 */

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.elait.pms.Pager_Adapter_Patient_Records;

public class TabLayout_patient_Record extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout_patient_record);

        String id = getIntent().getStringExtra("PATIENT_ID");
        String name = getIntent().getStringExtra("PATIENT_NAME");
        String age = getIntent().getStringExtra("PATIENT_AGE");

        TextView id_display = (TextView) findViewById(R.id.display_id);
        TextView name_display = (TextView) findViewById(R.id.display_name);
        TextView age_display = (TextView) findViewById(R.id.display_age);

        id_display.setText(id);
        name_display.setText(name);
        age_display.setText(age);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null){
            setSupportActionBar(toolbar);}

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("OLD"));
        tabLayout.addTab(tabLayout.newTab().setText("ADD"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);

        Pager_Adapter_Patient_Records adapter = new Pager_Adapter_Patient_Records(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}