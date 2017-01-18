package com.example.shreyagupta.login_register;

/**
 * Created by Shreya Gupta on 06-01-2017.
 */

public class PatientRecord_Dataprovider
{
    private String id;
    private String prescription,note,date,diagnosis;



    public String getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis)
    {
        this.diagnosis = diagnosis;
    }

    public void setId(String id) {
        this.id = id;

    }


    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }



    public String getDate() {
        return date;

    }

    public void setDate(String date) {
        this.date = date;
    }

    public PatientRecord_Dataprovider(String prescription, String date, String note,String id,String diagnosis) {
        this.diagnosis = diagnosis;
        this.id = id;
        this.prescription = prescription;
        this.date = date;
        this.note = note;
    }

}
