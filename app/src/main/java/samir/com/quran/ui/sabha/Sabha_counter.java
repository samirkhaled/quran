package samir.com.quran.ui.sabha;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import samir.com.quran.R;
import samir.com.quran.databinding.FragmentSabhaCounterBinding;
import samir.com.quran.databinding.FragmentSabhaFragmentBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sabha_counter extends Fragment implements View.OnClickListener {

    public Sabha_counter() {
        // Required empty public constructor
    }

    FragmentSabhaCounterBinding binding;
    int counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sabha_counter, container, false);
        binding.counterButton.setOnClickListener(this);
        binding.resetButton.setOnClickListener(this);
        binding.loveIcon.setOnClickListener(this);
        binding.backButton.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        // binding.counterButton.setText(String.valueOf(counter));

        switch (view.getId()) {

            case R.id.counter_button:
                counter++;

                break;
            case R.id.reset_button:
                counter = 0;
                break;
            case R.id.love_icon:
                if(binding.loveIcon.getTag()==null||binding.loveIcon.getTag().equals("red")){
                    binding.loveIcon.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                    binding.loveIcon.setTag("black");
                } else if (binding.loveIcon.getTag().equals("black")){
                    binding.loveIcon.setTag("red");
                    binding.loveIcon.setImageResource(R.drawable.red_love);
                }

                break;
            case R.id.back_button:
                Fragment fragment = new Sabha_fragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
                break;


        }
        binding.counterButton.setText(String.valueOf(counter));

    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle bundle = getArguments();
        int choose = bundle.getInt("choosingNo", -1);
        setText(choose);
    }

    private void setText(int id) {
        switch (id) {
            case 1:
                binding.choosing.setText(R.string.chhose1_zeker);
                break;
            case 2:
                binding.choosing.setText(R.string.chhose2_zeker);
                break;
            case 3:
                binding.choosing.setText(R.string.chhose3_zeker);
                break;
            case 4:
                binding.choosing.setText(R.string.chhose4_zeker);
                break;
            case 5:
                binding.choosing.setText(R.string.chhose5_zeker);
                break;
            case 6:
                binding.choosing.setText(R.string.chhose6_zeker);
                break;
            case 7:
                binding.choosing.setText(R.string.chhose7_zeker);
                break;
            default:
                break;
        }

    }

    public void loveCheck(String check) {
        if (check.equals("red")) {
            binding.loveIcon.setImageResource(R.drawable.red_love);
        } else if (check.equals("balck")) {
            binding.loveIcon.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        }


    }
}
