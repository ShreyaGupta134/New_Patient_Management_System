package com.example.elait.pms;
        import android.database.sqlite.SQLiteDatabase;
        import android.os.Build;
        import android.os.Bundle;
        import android.support.annotation.RequiresApi;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

/**
 * Created by User on 2017-01-24.
 */
public class Add_Clear_Records  extends android.support.v4.app.Fragment implements View.OnClickListener {



    EditText p_id ;
    EditText p_notes;
    EditText p_diagnosis;
    EditText p_prescription ;
    Button clr_btn ;
    Button add_btn;

    DatabaseHelper helper ;
    SQLiteDatabase db;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.add_clear_patient_record_tablayout, container, false);
        add_btn=(Button)view.findViewById(R.id.AddBtn);
        clr_btn=(Button)view.findViewById(R.id.ClrBtn);

        add_btn.setOnClickListener(this);
        clr_btn.setOnClickListener(this);
        helper = new DatabaseHelper(this.getActivity());

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AddBtn:


                p_id = (EditText) getView().findViewById(R.id.patient_ID);
                p_notes = (EditText) getView().findViewById(R.id.notes_id);
                p_diagnosis = (EditText) getView().findViewById(R.id.diag_id);
                p_prescription = (EditText) getView().findViewById(R.id.pres_id);

                String patient_id= p_id.getText().toString();
                String patient_notes = p_notes.getText().toString();
                String patient_diagnosis = p_diagnosis.getText().toString();
                String patient_pres= p_prescription.getText().toString();

                Patient_Records c = new Patient_Records();

                c.setId(Integer.parseInt(patient_id));
                c.setNotes(patient_notes);
                c.setDiagnosis(patient_diagnosis);
                c.setPrescription(patient_pres);

                // helper = new DatabaseHelper(getActivity());
                //helper.onOpen(db);
                //helper.getWritableDatabase();
                helper.insertPatientRecord(c);
                Toast.makeText(getActivity(), "one record inserted", Toast.LENGTH_LONG).show();
                break;


            case R.id.ClrBtn:
                p_notes = (EditText) getView().findViewById(R.id.notes_id);
                p_diagnosis = (EditText) getView().findViewById(R.id.diag_id);
                p_prescription = (EditText) getView().findViewById(R.id.pres_id);
                p_notes.setText(" ");
                p_diagnosis.setText(" ");
                p_prescription.setText(" ");
                break;
        }

    }
}




