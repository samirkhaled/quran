package samir.com.quran.ui.ahadeeth;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentAhadeethHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class Ahadeeth_home extends Fragment {

    public Ahadeeth_home() {
        // Required empty public constructor
    }

    FragmentAhadeethHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_ahadeeth_home, container, false);

         return binding.getRoot();
    }
}
