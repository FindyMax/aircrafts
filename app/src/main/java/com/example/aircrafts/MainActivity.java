package com.example.aircrafts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Plane plane1, plane2;
    private Helicopter helicopter;
    private EditText input;
    private Button button;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int distance = Integer.parseInt(input.getText().toString());

            plane1 = new Plane(210, 850, 3700);
            plane2 = new Plane(189, 900, 2800);
            helicopter = new Helicopter(8, 250, 14);

            output.setText("Самолёт 1 пролетит за " + plane1.airTime(distance) + " часов, потратив " + plane1.fuelConsumption(distance) + "кг топлива\n" +
                    "Самолёт 2 пролетит за " + plane2.airTime(distance) + " часов, потратив " + plane2.fuelConsumption(distance) + "кг топлива\n" +
                    "Вертолёт пролетит за " + helicopter.airTime(distance) + " часов, потратив " + helicopter.fuelConsumption(distance) + "кг топлива\n");
        }
    };
}