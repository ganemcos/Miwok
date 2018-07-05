package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Acer on 03-07-2018.
 */

public class costomAdaptor extends ArrayAdapter {

    int color;

    public costomAdaptor(@NonNull Context context, ArrayList<words> word, int category_numbers) {
        super(context, 0,word);
        color = category_numbers;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);
        words currentword = (words) getItem(position);
        LinearLayout verticalWord = (LinearLayout)listItem.findViewById(R.id.color_target);
        verticalWord.setBackgroundResource(color);
        ImageView play = (ImageView)listItem.findViewById(R.id.play);


        TextView eng = (TextView)listItem.findViewById(R.id.englishnum);
        eng.setText(currentword.getEnglish());
        TextView miw  = (TextView)listItem.findViewById(R.id.miwoknum);
        miw.setText(currentword.getMiwok());
        ImageView imageView = (ImageView)listItem.findViewById(R.id.image);
        imageView.setImageResource(currentword.getImgage());
        return listItem;
    }
}
