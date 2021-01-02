package samir.com.quran.ui.rouqa;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Rouqa_viewPager_Adapter extends FragmentStatePagerAdapter {
    String[]list;

    public Rouqa_viewPager_Adapter(@NonNull FragmentManager fm, int behavior,String[]list) {
        super(fm, behavior);
        this.list=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Rouqa_frag_content fragement=new Rouqa_frag_content();
        Bundle bundle=new Bundle();
        bundle.putStringArray("list",list);
        bundle.putInt("po",position);
        fragement.setArguments(bundle);
        return fragement;
    }

    @Override
    public int getCount() {
        return list.length;
    }
}
