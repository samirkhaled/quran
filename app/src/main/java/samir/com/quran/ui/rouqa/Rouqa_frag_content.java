package samir.com.quran.ui.rouqa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import samir.com.quran.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Rouqa_frag_content extends Fragment {

    public Rouqa_frag_content() {
        // Required empty public constructor
    }

TextView textView;
    ViewPager viewPager;
    int po;
    String[]list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rouqa_frag_content, container, false);
        textView = v.findViewById(R.id.rouqa_item);
        po = getArguments().getInt("po");
        list = getArguments().getStringArray("list");
        textView.setText(list[po]);
        return v;
    }
}
