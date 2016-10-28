package com.example.admin.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class maths extends AppCompatActivity {

    private RadioGroup radg1, radg2, radg3, radg4, radg5;
    private RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5;

    private Button btnSubmit;
    int x,w,y,z,d;
    TextView txtPercentDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        radg1 = (RadioGroup) findViewById(R.id.radg1);
        radg2 = (RadioGroup) findViewById(R.id.radg2);
        radg3 = (RadioGroup) findViewById(R.id.radg3);
        radg4 = (RadioGroup) findViewById(R.id.radg4);
        radg5 = (RadioGroup) findViewById(R.id.radg5);
        btnSubmit = (Button) findViewById(R.id.button_sub);
        txtPercentDisplay = (TextView) findViewById(R.id.Percentage2);


        btnSubmit.setOnClickListener(new View.OnClickListener() {

                    @Override
            public void onClick(View view) {

                int selectedId1 = radg1.getCheckedRadioButtonId();
                radiobutton1 = (RadioButton) findViewById(selectedId1);

                int selectedId2 = radg2.getCheckedRadioButtonId();
                radiobutton2 = (RadioButton) findViewById(selectedId2);


                int selectedId3 = radg3.getCheckedRadioButtonId();
                radiobutton3 = (RadioButton) findViewById(selectedId3);

                int selectedId4 = radg4.getCheckedRadioButtonId();
                radiobutton4 = (RadioButton) findViewById(selectedId4);


                int selectedId5 = radg5.getCheckedRadioButtonId();
                radiobutton5 = (RadioButton) findViewById(selectedId5);
                try{

                    if (radiobutton1.getText().equals("0")) {
                        x = 1;
                    } else {
                        x = 0;
                    }

                    if (radiobutton2.getText().equals("21")) {
                        w = 1;
                    } else {
                        w = 0;
                    }

                    if (radiobutton3.getText().equals("10")) {
                        y = 1;
                    } else {
                        y = 0;
                    }

                    if (radiobutton4.getText().equals("25")) {
                        z = 1;
                    } else {
                        z = 0;
                    }

                    if (radiobutton5.getText().equals("48")) {
                        d = 1;
                    } else {
                        d = 0;
                    }

                    int t = x + w + y + z + d;
                    int results = (int) (t * 100.0f) / 5;
                    Toast.makeText(maths.this, "Your score is: " + results + " %", Toast.LENGTH_LONG).show();
                    txtPercentDisplay.setText(results + "%");

                }catch (Exception g){
                    Toast.makeText(maths.this,"Please complete all questions",Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}





