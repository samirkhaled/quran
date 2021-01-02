package samir.com.quran.ui.azkar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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
public class Azakar_frag_content extends Fragment {

    public Azakar_frag_content() {
        // Required empty public constructor
    }
    ImageView backBtn;
    TextView title;
    ViewPager viewPager;
  AzakarPagerHelper helper;
    int zekrNo=0;
   String[] zakr1;
    String[] zakr5;
   String []title1;
    String[] title5;
    String[]zakr2;
    String[]title2;
    String[]zakr3;
    String[]title3;
    String[]zakr4;
    String[]title4;
    String[]zakr7;
    String[]title7;
    String[]zakr8;
    String[]title8;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //zakr1
        zakr1=getResources().getStringArray(R.array.azakar_sbah);
        title1=getResources().getStringArray(R.array.azakar_sbah_titles);
        //
        //zakr5
        zakr5=getResources().getStringArray(R.array.azakar_elmasaa);
        title5=getResources().getStringArray(R.array.azakar_elmasaa_titles);
        //
        //zakr2
        zakr2=getResources().getStringArray(R.array.azakar_elsalah);
        title2=getResources().getStringArray(R.array.azakar_elsalah_titles);
        //
        //zakr3
        zakr3=getResources().getStringArray(R.array.wakeup_azakar);
        title3=getResources().getStringArray(R.array.wakeup_azakar_title);
        //
        //zakr4
        zakr4=getResources().getStringArray(R.array.sleep_zakr);
        title4=getResources().getStringArray(R.array.sleep_zakr_title);
        //
        //zakr7
        zakr7=getResources().getStringArray(R.array.home_in_out);
        title7=getResources().getStringArray(R.array.home_in_out_titles);
        //
        //zakr8
        zakr8=getResources().getStringArray(R.array.get_dressed);
        title8=getResources().getStringArray(R.array.get_dressed_titles);
        //
       View view=inflater.inflate(R.layout.fragment_azakar_frag_content, container, false);
       backBtn=view.findViewById(R.id.back_button);
       title=view.findViewById(R.id.azakarTitle);
       viewPager=view.findViewById(R.id.view_pager);
       backBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new Azkar_fragment()).commit();
           }
       });
       zekrNo=getArguments().getInt("numberOfZaker");
       if(zekrNo!=0){
           showAzakar(zekrNo);
       }
       return view;
    }

    void showAzakar(int id){
        switch (id){
            case 1:
                title.setText(R.string.azkar1);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr1,title1);
                viewPager.setAdapter(helper);
                break;
            case 5:
                title.setText(R.string.azkar5);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr5,title5);
                viewPager.setAdapter(helper);
                break;
            case 2:
                title.setText(R.string.azkar2);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr2,title2);
                viewPager.setAdapter(helper);
                break;
            case 3:
                title.setText(R.string.azkar3);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr3,title3);
                viewPager.setAdapter(helper);
                break;
            case 4:
                title.setText(R.string.azkar4);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr4,title4);
                viewPager.setAdapter(helper);
                break;
            case 7:
                title.setText(R.string.azkar7);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr7,title7);
                viewPager.setAdapter(helper);
                break;
            case 8:
                title.setText(R.string.azkar8);
                helper=new AzakarPagerHelper(getFragmentManager(),1,zakr8,title8);
                viewPager.setAdapter(helper);
                break;
            default:
                break;
        }







    }

}
