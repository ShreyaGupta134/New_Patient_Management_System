package com.example.shreyagupta.login_register;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 1/20/2017.
 */
// This is my todays approach class

public class Test extends android.support.v4.app.Fragment {
Patient_HistoryDataListViewActivity l =new Patient_HistoryDataListViewActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return inflater.inflate(R.layout.test, container, false);

    }



}