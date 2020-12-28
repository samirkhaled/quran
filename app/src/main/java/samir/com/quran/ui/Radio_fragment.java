package samir.com.quran.ui;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;

import samir.com.quran.R;
import samir.com.quran.ui.fragments.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Radio_fragment extends Fragment implements View.OnClickListener {

    public Radio_fragment() {
        // Required empty public constructor
    }
    String quranLink="http://livestreaming5.onlinehorizons.net/hls-live/Qurankareem/_definst_/liveevent/livestream.m3u8";
    MediaPlayer mediaPlayer;
    boolean prepared=false;
    boolean started=false;
    ImageView button,backButton;
    ProgressBar progressBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_radio_fragment, container, false);
        button=view.findViewById(R.id.radio_button);
        progressBar=view.findViewById(R.id.progressBar);
        backButton=view.findViewById(R.id.back_button);
        progressBar.setVisibility(View.VISIBLE);
        button.setVisibility(View.GONE);
        button.setOnClickListener(this);
        backButton.setOnClickListener(this);
        mediaPlayer=new MediaPlayer();
        mediaPlayer.seekTo(AudioManager.STREAM_MUSIC);
        new PlayerTAsk().execute(quranLink);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.radio_button:
                if(started){
                started=false;
                mediaPlayer.pause();
                button.setBackgroundResource(R.drawable.play);

            }else{
                started=true;
                mediaPlayer.start();

                    button.setBackgroundResource(R.drawable.stop2);
            }
                break;
            case R.id.back_button:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new HomeFragment()).commit();
                break;
        }
    }

    private class PlayerTAsk extends AsyncTask<String, Void, Boolean> {
        @Override
        protected Boolean doInBackground(String... strings) {
            try {
                mediaPlayer.setDataSource(strings[0]);
                mediaPlayer.prepare();
                prepared = true;


            } catch (IOException e) {
                e.printStackTrace();
            }
            return prepared;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            button.setVisibility(View.VISIBLE);
            button.setImageResource(R.drawable.play);
            progressBar.setVisibility(View.GONE);

        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (started) {
            mediaPlayer.pause();
            button.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        if (started) {
            mediaPlayer.start();
            button.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (prepared) {
            mediaPlayer.release();
        }
    }
}


