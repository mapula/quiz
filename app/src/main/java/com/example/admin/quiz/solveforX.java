package com.example.admin.quiz;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;


public class solveforX extends AppCompatActivity{

    int w, x, y, z, d;

    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    private RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5;

    TextView txtPercentDisplay;

    private Button btnSubmit;
    private TextView txtdisplay;
    private String text = "";
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solvefor_x);

        radioGroup1 = (RadioGroup) findViewById(R.id.radio_g1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_g2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_g3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_g4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radio_g5);
        txtdisplay = (TextView) findViewById(R.id.score_text_view);


        radiobutton1 = (RadioButton) findViewById(R.id.rdoANSWER);
        radiobutton2 = (RadioButton) findViewById(R.id.rdoANSWER1);
        radiobutton3 = (RadioButton) findViewById(R.id.rdoANSWER2);
        radiobutton4 = (RadioButton) findViewById(R.id.rdoANSWER3);
        btnSubmit = (Button) findViewById(R.id.sub_button);

        txtPercentDisplay = (TextView) findViewById(R.id.percentage);


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


                try {
                    if (radiobutton1.getText().equals("-2/3")) {
                        x = 1;
                    } else {
                        x = 0;
                    }

                    if (radiobutton2.getText().equals("8")) {
                        w = 1;
                    } else {
                        w = 0;
                    }

                    if (radiobutton3.getText().equals("18")) {
                        y = 1;
                    } else {
                        y = 0;
                    }

                    if (radiobutton4.getText().equals("-2")) {
                        z = 1;
                    } else {
                        z = 0;
                    }

                    if (radiobutton5.getText().equals("11")) {
                        d = 1;
                    } else {
                        d = 0;
                    }

                    int t = x + w + y + z + d;
                    int results = (int) (t * 100.0f) / 5;
                    // Toast.makeText(solveforX.this, "Your score is: " + results + " %", Toast.LENGTH_LONG).show();
                    txtPercentDisplay.setText(results + "%");
                    // showMessage("ScoreBoard", "Your score is: \n" + results);
                }catch (Exception e){
                    Toast.makeText(solveforX.this, "Please complete all the questions!", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

//    public void showMessage(String title, String message){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle(title);
//        builder.setMessage(message);
//        builder.setCancelable(true);
//        builder.show();
//    }
}