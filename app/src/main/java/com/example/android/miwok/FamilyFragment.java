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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View roorView = inflater.inflate(R.layout.activity_family,container,false);
        ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("Nana","Dad",R.drawable.family_father));
        listviewobj.add(new words("Amma","Mom",R.drawable.family_mother));
        listviewobj.add(new words("thamudhu","Brother",R.drawable.family_younger_brother));
        listviewobj.add(new words("akka","Sister",R.drawable.family_older_sister));


        costomAdaptor itemadapter1 = new costomAdaptor(getActivity(),listviewobj, R.color.category_family);
        ListView listView = (ListView)roorView.findViewById(R.id.rootview);
        listView.setAdapter(itemadapter1);
        return  roorView;
    }

}
