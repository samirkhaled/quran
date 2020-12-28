package samir.com.quran.ui.rouqa;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentRouqaHomeBinding;
import samir.com.quran.ui.fragments.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Rouqa_home extends Fragment implements View.OnClickListener {

    public Rouqa_home() {
        // Required empty public constructor
    }
    FragmentRouqaHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_rouqa_home, container, false);
        binding.backButton.setOnClickListener(this);




        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        Fragment fragment=null;
        switch (view.getId()){

            case R.id.back_button:
                fragment=new HomeFragment();
                break;

        }
        if(fragment!=null){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment).commit();
        }

    }
}
