package com.example.codingo20;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText teamNo;
    EditText password;
    ProgressBar progressBar;
    View view3;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        password = findViewById (R.id.passwordField);
        teamNo = findViewById (R.id.teamNo);
        progressBar = findViewById (R.id.progressBar2);
        view3 = findViewById (R.id.view2);

        password.setText ("");
    }


    public void enter( View view) {

        if (DataModel.isUserLogInFirst) {

            password.setText ("");
            Toast.makeText (MainActivity.this,"Enter Password again!",Toast.LENGTH_SHORT).show ();
            DataModel.isUserLogInFirst = false;

        } else {


            if (password.getText ( ).toString ( ).equals ("Code@123") && teamNo.getText ( ) != null) {

                DataModel.teamNo = Integer.valueOf (teamNo.getText ( ).toString ( ));
                progressBar.setVisibility (View.VISIBLE);
                view3.setVisibility (View.VISIBLE);
                Handler handler = new Handler ( );
                handler.postDelayed (new Runnable ( ) {
                    @Override
                    public void run() {
                        DataModel.admineLogIn = true;
                        Intent intent = new Intent (MainActivity.this , StartButtonActivity.class);
                        startActivity (intent);
                        progressBar.setVisibility (View.INVISIBLE);
                        view3.setVisibility (View.INVISIBLE);

                    }
                } , 1200);
                DataModel.admineLogIn = true;



            } else {
                if (password.getText ( ).toString ( ).equals ("Codingo98") && teamNo.getText ( ) != null && Integer.valueOf (teamNo.getText ( ).toString ( )) < 41 && Integer.valueOf (teamNo.getText ( ).toString ( )) > 0) {

                    DataModel.teamNo = Integer.valueOf (teamNo.getText ( ).toString ( ));
                    progressBar.setVisibility (View.VISIBLE);
                    view3.setVisibility (View.VISIBLE);
                    Handler handler = new Handler ( );
                    handler.postDelayed (new Runnable ( ) {
                        @Override
                        public void run() {
                            DataModel.admineLogIn = false;
                            Intent intent = new Intent (MainActivity.this , StartButtonActivity.class);
                            startActivity (intent);
                            progressBar.setVisibility (View.INVISIBLE);
                            view3.setVisibility (View.INVISIBLE);

                        }
                    } , 1200);


                } else {

                    Toast.makeText (MainActivity.this , "Enter Password or Team name again" , Toast.LENGTH_SHORT).show ( );

                }


            }
        }
    }




}
