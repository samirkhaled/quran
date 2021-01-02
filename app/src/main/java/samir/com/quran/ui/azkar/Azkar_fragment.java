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
        binding.azkar1.setOnClickListener(this);
        binding.azkar2.setOnClickListener(this);
        binding.azkar3.setOnClickListener(this);
        binding.azkar4.setOnClickListener(this);
        binding.azkar5.setOnClickListener(this);
        binding.azkar7.setOnClickListener(this);
        binding.azkar8.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        Fragment fragment=null;
        Bundle bundle=new Bundle();
        switch (view.getId()){
            case R.id.back_button:
            fragment=new HomeFragment();
            break;
            case R.id.azkar1:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",1);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar2:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",2);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar3:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",3);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar4:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",4);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar5:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",5);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar7:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",7);
                fragment.setArguments(bundle);
                break;
            case R.id.azkar8:
                fragment=new Azakar_frag_content();
                bundle.putInt("numberOfZaker",8);
                fragment.setArguments(bundle);
                break;
        }
        if(fragment!=null){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment).commit();
        }
    }
}
