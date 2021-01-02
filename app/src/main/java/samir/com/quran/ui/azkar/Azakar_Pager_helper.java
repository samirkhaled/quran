package samir.com.quran.ui.azkar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import samir.com.quran.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Azakar_Pager_helper extends Fragment {

    public Azakar_Pager_helper() {
        // Required empty public constructor
    }

    TextView textView,title;
    String[]list;
    String []titles;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.azakar_items, container, false);
        textView=view.findViewById(R.id.azakar_item_text);
        title=view.findViewById(R.id.azakar_item_text_title);
        titles=getArguments().getStringArray("title");
        int po=getArguments().getInt("position");
        list=getArguments().getStringArray("list");
        textView.setText(list[po]);
        title.setText(titles[po]);
        return view;
    }
}
