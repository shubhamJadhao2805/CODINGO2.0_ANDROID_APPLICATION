package com.example.codingo20;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class startActivity extends AppCompatActivity {

    View view2;
    ProgressBar progressBar;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_start);
        progressBar = findViewById (R.id.proBar);
        view2 = findViewById (R.id.viewForProgressBar);

    }


    public void go( View view){

        progressBar.setVisibility (View.VISIBLE);
        view2.setVisibility (View.VISIBLE);

        Handler handler = new Handler ();
        handler.postDelayed (new Runnable ( ) {
            @Override
            public void run() {

                progressBar.setVisibility (View.INVISIBLE);
                view2.setVisibility (View.INVISIBLE);
                Intent intent = new Intent (startActivity.this,MainActivity.class);
                startActivity (intent);

            }
        },1200);



    }


}
