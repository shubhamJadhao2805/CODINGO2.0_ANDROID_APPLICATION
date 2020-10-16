package com.example.codingo20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StartButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_start_button);
    }




    public void start( View view){


        Intent intent = new Intent (StartButtonActivity.this,MainGameActivity.class);
        startActivity (intent);


    }

public void reset(View view){

        DataModel.clueNo = 1;
        DataModel.qrCode = 0;
        DataModel.score = 0;
    Toast.makeText (StartButtonActivity.this,"Reset Done!",Toast.LENGTH_SHORT).show ();


}

}
