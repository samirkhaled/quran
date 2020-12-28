package samir.com.quran.ui.sabha;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentSabhaFragmentBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sabha_fragment extends Fragment implements View.OnClickListener {

    public Sabha_fragment() {
        // Required empty public constructor
    }

    FragmentSabhaFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sabha_fragment, container, false);

        binding.sabahaChoose1.setOnClickListener(this);
        binding.sabahaChoose2.setOnClickListener(this);
        binding.sabahaChoose3.setOnClickListener(this);
        binding.sabahaChoose4.setOnClickListener(this);
        binding.sabahaChoose5.setOnClickListener(this);
        binding.sabahaChoose6.setOnClickListener(this);
        binding.sabahaChoose7.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
      Fragment fragment=null;
      Bundle bundle=null;
      switch (view.getId()){

          case R.id.sabaha_choose1:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",1);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose2:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",2);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose3:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",3);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose4:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",4);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose5:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",5);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose6:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",6);
              fragment.setArguments(bundle);
              break;
          case R.id.sabaha_choose7:
              bundle=new Bundle();
              fragment=new Sabha_counter();
              bundle.putInt("choosingNo",7);
              fragment.setArguments(bundle);
              break;
      }
      getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment)
              .addToBackStack(null)
              .commit();


    }

}
