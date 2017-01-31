package com.example.elait.pms;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Shreya Gupta on 14-12-2016.
 */

public class Display extends Activity {

    ListView lv;
    EditText ed ;
    ArrayAdapter<String> adapter ;
    SQLiteDatabase database;
    com.example.elait.pms.DatabaseHelper dbh;
    Cursor csr ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username=getIntent().getStringExtra("Username");

        TextView tv=(TextView)findViewById(R.id.TvUsername);

        tv.setText(username);


    }

    public void view_data(View vw1){
        if (vw1.getId() == R.id.viewButton) {
            Intent in = new Intent(Display.this,DataListViewActivity.class);
            startActivity(in);}

    }

    public void search_click (View vw2){
        if (vw2.getId() == R.id.button_search) {
        Intent i = new Intent(Display.this, Search_activity.class);
        startActivity(i);
        }
        }
public void B_proceed(View vw) {
        if (vw.getId() == R.id.p_proceed) {
        Intent i = new Intent(Display.this, Registration.class);
        startActivity(i);
        }

        }
        }
