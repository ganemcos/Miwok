package com.example.android.miwok;

import android.net.Uri;

import java.net.URL;

/**
 * Created by Acer on 03-07-2018.
 */

public class words {

    String miwok,english;
    int imgage;
    int audio;

    public words(String miw, String eng, int img){
        miwok = miw;
        english = eng;
        imgage = img;
    }

    public words(String miw, String eng, int img,int audio){
        miwok = miw;
        english = eng;
        imgage = img;
        this.audio =audio;
    }
    public words(String miw, String eng) {
        miwok = miw;
        english = eng;
    }



    public String getEnglish()
    {
        return english;
    }
    public  String getMiwok()
    {
        return  miwok;
    }
    public int getImgage()
    {
        return imgage;
    }
    public int getAudio()
    {
        return audio;
    }
}
