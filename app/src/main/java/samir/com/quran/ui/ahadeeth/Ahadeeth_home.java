package samir.com.quran.ui.ahadeeth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Ahadeeth_home extends Fragment {

    public Ahadeeth_home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ahadeeth_home, container, false);
    }
}
