package samir.com.quran.ui.quran_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentQuranHomeFrag2Binding;

public class Quran_home_frag extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      FragmentQuranHomeFrag2Binding view= DataBindingUtil.inflate(inflater,R.layout.fragment_quran_home_frag2, container, false);

      view.quranWithoutTafseer.setOnClickListener(this);
      view.quranWithTafseer.setOnClickListener(this);



      return view.getRoot();
    }

    @Override
    public void onClick(View view) {
        Intent i=null;
        switch (view.getId()){
            case R.id.quranWithoutTafseer:
                  i=new Intent(getContext(),QuranWithoutTafseer.class);
                getContext().startActivity(i);
                break;
            case R.id.quranWithTafseer:
                 i=new Intent(getContext(),QuranWithTafseer.class);
                getContext().startActivity(i);
                break;
            default:
                return;

        }
    }
}
