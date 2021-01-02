package samir.com.quran.ui.quran_fragments;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import samir.com.quran.R;


public class AyatAdapter extends RecyclerView.Adapter<AyatAdapter.AyatAdapterholder>  {

    List<ayahs> ayahsList;
    String suarhNumber;
 Activity activity;

    public AyatAdapter(List<ayahs> ayahsList, String suarhNumber, Activity activity) {
        this.ayahsList = ayahsList;
        this.suarhNumber = suarhNumber;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AyatAdapterholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AyatAdapterholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ayas_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final AyatAdapterholder holder, final int position) {
        holder.ayaText.setText(ayahsList.get(position).getText());
        holder.ayahNumber.setText("" + ayahsList.get(position).getNumberInSurah());

        if (suarhNumber != null) {

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    holder.ayahTafseer.setVisibility(View.VISIBLE);
                    List<ayahs> ayahs = getTafsser(activity);
                    holder.ayahTafseer.setText(ayahs.get(position).getText());

                }
            });

            holder.ayahTafseer.setVisibility(View.GONE);

        }

    }

    @Override
    public int getItemCount() {
        return ayahsList.size();
    }



    class AyatAdapterholder extends RecyclerView.ViewHolder{

TextView ayaText,ayahNumber,ayahTafseer;

        public AyatAdapterholder(@NonNull View itemView) {
            super(itemView);
            ayaText = itemView.findViewById(R.id.ayaht_text);
            ayahNumber = itemView.findViewById(R.id.ayaht_number);
            ayahTafseer = itemView.findViewById(R.id.ayah_tafseer);

        }
    }

   public List<ayahs> getTafsser(final Activity act){

        List<ayahs> ayahs=new ArrayList<>();
        JsonLocalQuran quran =getUser(act);
        List<surahs>surahs=quran.getData().getSurahs();
         int suarhNum=Integer.valueOf(suarhNumber);
        for(int i=0;i<surahs.size();i++){
            if(surahs.get(i).getNumber()==suarhNum){
                ayahs=surahs.get(i).getAyahs();
              //  return ayahs;
            }
        }

        return  ayahs;
   }


    public JsonLocalQuran getUser(final Activity activity) {

        JsonLocalQuran user = null;
        String json = readFromAsset(activity, "tafseer.json");
        try {
            Gson gson = new Gson();
            // convert json in an User object
            user = gson.fromJson(json, JsonLocalQuran.class);
        } catch (Exception e) {
            // we never know :)
            Log.e("error parsing", e.toString());
        }
        return user;
    }

    private String readFromAsset(final Activity act, final String fileName) {
        String text = "";
        try {
            InputStream is = act.getAssets().open(fileName);

            int size = is.available();

            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
