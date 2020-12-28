package samir.com.quran.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import samir.com.quran.R;
import samir.com.quran.ui.fragments.HomeFragment;
import samir.com.quran.ui.fragments.Love_fragment;
import samir.com.quran.ui.fragments.Setting_fragment;

public class MainScreen extends AppCompatActivity {

   BottomNavigationView  navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        navigationView=findViewById(R.id.navigationView);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setTitleCondensed("hello");

                LoadFragment(menuItem.getItemId());

              return true;
            }
        });

        Fragment fragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment).commit();
    }

    void LoadFragment(int id)
    {
       Fragment fragment = null;
        switch (id)
        {
            case R.id.home_page:
                fragment = new HomeFragment();

                break;
            case R.id.setting_page:
                fragment = new Setting_fragment();
                break;
            case R.id.love_page:
                fragment =new Love_fragment();
                break;
        }

        if (fragment == null)
            return;

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment).commit();
    }
}
