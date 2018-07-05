package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PharsesFragment extends Fragment {


    public PharsesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_phrases,container,false);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));
        listviewobj.add(new words("okkathi","one"));

        costomAdaptor itemadapter = new costomAdaptor(getActivity(),listviewobj, R.color.category_phrases);
        ListView listView = (ListView)root.findViewById(R.id.rootview);
        listView.setAdapter(itemadapter);
        return root;
    }

}
