package samir.com.quran.ui.quran_fragments;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

import samir.com.quran.R;


public class SuarhAdapter extends RecyclerView.Adapter<SuarhAdapter.SuarhViewHolder> {
    List<surahs> surahsList;
    Context context;

    public SuarhAdapter(List<surahs> surahsList, Context context) {
        this.surahsList = surahsList;
        this.context = context;
    }
    public void setSurahsList(List<surahs> list){
        this.surahsList=list;
    }

    @NonNull
    @Override
    public SuarhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SuarhViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.suarh_items_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SuarhViewHolder holder, final int position) {
        Log.d("TAG", "onBindViewHolder:"+surahsList.get(0).getAyahs().size());

        if(surahsList.get(position).getRevelationType().equals("Meccan"))
        {
           holder.suarhType.setText("مكيه");
        }
        else{
            holder.suarhType.setText("مدنية");
        }
        holder.suarhName.setText(surahsList.get(position).getName());
       holder.totalNumberOfAyahs.setText(""+surahsList.get(position).getAyahs().size());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson=new Gson();
                String target=gson.toJson(surahsList.get(position).getAyahs());
                Intent intent=new Intent(context,Ayahs_Activity.class);
                intent.putExtra("target",target);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return surahsList.size();
    }

    class SuarhViewHolder extends RecyclerView.ViewHolder {

        TextView suarhName,totalNumberOfAyahs,suarhType;
        public SuarhViewHolder(@NonNull View itemView) {
            super(itemView);
            suarhName = itemView.findViewById(R.id.surarh_text);
            totalNumberOfAyahs=itemView.findViewById(R.id.total_numbers);
            suarhType=itemView.findViewById(R.id.suarh_type);
        }
    }
}
