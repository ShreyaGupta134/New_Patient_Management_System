package com.example.shreyagupta.login_register;


import android.app.Fragment;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.Toast;

import java.text.ParseException;

import static com.example.shreyagupta.login_register.R.id.History_click;
import static com.example.shreyagupta.login_register.R.id.view_offset_helper;

/**
 * Created by Shreya Gupta on 06-01-2017.
 */


    public class Patient_HistoryDataListViewActivity extends android.support.v4.app.Fragment {


    ListView listView;
    SQLiteDatabase db;
    int i;
    DatabaseHelper helper;
    Cursor cursor;
    Button button;
    String patient_id;

    PatientRecord_ListDataAdapter listDataAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.patientrecord_activity_data_list_view1, container, false);
        listView = (ListView) view.findViewById(R.id.List_view1);
        helper = new DatabaseHelper(getActivity().getApplicationContext());
        String id_history = getActivity().getIntent().getStringExtra("PATIENT_ID");
        db = helper.getReadableDatabase();
        cursor = helper.getPatientHistory(db,id_history);





        listDataAdapter = new PatientRecord_ListDataAdapter(getActivity().getApplicationContext(), R.layout.patientrecord_row_wise, null);
        listView.setAdapter(listDataAdapter);





        AdapterView.OnItemClickListener myListViewClicked = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), PatientRecord_ListDataAdapter.class);
                startActivity(intent);
                //Intent intent = new Intent(Patient_HistoryDataListViewActivity.this,PatientRecord_ListDataAdapter.class);
                //intent.putExtra(DatabaseHelper.COLUMN_patient_history_id,String.valueOf(id_history));
                startActivity(intent);
                //String item = adapterView.getItemAtPosition(i).toString();
                //String Query="select * from patient_history where"+DatabaseHelper.COLUMN_patient_history_id+"="+id_history;
                Log.i("Clicked Item: ", Integer.toString(i));
            }
        };
        listView.setOnItemClickListener(myListViewClicked);
        //String Query="select * from patient_history where"+DatabaseHelper.COLUMN_patient_history_id+"="+id_history;
        if (cursor.moveToFirst()) {

            do {
                String prescription, date, note, diagnosis, id;

                id = cursor.getString(0);
                date = cursor.getString(1);
                prescription = cursor.getString(2);
                note = cursor.getString(3);
                diagnosis = cursor.getString(4);
                PatientRecord_Dataprovider dataProvider = new PatientRecord_Dataprovider(id, date, prescription, note, diagnosis);
                listDataAdapter.add(dataProvider);
            } while (cursor.moveToNext());
        }


        button = (Button) view.findViewById(History_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), History.class);
                startActivity(intent);
            }
        });

        return view;
    }

}








