package samir.com.quran.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentHomeBinding;

import samir.com.quran.ui.Radio_fragment;
import samir.com.quran.ui.ahadeeth.Ahadeeth_home;
import samir.com.quran.ui.azkar.Azkar_fragment;
import samir.com.quran.ui.islamic_libraray.Islamic_library_home;
import samir.com.quran.ui.rouqa.Rouqa_home;
import samir.com.quran.ui.sabha.Sabha_fragment;
import samir.com.quran.ui.asmaa_allah.Assmaa_Allah_fragment;
import samir.com.quran.ui.quran_fragments.Quran_home_frag;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }


    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

     binding.quranCard.setOnClickListener(this);
     binding.assmaaAllahCard.setOnClickListener(this);
     binding.sabhaCard.setOnClickListener(this);
     binding.radioCard.setOnClickListener(this);
     binding.azkarCard.setOnClickListener(this);
     binding.ahadeethCard.setOnClickListener(this);
     binding.isalamLibraryCard.setOnClickListener(this);
     binding.rouqaCard.setOnClickListener(this);


        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {

        Fragment fragment=null;

        switch (view.getId()){

            case R.id.quran_card:
                fragment=new Quran_home_frag();
                break;
            case R.id.sabha_card:
                fragment=new Sabha_fragment();
                break;
            case R.id.radio_card:
                fragment=new Radio_fragment();
                break;
            case R.id.assmaa_allah_card:
                fragment=new Assmaa_Allah_fragment();
                break;
            case R.id.rouqa_card:
                fragment=new Rouqa_home();
                break;
            case R.id.azkar_card:
                fragment=new Azkar_fragment();
                break;
            case R.id.ahadeeth_card:
                fragment=new Ahadeeth_home();
                break;
            case R.id.isalam_library_card:
                fragment=new Islamic_library_home();
                break;

        }
        if(fragment!=null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment)
                    .addToBackStack(null)
                    .commit();
        }

    }
}
