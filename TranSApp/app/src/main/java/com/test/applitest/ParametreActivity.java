package com.test.applitest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class ParametreActivity  extends AppCompatActivity {

    public int nombreBp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);
        final SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);




        Button bpRecule = findViewById(R.id.button2);
        Button bpAvance = findViewById(R.id.button3);
        Button bpModifier = findViewById(R.id.button4);


        final TextView nomBouton = findViewById(R.id.textView1);
        final TextView nomProfile = findViewById(R.id.textView3);
        String bp = prefs.getString("profile", "");
        nomProfile.setText("profile" + bp);



        bpRecule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                nombreBp = nombreBp -1;
                if(nombreBp < 1){
                    nombreBp = 1;
                }
                nomBouton.setText("bouton "+nombreBp);

            }
        });

        bpAvance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                nombreBp = nombreBp + 1;
                if(nombreBp > 8){
                    nombreBp = 8;
                }
                nomBouton.setText("bouton "+nombreBp);

            }
        });


    }

   /* private boolean isExternalStorageAvailable(){
        String state =  Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);
    }

    public Uri getPhotoFileUri(String fileName){
        if(isExternalStorageAvailable()){
            File mediaStorageDir = new File(
                    getExternalFilesDir(Environment.DIRECTORY_PICTURES),TAG);

            if (!mediaStorageDir.exists() && !mediaStorageDir.mkdirs()){
                Log.d(TAG, "Crash dans la création du répertoire");
            }
            return Uri.fromFile(new File(mediaStorageDir.getPath() + File.separator + fileName));
        }
        return null;
    }

    public void launchCameraIntent(){
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, getPhotoFileUri(photoFileName));
        startActivityForResult(intent,CAMERA_ACTIVITY_REQUEST_CODE);
    }*/
}
