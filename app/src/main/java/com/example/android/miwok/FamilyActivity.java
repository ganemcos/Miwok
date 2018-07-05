package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("Nana","Dad",R.drawable.family_father));
        listviewobj.add(new words("Amma","Mom",R.drawable.family_mother));
        listviewobj.add(new words("thamudhu","Brother",R.drawable.family_younger_brother));
        listviewobj.add(new words("akka","Sister",R.drawable.family_older_sister));


        costomAdaptor itemadapter1 = new costomAdaptor(this,listviewobj, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.rootview);
        listView.setAdapter(itemadapter1);
    }
}
