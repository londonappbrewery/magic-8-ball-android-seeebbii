package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AskButton;
        AskButton = (Button) findViewById(R.id.AskButton);

       final ImageView Fortune1 = (ImageView) findViewById(R.id.Fortune1);

       final int[] FortuneArray={
               R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
               R.drawable.ball5,
       };


        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Ask","The ask button has been pressed");

                Random RandomNumbers = new Random();

                int numbers = (int) RandomNumbers.nextInt(5);

                Log.d("RandomNumbers", "The number generated is " + numbers);


                Fortune1.setImageResource(FortuneArray[numbers]);

            }
        });

    }





}
