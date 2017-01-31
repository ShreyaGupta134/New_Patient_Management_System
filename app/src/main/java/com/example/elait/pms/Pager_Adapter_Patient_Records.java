package com.example.elait.pms;

import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by User on 1/20/2017.
 */

// sir this my Todays approach class adapter class
public class Pager_Adapter_Patient_Records extends FragmentStatePagerAdapter {



    int tabCount;

    //Constructor to the class
    public Pager_Adapter_Patient_Records(android.support.v4.app.FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab_Layout_Old_Patient_Record tab1  = new Tab_Layout_Old_Patient_Record();
                return tab1;
            case 1:
                Add_Clear_Records tab2  = new Add_Clear_Records();
                return tab2;

            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}