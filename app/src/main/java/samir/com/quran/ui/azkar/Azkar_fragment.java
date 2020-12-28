package samir.com.quran.ui.azkar;

import android.os.Binder;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentAzkarFragmentBinding;
import samir.com.quran.ui.fragments.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Azkar_fragment extends Fragment implements View.OnClickListener {

    public Azkar_fragment() {
        // Required empty public constructor
    }

    FragmentAzkarFragmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_azkar_fragment, container, false);

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
