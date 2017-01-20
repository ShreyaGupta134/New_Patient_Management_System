package com.example.shreyagupta.login_register;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
// yesterdays approach for this xml is PatientRecord_tabs
// u can give this in onitemclicklistener in datalistviewActivity and run it
/**
 * Created by User on 1/19/2017.
 */

public class PatientRecord_tabs extends TabActivity
{



        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.patient_history_with_tabs);

            // create the TabHost that will contain the Tabs
            TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


            TabHost.TabSpec tab1 = tabHost.newTabSpec("History");
            TabHost.TabSpec tab2 = tabHost.newTabSpec("Current");


            // Set the Tab name and Activity
            // that will be opened when particular Tab will be selected
            tab1.setIndicator("History");
            tab1.setContent(new Intent(this,Patient_HistoryDataListViewActivity.class));

            tab2.setIndicator("Current");
            tab2.setContent(new Intent(this,Patient_HistoryDataListViewActivity.class));


            /** Add the tabs  to the TabHost to display. */
            tabHost.addTab(tab1);
            tabHost.addTab(tab2);



           /* TabHost.TabSpec ts = tabHost.newTabSpec("History");
            ts.setIndicator("", getResources().getDrawable(R.drawable.tab1_content));
            ts.setContent(R.id.tab1Layout);


            tabHost.addTab(ts);
            TabSpec ts1 = tabHost.newTabSpec("Current");
            ts1.setIndicator("", getResources().getDrawable(R.drawable.tab2_content));
            ts1.setContent(R.id.tab2Layout);
            tabHost.addTab(ts1);*/


        }
    }

