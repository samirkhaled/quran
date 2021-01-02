package samir.com.quran.ui.azkar;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
public class AzakarPagerHelper extends FragmentStatePagerAdapter{
    String[] list;
    String[]listTitle;
    public AzakarPagerHelper(@NonNull FragmentManager fm, int behavior,String[]list,String[]title) {
        super(fm, behavior);
        this.list=list;
        this.listTitle=title;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        Azakar_Pager_helper pagerFragemnt=new Azakar_Pager_helper();
        Bundle bundle=new Bundle();
        bundle.putInt("position",position);
        bundle.putStringArray("list",list);
        bundle.putStringArray("title",listTitle);
        pagerFragemnt.setArguments(bundle);
        return pagerFragemnt;
    }
    @Override
    public int getCount() {
        return list.length;
    }
}