package com.example.elait.pms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/23/2017.
 */

public class PatientRecord_ListDataAdapter extends ArrayAdapter {

    List list= new ArrayList();


    public PatientRecord_ListDataAdapter(Context context, int resource, List<String> strings) {
        super(context, resource);
    }



    static class Listhandler {

        TextView note,prescription,date,diagnosis,id;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {

        return list.size();
    }


    @Override
    public Object getItem(int position) {

        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        Listhandler lh;
        if (row == null) {
            LayoutInflater lf = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = lf.inflate(R.layout.patientrecord_row_wise, parent, false);
            lh = new Listhandler();
            lh.id = (TextView) row.findViewById(R.id.user_id);
            lh.diagnosis = (TextView) row.findViewById(R.id.user_diag);
            lh.note = (TextView) row.findViewById(R.id.user_note);
            lh.prescription = (TextView) row.findViewById(R.id.User_presc);
            lh.date = (TextView) row.findViewById(R.id.user_date);
            row.setTag(lh);

        } else {
            lh = (Listhandler) row.getTag();
        }

        PatientRecord_Dataprovider dp = (PatientRecord_Dataprovider) this.getItem(position);
        lh.id.setText(dp.getId());
        lh.date.setText(dp.getDate());
        lh.note.setText(dp.getNote());
        lh.prescription.setText(dp.getPrescription());
        lh.diagnosis.setText(dp.getDiagnosis());


        return row;
    }
}

