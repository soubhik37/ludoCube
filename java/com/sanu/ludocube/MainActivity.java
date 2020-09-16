package com.sanu.ludocube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
public ImageView imgCube;
public Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgCube = (ImageView) findViewById(R.id.imageView);
        imgCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCube();
            }
        });
    }
    private void playCube(){
        int randomNumber = random.nextInt(6)+1;
        switch (randomNumber){
            case 1:
                imgCube.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imgCube.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imgCube.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imgCube.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imgCube.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imgCube.setImageResource(R.drawable.dice6);
                break;

        }
    }
}