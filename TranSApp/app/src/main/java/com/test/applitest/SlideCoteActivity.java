package com.test.applitest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SlideCoteActivity extends AppCompatActivity {

     public int sonNombre = 0;
     public int lumNombre = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidecote);
        final SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        sonNombre = prefs.getInt("son",0);
        lumNombre = prefs.getInt("lumiere",0);


        Button bpPlusSon = findViewById(R.id.button1);
        Button bpMoinSon = findViewById(R.id.button2);
        Button bpPlusLum = findViewById(R.id.button3);
        Button bpMoinLum = findViewById(R.id.button4);

        final TextView sonText = findViewById(R.id.textView1);
        final TextView lumText = findViewById(R.id.textView2);
        sonText.setText(""+sonNombre);
        lumText.setText(""+lumNombre);


        bpPlusSon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sonNombre = sonNombre +5;
               if(sonNombre > 100 ){
                   sonNombre = 100;
               }

              sonSauvegarde(sonNombre);

                sonText.setText(""+sonNombre);

            }
        });

        bpMoinSon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sonNombre = sonNombre - 5;
                if(sonNombre < 0 ){
                    sonNombre = 0;
                }

                sonSauvegarde(sonNombre);

                sonText.setText(""+sonNombre);

            }
        });

        bpPlusLum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                lumNombre = lumNombre + 5;
                if(lumNombre > 100 ){
                    lumNombre = 100;
                }

                lumiereSauvegarde(lumNombre);

                lumText.setText(""+lumNombre);

            }
        });

        bpMoinLum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                lumNombre = lumNombre - 5;
                if(lumNombre < 0 ){
                    lumNombre = 0;
                }

                lumiereSauvegarde(lumNombre);

                lumText.setText(""+lumNombre);

            }
        });
    }

    public void  sonSauvegarde(int volume) {
        SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
        editor.putInt("son",volume);
        editor.apply();

    }

    public void  lumiereSauvegarde(int lumiere) {
        SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
        editor.putInt("lumiere",lumiere);
        editor.apply();

    }
}
