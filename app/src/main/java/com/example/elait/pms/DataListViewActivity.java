package com.example.elait.pms;

/**
 * Created by User on 2017-01-23.
 */

import  android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;

public class DataListViewActivity extends AppCompatActivity {


    ListView listView;
    SQLiteDatabase db;
    int i;
    DatabaseHelper helper;
    Cursor cursor;
    ListDataAdapter listDataAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list_view);
        listView = (ListView) findViewById(R.id.List_view);
        helper = new DatabaseHelper(getApplicationContext());
        db = helper.getReadableDatabase();
        cursor = helper.getContact(db);
        listDataAdapter = new ListDataAdapter(getApplicationContext(), R.layout.patientcontacts_row_wise, null);
        if (cursor.moveToFirst()) {
            do {

                String name, age, contact_no, id;
                id = cursor.getString(0);
                name = cursor.getString(1);
                age = cursor.getString(2);
                contact_no = cursor.getString(3);

                DataProvider dataProvider = new DataProvider(name, age, contact_no, id);
                listDataAdapter.add(dataProvider);

            } while (cursor.moveToNext());
        View header = getLayoutInflater().inflate(R.layout.patient_contacts_header, null);

        listView.addHeaderView(header,null,false);
        }
        cursor.close();

        listView.setAdapter(listDataAdapter);
        AdapterView.OnItemClickListener myListViewClicked = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DataProvider item = (DataProvider) adapterView.getItemAtPosition(i);
                String id = item.getId().toString();
                String name = item.getName().toString();
                String age = item.getAge().toString();
                Intent intent = new Intent(DataListViewActivity.this, TabLayout_patient_Record.class);
                intent.putExtra("PATIENT_ID", id);
                intent.putExtra("PATIENT_NAME", name);
                intent.putExtra("PATIENT_AGE", age);
                startActivity(intent);
                Log.i("Clicked Item: ", Integer.toString(i));
            }
        };
        listView.setOnItemClickListener(myListViewClicked);

    }
}