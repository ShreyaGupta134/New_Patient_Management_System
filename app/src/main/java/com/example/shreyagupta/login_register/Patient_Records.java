package com.example.shreyagupta.login_register;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Shreya Gupta on 06-01-2017.
 */

public class Patient_Records {
    String pre_med ,type, diagnosis,id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPre_med() {

        return pre_med;

    }

    public void setPre_med(String pre_med) {
        this.pre_med = pre_med;
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

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {

        return type;
    }

}
