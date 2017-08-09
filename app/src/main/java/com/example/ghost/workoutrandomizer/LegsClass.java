package com.example.ghost.workoutrandomizer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.LinkedList;

import java.util.Random;

/**
 * Created by Ghost on 5/26/2017.
 */

public class LegsClass extends Activity implements View.OnClickListener
{
    private EditText numberOfWorkouts;

    private Button buttonToGenerateWorkout, buttonToClear;
    private TextView legWorkouts, testLink;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs_layout_ui);

        init();
    }

    public void init(){



        numberOfWorkouts = (EditText) findViewById(R.id.editTextNumberOfWorkouts);

        numberOfWorkouts.setOnClickListener(this);

        buttonToGenerateWorkout = (Button) findViewById(R.id.btnToGenerateLegWorkouts);
       // buttonToGenerateWorkout.setX(10);
        //buttonToGenerateWorkout.setY(15);


        buttonToClear = (Button) findViewById(R.id.ClearBtnLegs);
//        buttonToClear.setX(25);
//        buttonToClear.setY(25);


        legWorkouts = (TextView) findViewById(R.id.txtViewEndUp);

       // legWorkouts.setX(40);
        //legWorkouts.setY(40);



    }

   public void Clear(View view){
       legWorkouts.setText("");
   }

    public void onClick(View view){
        legWorkouts.setText("");  //clears text everytime button is clicked to avoid stacking
        Random ran = new Random();
        try {
            String x = numberOfWorkouts.getText().toString();  //gets the number of workouts user wishes to perform
            if(Integer.parseInt(x) > 5){
                x = "5";
            }

            LinkedList compoundList = new LinkedList();
            String[] compoundArray = new String[2];
            LinkedList isolationList = new LinkedList();
            String[] isolationArray = new String[Integer.parseInt(x)];//creates array based on # of workouts user wishes to perform

            compoundList.addFirst("Romanian Deadlift");
            compoundList.addFirst("Squat");
            compoundList.addFirst("Front squat");
            compoundList.addFirst("Barbell lunge");
            compoundList.addFirst("leg press");



//        list.addFirst("Calf raises 4x10");
//        list.addFirst("hack squat 3x10");
//        list.addFirst("hammies 3x12");
//        list.addFirst("Sump Deadlift 4x8");
//        list.addFirst("Standing calf raises 3x10");
//        list.addFirst("Calf rotary 4x25");
//        list.addFirst("hack squat machine 3x10");
//        list.addFirst("leg extension 3x12");

            for(int i = 0; i < compoundArray.length; i++){
                int z = ran.nextInt(compoundList.size());
                compoundArray[i] = (String)compoundList.remove(z);
            }

            legWorkouts.append("COMPOUND MOVEMENTS");
           legWorkouts.append("\n");
            legWorkouts.append("--------------------------------------");
            legWorkouts.append("\n");

            for(int i = 0; i < compoundArray.length; i++){
                legWorkouts.append(compoundArray[i]);
                legWorkouts.append("\n");
            }

            legWorkouts.append("--------------------------------------");
            legWorkouts.append("\n");

            isolationList.addFirst("Calf raises 4x10");
            isolationList.addFirst("hack squat 3x10");
            isolationList.addFirst("hammies 3x12");
            isolationList.addFirst("Sump Deadlift 4x8");
            isolationList.addFirst("Standing calf raises 3x10");
            isolationList.addFirst("Calf rotary 4x25");
            isolationList.addFirst("hack squat machine 3x10");
            isolationList.addFirst("leg extension 3x12");

            for(int i = 0; i < isolationArray.length; i++){
                int z = ran.nextInt(isolationList.size());
                isolationArray[i] = (String) isolationList.remove(z);
            }

            legWorkouts.append("ISOLATION EXERCISES");
            legWorkouts.append("\n");
            legWorkouts.append("--------------------------------------");
            legWorkouts.append("\n");


            for(int i = 0; i < isolationArray.length; i++){
                legWorkouts.append(isolationArray[i]);
                legWorkouts.append("\n");
            }


        }catch(NumberFormatException ex){

            legWorkouts.append("Enter a number");
        }




    }

    public void ClearTwo(View view) {

            legWorkouts.setText("");


    }

//    public void goToUrl(String url){
//        Uri url1 = Uri.parse(url);
//        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, url1);
//        startActivity(launchBrowser);
//
//
//    }


}
