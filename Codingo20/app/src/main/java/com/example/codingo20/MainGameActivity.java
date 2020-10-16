package com.example.codingo20;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainGameActivity extends AppCompatActivity {




    //Hide Submit Button

    Boolean isLocationServicesEnable;
    Button hintButton;
    TextView score;
    TextView clueNo;
    EditText clueField;
    String[] teamArrayForClue;
    Button submitButton;
    Button nextQlue;

    String[] qrcodeArray;
    ImageView qrCode;
    View progressBarView;
    ProgressBar progressBar;
    TextView distanceField;
    Boolean isVisiable = true;
    Boolean isVisible2 = true;
    Boolean doUpdateScore = true;
    Boolean doDecreaseScore = true;
    TextView teamName;
    

//// you have to hide Submmit button
//    //fds/f/dsfd
//    //dfdsf/
//    /df//sd
//    /df/d/fsd/f/dsf
//    ds/f/dsf
//

    LocationManager locationManager;
    LocationListener locationListener;


    @Override
    public void onRequestPermissionsResult( int requestCode , @NonNull String[] permissions , @NonNull int[] grantResults ) {
        super.onRequestPermissionsResult (requestCode , permissions , grantResults);


        if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){


            if(ContextCompat.checkSelfPermission (this,Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){

                locationManager.requestLocationUpdates (LocationManager.GPS_PROVIDER,0,0,locationListener);
                if(!isLocationServicesEnable){

                    Toast.makeText (MainGameActivity.this,"Please on Location Services",Toast.LENGTH_SHORT).show ();

                }


            }

        }


    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main_game);
        distanceField = findViewById (R.id.distanceField);
        progressBar = findViewById (R.id.proBar);
        progressBarView = findViewById (R.id.viewProgresss);
        score = findViewById (R.id.score);
        teamName = findViewById (R.id.teamNo);
        //Initializing Variables
        clueField = findViewById (R.id.clueTextField);
        clueNo = findViewById (R.id.Field);
        qrCode = findViewById (R.id.qrCode);
        hintButton = findViewById (R.id.hintButton);
        nextQlue = findViewById (R.id.nextClue);
        locationManager = ( LocationManager ) this.getSystemService (LOCATION_SERVICE);
        submitButton = findViewById (R.id.submitButton);
        DataModel.isUserLogInFirst = true;


        try {
            isLocationServicesEnable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch(Exception ex) {}



        clueField.setEnabled (false);
        teamName.setText ("Team " + String.valueOf (DataModel.teamNo));

if(DataModel.admineLogIn){

    distanceField.setVisibility (View.VISIBLE);
    submitButton.setVisibility (View.VISIBLE);

}


         if(DataModel.admineLogIn){

             hintButton.setVisibility (View.VISIBLE);

         }

        //Array for location;
        final String[] arrayforlatitude = DataModel.arrayForlatitudes[DataModel.teamNo - 1];
        final String[] arrayForLongitude = DataModel.arrayForLongitude[DataModel.teamNo - 1];


        locationListener = new LocationListener ( ) {
            @Override
            public void onLocationChanged( Location location ) {
                Location target = new Location ("target");
                target.setLongitude (Double.valueOf (arrayForLongitude[DataModel.clueNo - 1]));
                target.setLatitude (Double.valueOf (arrayforlatitude[DataModel.clueNo - 1]));
                Log.i ("Distance" , String.valueOf (location.distanceTo (target)));
                if(location.getAccuracy () < 7) {
                    distanceField.setText (String.valueOf (location.distanceTo (target)));
                    if (location.distanceTo (target) < 9) {


    if (isVisiable) {
        submitButton.setVisibility (View.VISIBLE);
        progressBar.setVisibility (View.INVISIBLE);
        progressBarView.setVisibility (View.INVISIBLE);

}

                    }else{

if(isVisible2) {
    if(!DataModel.admineLogIn) {
        submitButton.setVisibility (View.INVISIBLE);
    }
    progressBar.setVisibility (View.VISIBLE);
    progressBarView.setVisibility (View.VISIBLE);
}

                    }

                }
            }

            @Override
            public void onStatusChanged( String provider , int status , Bundle extras ) {

            }

            @Override
            public void onProviderEnabled( String provider ) {

            }

            @Override
            public void onProviderDisabled( String provider ) {

            }
        };




        if(ContextCompat.checkSelfPermission (this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {


            ActivityCompat.requestPermissions (this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            isLocationServicesEnable = locationManager.isProviderEnabled (LocationManager.GPS_PROVIDER);

        }else {

                locationManager.requestLocationUpdates (LocationManager.GPS_PROVIDER , 0 , 0 , locationListener);

                if(!isLocationServicesEnable){

                    Toast.makeText (MainGameActivity.this,"Please on Location Services",Toast.LENGTH_SHORT).show ();
                    ActivityCompat.requestPermissions (this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);

                }

        }






        score.setText (String.valueOf ("Score :"+ DataModel.score));   //Setting Score and ClueNo
        clueNo.setText (String.valueOf ("Clue No :" + DataModel.clueNo));



        qrcodeArray = DataModel.qrCodeNameArray[DataModel.teamNo - 1];


        teamArrayForClue = DataModel.questionArray[DataModel.teamNo - 1]; //Setting Clue 1st Time
//
        clueField.setText (teamArrayForClue[DataModel.clueNo - 1]);


        Handler handler = new Handler ();
        handler.postDelayed (new Runnable ( ) {
            @Override
            public void run() {
                hintButton.setVisibility (View.VISIBLE);
            }
        },420000);





    }


    public void getQr( View view){

//        if(answerField.getText () != null){
//
//            if(answerField.getText ( ).toString ( ).equals (programmingAnswerArray[DataModel.questionNo - 1])){
//
//                updateUi ();
//
//            }else{
//
//                Toast.makeText (MainGameActivity.this,"Please try again!",Toast.LENGTH_SHORT).show ();
//            }
//
//        }else {
//
//            Toast.makeText (MainGameActivity.this,"Please Enter Answer!",Toast.LENGTH_SHORT).show ();
//
//        }



        //Logical answer for Qr code Viewer

//
//        Resources res = getResources();
//        String mDrawableName = "logo_default";
//        int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
//        Drawable drawable = res.getDrawable(resID );
//        icon.setImageDrawable(drawable );

        setqQr ();
        isVisiable = false;
        isVisible2 = false;
        distanceField.setVisibility (View.INVISIBLE);
        doDecreaseScore = true;

    }






    public void updateUi(){

        DataModel.clueNo = DataModel.clueNo + 1;
//        DataModel.questionNo = DataModel.questionNo + 1;
        clueField.setText (teamArrayForClue[DataModel.clueNo - 1]);
        DataModel.score = DataModel.score + 10;
        score.setText (String.valueOf ("Score :" + DataModel.score));
        clueNo.setText (String.valueOf ("Clue No :"+ DataModel.clueNo));
//        answerField.setVisibility (View.INVISIBLE);


    }

    //

    public void hint(View view) {

//        answerField.setVisibility (View.VISIBLE);
//        DataModel.score = DataModel.score - 10;

        if (doDecreaseScore) {
            if (doUpdateScore) {

//                submitButton.setVisibility (View.VISIBLE);
                distanceField.setVisibility (View.VISIBLE);
                if(!DataModel.admineLogIn) {
                    DataModel.score = DataModel.score - 5;
                }
                score.setText (String.valueOf ("Score: " + DataModel.score));
                doDecreaseScore = false;
            } else {

                Toast.makeText (MainGameActivity.this , "Please reset!" , Toast.LENGTH_SHORT).show ( );
            }

        }else{


        }
    }


    //Button for next clue

    public void nextClue(View view){

        if(DataModel.clueNo < teamArrayForClue.length) {
            updateUi ( );
            DataModel.qrCode = DataModel.qrCode + 1;
            nextQlue.setVisibility (View.INVISIBLE);
            qrCode.setVisibility (View.INVISIBLE);
            progressBarView.setVisibility (View.VISIBLE);
            progressBar.setVisibility (View.VISIBLE);
            isVisiable = true;
        }else{
            Toast.makeText (MainGameActivity.this,"You done it!",Toast.LENGTH_SHORT).show ();
//            DataModel.score = 0;
//            DataModel.clueNo = 1;
//            DataModel.qrCode = 0;
            doUpdateScore = false;

        }
        isVisible2 = true;

    }




    //Function to set Qr code


    public void setqQr(){

        qrCode.setVisibility (View.VISIBLE);
        Resources resources = getResources ();
        String drawableName = qrcodeArray[DataModel.qrCode];
        int resId = resources.getIdentifier (drawableName,"drawable",getPackageName ());
        Drawable drawable = resources.getDrawable (resId);

        qrCode.setImageDrawable (drawable);
        nextQlue.setVisibility (View.VISIBLE);
        if(!DataModel.admineLogIn) {
            submitButton.setVisibility (View.INVISIBLE);
        }




    }












}
