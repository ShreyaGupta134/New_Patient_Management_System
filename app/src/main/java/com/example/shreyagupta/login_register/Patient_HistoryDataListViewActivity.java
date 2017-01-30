/*package com.example.shreyagupta.login_register;


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


/**
 * Created by Shreya Gupta on 06-01-2017.
 */


    /*public class Patient_HistoryDataListViewActivity extends android.support.v4.app.Fragment implements View.OnClickListener {


    ListView listView;
    SQLiteDatabase db;
    DatabaseHelper helper;
    Cursor cursor;

    PatientRecord_ListDataAdapter listDataAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.patientrecord_activity_data_list_view1, container, false);
        listView = (ListView) view.findViewById(R.id.List_view1);
        Button one = (Button) view.findViewById(R.id.btn_next);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button)view.findViewById(R.id.btn_previous);
        two.setOnClickListener(this);
        //Button three = (Button) view.findViewById(R.id.btn_History);
        //three.setOnClickListener(this);

        helper = new DatabaseHelper(getActivity().getApplicationContext());
        String id_history = getActivity().getIntent().getStringExtra("PATIENT_ID");
        db = helper.getReadableDatabase();
        cursor = helper.getPatientHistory(db, id_history);



        listDataAdapter = new PatientRecord_ListDataAdapter(getActivity().getApplicationContext(), R.layout.patientrecord_row_wise, null);
        listView.setAdapter(listDataAdapter);


        /*AdapterView.OnItemClickListener myListViewClicked = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), PatientRecord_ListDataAdapter.class);
                startActivity(intent);



                Log.i("Clicked Item: ", Integer.toString(i));
            }
        };
        listView.setOnItemClickListener(myListViewClicked);*/


        /*if (cursor.moveToFirst()) {


            String prescription, date, note, diagnosis, id;

            id = cursor.getString(0);
            date = cursor.getString(1);
            prescription = cursor.getString(2);
            note = cursor.getString(3);
            diagnosis = cursor.getString(4);
            PatientRecord_Dataprovider dataProvider = new PatientRecord_Dataprovider(id, date, prescription, note, diagnosis);
            listDataAdapter.add(dataProvider);

        }

        return view;
    }

    @Override
    public void onClick(View v) {
      int oldpos=cursor.getPosition();

        /*if(v.getId()==R.id.btn_History){
            Toast.makeText(getActivity(),cursor.getPosition(),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getActivity(), History.class);
            startActivity(intent);


        }*/
           /* if(v.getId()==R.id.btn_previous){
            cursor.moveToPosition(oldpos);
            if(cursor.moveToPrevious()==!cursor.equals(null)) {
                Toast.makeText(getActivity(),oldpos,Toast.LENGTH_LONG).show();
                String prescription, date, note, diagnosis, id;
                id = cursor.getString(0);
                date = cursor.getString(1);
                prescription = cursor.getString(2);
                note = cursor.getString(3);
                diagnosis = cursor.getString(4);
                PatientRecord_Dataprovider dataProvider = new PatientRecord_Dataprovider(id, date, prescription, note, diagnosis);
                listDataAdapter.add(dataProvider);



            }
            else{
                Button btn = (Button) getActivity().findViewById(R.id.btn_previous);
                btn.setEnabled(false);
            }
        }

        else if (v.getId()==R.id.btn_next) {

            cursor.moveToPosition(oldpos);
            if(cursor.moveToNext()==!cursor.equals(null)){
                String prescription, date, note, diagnosis, id;
                id = cursor.getString(0);
                date = cursor.getString(1);
                prescription = cursor.getString(2);
                note = cursor.getString(3);
                diagnosis = cursor.getString(4);
                PatientRecord_Dataprovider dataProvider = new PatientRecord_Dataprovider(id, date, prescription, note, diagnosis);
                listDataAdapter.add(dataProvider);

            }
            else{
                Button btn = (Button) getActivity().findViewById(R.id.btn_next);
                btn.setEnabled(false);

            }*/
        //}
                //}
//}










