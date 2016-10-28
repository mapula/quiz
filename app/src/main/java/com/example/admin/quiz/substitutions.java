package com.example.admin.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class substitutions extends AppCompatActivity {

    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    private RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5;

    private Button btnSubmit;
    int x, w, y, z, d;
    TextView txtPercentDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substitutions);

        radioGroup1 = (RadioGroup) findViewById(R.id.rg1);
        radioGroup2 = (RadioGroup) findViewById(R.id.rg2);
        radioGroup3 = (RadioGroup) findViewById(R.id.rg3);
        radioGroup4 = (RadioGroup) findViewById(R.id.rg4);
        radioGroup5 = (RadioGroup) findViewById(R.id.rg5);


        btnSubmit = (Button) findViewById(R.id.submit_button);
        txtPercentDisplay = (TextView) findViewById(R.id.Percentage1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                radiobutton1 = (RadioButton) findViewById(selectedId1);

                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                radiobutton2 = (RadioButton) findViewById(selectedId2);

                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                radiobutton3 = (RadioButton) findViewById(selectedId3);

                int selectedId4 = radioGroup4.getCheckedRadioButtonId();
                radiobutton4 = (RadioButton) findViewById(selectedId4);

                int selectedId5 = radioGroup5.getCheckedRadioButtonId();
                radiobutton5 = (RadioButton) findViewById(selectedId5);

                try{

                if (radiobutton1.getText().equals("8")) {
                    x = 1;
                } else {
                    x = 0;
                }

                if (radiobutton2.getText().equals("-10")) {
                    w = 1;
                } else {
                    w = 0;
                }

                if (radiobutton3.getText().equals("2")) {
                    y = 1;
                } else {
                    y = 0;
                }

                if (radiobutton4.getText().equals("5")) {
                    z = 1;
                } else {
                    z = 0;
                }

                if (radiobutton5.getText().equals("-39")) {
                    d = 1;
                } else {
                    d = 0;
                }

                int t = x + w + y + z + d;
                int results = (int) (t * 100.0f) / 5;
                Toast.makeText(substitutions.this, "Your score is: " + results + " %", Toast.LENGTH_LONG).show();
                txtPercentDisplay.setText(results + "%");

            }catch (Exception g){
                    Toast.makeText(substitutions.this,"Please complete all questions",Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}