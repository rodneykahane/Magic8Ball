package com.aaclogic.magic8ball;

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

        Button rollButton;
        rollButton=findViewById(R.id.rollButton);

        final ImageView ballView = findViewById(R.id.imageBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };//end ballArray

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magic-8-ball","ze button has been pressed!");//debugging, the .d identifies this as a debugging message in the logs

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                Log.d("magic-8-ball","The random number is "+number);//debugging, the .d identifies this as a debugging message in the logs

                ballView.setImageResource(ballArray[number]);

            }//end onClick
        });//end rollButton listener


    }//end onCreate
}//end class