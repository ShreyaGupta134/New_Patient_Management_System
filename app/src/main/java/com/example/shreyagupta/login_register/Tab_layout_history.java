package com.example.shreyagupta.login_register;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;

/**
 * Created by Shreya Gupta on 18-01-2017.
 */

public class Tab_layout_history extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabHost tabHost;
    TabWidget tabWidget;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_record_with_tabs);

        tabHost = (TabHost) findViewById(R.id.tab_host);
        tabWidget = (TabWidget) findViewById(R.id.tab_widg);
    }
}
