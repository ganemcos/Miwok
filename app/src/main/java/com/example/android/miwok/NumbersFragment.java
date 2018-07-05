package com.example.android.miwok;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.Context.AUDIO_SERVICE;
import static android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT;
import static android.media.AudioManager.STREAM_MUSIC;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener  = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT||focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
            {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN)
            {
                mediaPlayer.start();
            }else if (focusChange == AudioManager.AUDIOFOCUS_LOSS)
            {
                mediaPlayer.release();
            }
        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.activity_number,container,false);
        audioManager  = (AudioManager)getActivity().getSystemService(AUDIO_SERVICE);
        final ArrayList<words> listviewobj = new ArrayList<words>();
        listviewobj.add(new words("okkathi","One", R.drawable.number_one,R.raw.number_one));
        listviewobj.add(new words("Roundu","Two",R.drawable.number_two,R.raw.number_two));
        listviewobj.add(new words("Muddu","three",R.drawable.number_three,R.raw.number_three));
        listviewobj.add(new words("Nalugu","four",R.drawable.number_four,R.raw.number_four));
        listviewobj.add(new words("Idhu","five",R.drawable.number_five,R.raw.number_five));
        listviewobj.add(new words("Aweru","SiX",R.drawable.number_six,R.raw.number_six));
        listviewobj.add(new words("Yeadhu","Seven",R.drawable.number_seven,R.raw.number_seven));
        listviewobj.add(new words("Padhi","ten",R.drawable.number_eight,R.raw.number_ten));

        costomAdaptor itemadapter = new costomAdaptor(getActivity(),listviewobj,R.color.category_numbers);
        ListView listView = (ListView)rootView.findViewById(R.id.rootview);
        listView.setAdapter(itemadapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                words p = listviewobj.get(position);


                int r = p.getAudio();

                if (r!=0){

                    mediaPlayer = MediaPlayer.create(getActivity(),r);
                    int result = audioManager.requestAudioFocus(onAudioFocusChangeListener,STREAM_MUSIC,AUDIOFOCUS_GAIN_TRANSIENT);
                    if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mediaPlayer.release();
                        }
                    });
                }else{
                    Toast.makeText(getActivity(), "no audio to play", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return rootView;

    }

}
