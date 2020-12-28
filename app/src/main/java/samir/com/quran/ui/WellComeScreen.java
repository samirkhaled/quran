package samir.com.quran.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import samir.com.quran.R;

public class WellComeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wllcomescreen);
       Thread thread=new Thread(){
           @Override
           public void run() {
               try {
                   sleep(3000);
                   Intent intent=new Intent(getApplicationContext(),MainScreen.class);
                   startActivity(intent);
                   finish();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

       };
       thread.start();


    }
}
