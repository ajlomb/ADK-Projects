package com.example.alexanderlombardo.gradefinder;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int numericalGrade;
    private TextView output;
    private EditText jesus;


    @Override
    protected void onCreate(Bundle numericalGrade) {
        super.onCreate(numericalGrade);

        setContentView(R.layout.activity_main);


        // Capture our button from layout
        Button gradeL = (Button)findViewById(R.id.grade);
        Button fiveR = (Button)findViewById(R.id.fiver);
        Button passFail = (Button)findViewById(R.id.passfail);
        output = (TextView)findViewById(R.id.output);
        jesus = (EditText)findViewById(R.id.numericalGrade);
        // Register the onClick listener with the implementation above
//        gradeL.setOnClickListener(this);
//        fiveR.setOnClickListener(this);
//        passFail.setOnClickListener(this);

    }

    public void LetterGrade(View v)
    {
        String flap = jesus.getText().toString();
        numericalGrade = Integer.parseInt(flap);

        Toast.makeText(getApplicationContext(), "Here comes your grade!", Toast.LENGTH_LONG).show();
        if (numericalGrade > 90 && numericalGrade <= 100){
            output.setText("A");
        }
        else if (numericalGrade > 80 && numericalGrade <=90) {
            output.setText("B");
        }
        else if (numericalGrade > 70 && numericalGrade <=80) {
            output.setText("C");
        }
        else if (numericalGrade > 60 && numericalGrade <=70) {
            output.setText("D");
        }
        else if (numericalGrade >= 0 && numericalGrade <= 60) {
            output.setText("F");
        }
        else {

            output.setText("Not a valid grade");
        }
    }
    public void PassFail(View v)
    {
        String flap = jesus.getText().toString();
        numericalGrade = Integer.parseInt(flap);
        Toast.makeText(getApplicationContext(), "Did you pass or fail?", Toast.LENGTH_LONG).show();
        if (numericalGrade >= 65 && numericalGrade <= 100) {
            output.setText("Passing Grade!");
        }
        else if (numericalGrade < 65 && numericalGrade >= 0) {
            output.setText("Failing Grade");
        }
        else {
            output.setText("Not a valid grade");
        }
    }
    public void FiveTimes(View v)
    {
        String flap = jesus.getText().toString();
        numericalGrade = Integer.parseInt(flap);
        Toast.makeText(getApplicationContext(), "ERROR: Five Five Five Five Five....", Toast.LENGTH_LONG).show();
        // when 'fiver' is clicked, display input 5 times
        if (numericalGrade >= 0 && numericalGrade <= 100) {
            output.setText(numericalGrade + " " + numericalGrade + " " + numericalGrade + " " + numericalGrade + " " + numericalGrade);
        }
    }
    @Override
    public void onClick(View v) {



      //  switch (v.getId() /*to get clicked view id**/) {
      //      case R.id.grade:

                // when 'grade' is clicked, display letter grade based on range it falls into


//                break;
//            case R.id.fiver:



//                break;
//            case R.id.passfail:

                // when 'passfail' is clicked, display pass if grade is 65 or greater, otherwise fail


//                break;
//            default:
//                break;
        }
    }


