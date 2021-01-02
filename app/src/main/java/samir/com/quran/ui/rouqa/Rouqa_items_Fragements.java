package samir.com.quran.ui.rouqa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import samir.com.quran.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Rouqa_items_Fragements extends Fragment {

    public Rouqa_items_Fragements() {
        // Required empty public constructor
    }

    String []rouqa1=new String[]{};
    String []rouqa2=new String[]{};
    String []rouqa3=new String[]{};
    String []rouqa5=new String[]{};
    TextView rouqaTitle;
    ViewPager viewPager;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_rouqa_items__fragements, container, false);
        rouqaTitle=v.findViewById(R.id.rouqa_type_text);
        viewPager=v.findViewById(R.id.rouqa_view_pager);
        imageView=v.findViewById(R.id.back_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new Rouqa_home()).commit();
            }
        });

      //rouq1
        rouqa1=getResources().getStringArray(R.array.rouq1);
        rouqa2=getResources().getStringArray(R.array.rouq2);
        rouqa3=getResources().getStringArray(R.array.rouqa3);
        rouqa5=getResources().getStringArray(R.array.rouqa5);
        //
        int id=getArguments().getInt("RouqaNo");
        if(id!=0){
            setFrag(id);

        }


        return v;
    }

    void  setFrag(int id){
        Rouqa_viewPager_Adapter adapter;

        switch (id){
            case 1:
                rouqaTitle.setText(R.string.roqua1);
                adapter=new Rouqa_viewPager_Adapter(getFragmentManager(),1,rouqa1);
                viewPager.setAdapter(adapter);
                break;
            case 2:
                rouqaTitle.setText(R.string.roqua2);
                adapter=new Rouqa_viewPager_Adapter(getFragmentManager(),1,rouqa2);
                viewPager.setAdapter(adapter);
                break;
            case 3:
                rouqaTitle.setText(R.string.roqua3);
                adapter=new Rouqa_viewPager_Adapter(getFragmentManager(),1,rouqa3);
                viewPager.setAdapter(adapter);
                break;
            case 5:
                rouqaTitle.setText(R.string.roqua5);
                adapter=new Rouqa_viewPager_Adapter(getFragmentManager(),1,rouqa5);
                viewPager.setAdapter(adapter);
                break;

default: break;

        }

    }
}
