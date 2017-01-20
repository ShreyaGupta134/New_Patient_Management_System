package com.example.shreyagupta.login_register;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

/**
 * Created by User on 1/20/2017.
 */

public class Third_try extends TabActivity {


        //public class HelloTabWidget extends ActivityGroup {
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.patient_history_with_tabs);

            Resources res = getResources();


            TabHost tabHost = getTabHost();
            TabHost.TabSpec spec;
            Intent intent;
            intent = new Intent().setClass(this, Patient_HistoryDataListViewActivity.class);
            spec = tabHost
                    .newTabSpec("History")
                    .setIndicator("History")
                            //res.getDrawable(R.drawable.History))
                    .setContent(intent);
            tabHost.addTab(spec);

            intent = new Intent().setClass(this,Patient_HistoryDataListViewActivity.class);
            spec = tabHost
                    .newTabSpec("Current")
                    .setIndicator("Current")
                            //res.getDrawable(R.drawable.ic_tab_Company))
                    .setContent(intent);
            tabHost.addTab(spec);



            tabHost.setCurrentTab(0);
        }
    }
