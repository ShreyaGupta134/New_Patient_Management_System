package com.example.elait.pms;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 1/25/2017.
 */

public class Tab_Layout_Old_Patient_Record extends Fragment implements View.OnClickListener {


    TextView id_re;
    TextView diagnosis_re;
    TextView notes;
    TextView presc;
    TextView Date;

    DatabaseHelper db;

    Cursor cursor;
    SQLiteDatabase sqLiteDatabase;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.patientrecord_activity_data_list_view1, container, false);
        Button one = (Button) view.findViewById(R.id.next_button);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button)view.findViewById(R.id.previous_button);
        two.setOnClickListener(this);
        db = new DatabaseHelper(getActivity().getApplicationContext());
        String id_history = getActivity().getIntent().getStringExtra("PATIENT_ID");
        sqLiteDatabase = db.getReadableDatabase();
        cursor = db.getPatientHistory(sqLiteDatabase, id_history);

        id_re = (TextView) view.findViewById(R.id.Text_id);
        diagnosis_re = (TextView) view.findViewById(R.id.text_diagnosis);
        notes = (TextView) view.findViewById(R.id.text_Notes);
        presc = (TextView) view.findViewById(R.id.Text_presc);
        Date = (TextView) view.findViewById(R.id.text_Date);

        Date.setVisibility(View.GONE);
        id_re.setVisibility(View.GONE);
        diagnosis_re.setVisibility(View.GONE);
        notes.setVisibility(View.GONE);
        presc.setVisibility(View.GONE);

        if(cursor.moveToFirst()) {
            String prescription, date, note, diagnosis, id;
            id = cursor.getString(0);
            date = cursor.getString(1);
            prescription = cursor.getString(2);
            note = cursor.getString(3);
            diagnosis = cursor.getString(4);
            Date.setText(date);
            id_re.setText(id);
            presc.setText(prescription);
            notes.setText(note);
            diagnosis_re.setText(diagnosis);
            id_re.setVisibility(View.VISIBLE);
            presc.setVisibility(View.VISIBLE);
            notes.setVisibility(View.VISIBLE);
            diagnosis_re.setVisibility(View.VISIBLE);

        }
        return view;
    }
    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.previous_button){

            if(cursor.moveToPrevious()==!cursor.equals(null)) {
                String prescription, date, note, diagnosis, id;
                id = cursor.getString(0);
                date = cursor.getString(1);
                prescription = cursor.getString(2);
                note = cursor.getString(3);
                diagnosis = cursor.getString(4);
                Date.setText(date);
                id_re.setText(id);
                presc.setText(prescription);
                notes.setText(note);
                diagnosis_re.setText(diagnosis);
                id_re.setVisibility(View.VISIBLE);
                presc.setVisibility(View.VISIBLE);
                notes.setVisibility(View.VISIBLE);
                diagnosis_re.setVisibility(View.VISIBLE);



            }
            else{
                Button btn = (Button) getActivity().findViewById(R.id.previous_button);
                btn.setEnabled(false);

            }
        }

        else if (v.getId()==R.id.next_button) {


            if(cursor.moveToNext()==!cursor.equals(null)){
                String prescription, date, note, diagnosis, id;
                id = cursor.getString(0);
                date = cursor.getString(1);
                prescription = cursor.getString(2);
                note = cursor.getString(3);
                diagnosis = cursor.getString(4);
                Date.setText(date);
                id_re.setText(id);
                presc.setText(prescription);
                notes.setText(note);
                diagnosis_re.setText(diagnosis);
                id_re.setVisibility(View.VISIBLE);
                presc.setVisibility(View.VISIBLE);
                notes.setVisibility(View.VISIBLE);
                diagnosis_re.setVisibility(View.VISIBLE);

            }
            else{
                Button btn = (Button) getActivity().findViewById(R.id.next_button);
                btn.setEnabled(false);

            }
        }}
}




