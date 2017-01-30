package com.example.shreyagupta.login_register;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Shreya Gupta on 06-01-2017.
 */

public class Patient_Records {
    String Notes ,prescription, diagnosis;
            int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setDiagnosis(String diagnosis) {

        this.diagnosis = diagnosis;
    }




    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDate(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date=new Date();
        return simpleDateFormat.format(date);



    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}

