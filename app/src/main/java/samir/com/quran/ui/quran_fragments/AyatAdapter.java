package samir.com.quran.ui.quran_fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import samir.com.quran.R;


public class AyatAdapter extends RecyclerView.Adapter<AyatAdapter.AyatAdapterholder> {

    List<ayahs> ayahsList;

    public AyatAdapter(List<ayahs> ayahsList) {
        this.ayahsList = ayahsList;
    }

    @NonNull
    @Override
    public AyatAdapterholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AyatAdapterholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ayas_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AyatAdapterholder holder, int position) {
     holder.ayaText.setText(ayahsList.get(position).getText());
     holder.ayahNumber.setText(""+ayahsList.get(position).getNumberInSurah());
    }

    @Override
    public int getItemCount() {
        return ayahsList.size();
    }

    class AyatAdapterholder extends RecyclerView.ViewHolder{

TextView ayaText,ayahNumber;

        public AyatAdapterholder(@NonNull View itemView) {
            super(itemView);
            ayaText=itemView.findViewById(R.id.ayaht_text);
            ayahNumber=itemView.findViewById(R.id.ayaht_number);
        }
    }
}
