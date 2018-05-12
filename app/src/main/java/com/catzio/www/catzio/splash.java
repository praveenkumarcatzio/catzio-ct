package com.catzio.www.catzio;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );
        logo = (ImageView)findViewById(R.id.logo );
        Animation animation = AnimationUtils.loadAnimation( this,R.anim.my_animation );
        logo.startAnimation( animation );
      final   Intent in = new Intent( this, loginPage.class );
        Thread thread = new Thread(  ){

            public void run(){
                try{
                    sleep( 4000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                   startActivity( in );
                   finish();
                }

            }
        };
        thread.start();

    }
}
