package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));

        costomAdaptor itemadapter = new costomAdaptor(this,listviewobj, R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.rootview);
        listView.setAdapter(itemadapter);
    }
}
