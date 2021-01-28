package com.example.endofsemsem2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button simulateButton;
    private static int stage;
    private static final int RED = Color.RED;
    private static final int YELLOW = Color.YELLOW;
    private static final int GREEN = Color.GREEN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simulateButton = (Button) findViewById(R.id.simulateButton);
        // initially set button color to red
        stage = 1;
        simulateButton.setBackgroundColor(RED);
        stage++;
        simulateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stage == 1)
                {
                    simulateButton.setText("STOP");
                    simulateButton.setBackgroundColor(RED);
                    stage++;
                }
                else if(stage == 2)
                {
                    simulateButton.setText("GO");
                    simulateButton.setBackgroundColor(GREEN);
                    stage++;
                }
                else if(stage == 3)
                {
                    simulateButton.setText("WAIT");
                    simulateButton.setBackgroundColor(YELLOW);
                    stage = 1;
                }
            }
        });
    }
}
