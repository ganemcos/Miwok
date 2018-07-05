package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("Arupu","red",R.drawable.color_red));
        listviewobj.add(new words("nalubu","blue",R.drawable.color_black));
        listviewobj.add(new words("pacha","green",R.drawable.color_green));
        listviewobj.add(new words("thalupu","white",R.drawable.color_white));
        listviewobj.add(new words("pasupu","yellow",R.drawable.color_mustard_yellow));

        costomAdaptor itemadapter = new costomAdaptor(this,listviewobj, R.color.category_colors);
        ListView listView = (ListView)findViewById(R.id.rootview);
        listView.setAdapter(itemadapter);
    }
}
