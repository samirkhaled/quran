package samir.com.quran.ui.quran_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import android.widget.Toast;


import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import samir.com.quran.R;
import samir.com.quran.databinding.ActivityQuranWithoutTafseerBinding;

public class QuranWithoutTafseer extends AppCompatActivity {
    ActivityQuranWithoutTafseerBinding binding;
    int count = 0;

    SuarhAdapter suarhAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_without_tafseer);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_quran_without_tafseer);

        //

        //

        //    String data = getAssetJsonData(getApplicationContext());
        JsonLocalQuran quran = getUser(this);
        final List<surahs> surahs = quran.getData().getSurahs();
        Toast.makeText(this, String.valueOf(surahs.size()), Toast.LENGTH_LONG).show();
        //

        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        suarhAdapter = new SuarhAdapter(surahs, this);
        binding.rv.setAdapter(suarhAdapter);


        // Toast.makeText(this,surahs.get(100).getName(),Toast.LENGTH_LONG).show();
        binding.searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                binding.searchText.setVisibility(View.VISIBLE);
                binding.searchText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        suarhAdapter.setSurahsList(searchByName(surahs, charSequence.toString()));
                        suarhAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                if (count > 1) {
                    binding.searchText.setVisibility(View.GONE);
                    count = 0;
                }


            }
        });

    }

    public static String getAssetJsonData(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("quran.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        Log.e("data", json);
        return json;

    }

    public JsonLocalQuran getUser(final Activity activity) {

        JsonLocalQuran user = null;
        String json = readFromAsset(activity, "quran.json");
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

    private List<surahs> searchByName(List<surahs> list, String text) {
        List<surahs> surahsearch = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getName().contains(text)) {
                surahsearch.add(list.get(i));
            }
        }

        return surahsearch;
    }

}
