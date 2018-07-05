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
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_colors,container,false);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("Arupu","red",R.drawable.color_red));
        listviewobj.add(new words("nalubu","blue",R.drawable.color_black));
        listviewobj.add(new words("pacha","green",R.drawable.color_green));
        listviewobj.add(new words("thalupu","white",R.drawable.color_white));
        listviewobj.add(new words("pasupu","yellow",R.drawable.color_mustard_yellow));

        costomAdaptor itemadapter = new costomAdaptor(getContext(),listviewobj, R.color.category_colors);
        ListView listView = (ListView)root.findViewById(R.id.rootview);
        listView.setAdapter(itemadapter);
        return root;
    }

}
