package com.test.applitest;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);



         Button button = findViewById(R.id.button);
         Button button2 = findViewById(R.id.button2);
         Button button3 = findViewById(R.id.button3);
         Button button4 = findViewById(R.id.button4);
         Button button5 = findViewById(R.id.button5);
         Button button6 = findViewById(R.id.button6);
         Button button7 = findViewById(R.id.button7);
         Button button8 = findViewById(R.id.button8);
         Button bpParametre = findViewById(R.id.button9);
         Button bpPlay = findViewById(R.id.button10);
         Button bpRetour = findViewById(R.id.button11);
         Button bpAvance = findViewById(R.id.button12);
         Button bpAutreParametre = findViewById(R.id.button13);
         Button profile1 = findViewById(R.id.button14);
         Button profile2 = findViewById(R.id.button15);
         Button profile3 = findViewById(R.id.button16);



        final TextView testBouton = findViewById(R.id.textView1);

        profile1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("");
                sauvegardeProfile1();
            }

            private void sauvegardeProfile1() {
                SauvegardeProfile("1","P11", "P12", "P13", "P14", "P15", "P16", "P17", "P18");
            }
        });

        profile2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("");
                SauvegardeProfile2();
            }

            private void SauvegardeProfile2() {
                SauvegardeProfile("2","P21", "P22", "P23", "P24", "P25", "P26", "P27", "P28");
            }
        });

        profile3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("");
                SauvegardeProfile("3","P31", "P32", "P33", "P34", "P35", "P36", "P37", "P38");
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp1", "");
                testBouton.setText(bp);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp2", "");
                testBouton.setText(bp);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp3", "");
                testBouton.setText(bp);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp4", "");
                testBouton.setText(bp);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp5", "");
                testBouton.setText(bp);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp6", "");
                testBouton.setText(bp);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp7", "");
                testBouton.setText(bp);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String bp = prefs.getString("bp8", "");
                testBouton.setText(bp);
            }
        });

        bpParametre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("Para");

                startActivity(new Intent(MainActivity.this,ParametreActivity.class));

            }
        });

        bpPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("Play !");
            }
        });

        bpAvance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("Avance");
            }
        });

        bpRetour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testBouton.setText("retour");
            }
        });

        bpAutreParametre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SlideCoteActivity.class));
            }
        });
    }

    public void SauvegardeProfile(String profile,String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
        editor.putString("profile", profile);
        editor.putString("bp1", p1);
        editor.putString("bp2", p2);
        editor.putString("bp3", p3);
        editor.putString("bp4", p4);
        editor.putString("bp5", p5);
        editor.putString("bp6", p6);
        editor.putString("bp7", p7);
        editor.putString("bp8", p8);
        editor.apply();
    }

}
