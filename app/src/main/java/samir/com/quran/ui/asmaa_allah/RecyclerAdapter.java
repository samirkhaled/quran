package samir.com.quran.ui.asmaa_allah;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import samir.com.quran.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    List<NameModel> seekerCycleModels;
    Activity activity;
    NameModel seekerCycleModel;
    int pre = 0;
    MediaPlayer mediaPlayer;
    public RecyclerAdapter(Activity activity, List<NameModel> seekerCycleModels) {
        this.activity = activity;
        this.seekerCycleModels = seekerCycleModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview=   LayoutInflater.from(parent.getContext()).inflate(R.layout.card_raw_update,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        seekerCycleModel = seekerCycleModels.get(position);
        holder.banname.setText(seekerCycleModel.getBanName());

        holder.englishmean.setText(seekerCycleModel.getEnglishmean());
/*
        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer= MediaPlayer.create(activity,seekerCycleModels.get(position).getMp3File());
                mediaPlayer.start();

                if (mediaPlayer.isPlaying()){
                    holder.pause.setVisibility(View.VISIBLE);
                    holder.play.setVisibility(View.INVISIBLE);
                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                        holder.play.setVisibility(View.VISIBLE);
                        holder.pause.setVisibility(View.INVISIBLE);
                    }
                });
            }
        });
        */

    }

    @Override
    public int getItemCount() {
        return seekerCycleModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView banname;
        TextView englishmean;



        public MyViewHolder(View itemView) {
            super(itemView);
            banname = (TextView) itemView.findViewById(R.id.ban);

            englishmean = (TextView) itemView.findViewById(R.id.englishMean);

        }
    }
}

