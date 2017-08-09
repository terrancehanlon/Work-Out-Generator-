    package com.example.ghost.workoutrandomizer;

    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    public class MainActivity extends AppCompatActivity {
        Button btnLEGS1, btnARMS1, btnSHOULDERS1, btnCHEST1, btnABS1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            init();
        }


        public void init(){
            btnLEGS1 = (Button) findViewById(R.id.btnLegs);
            btnARMS1 = (Button)findViewById(R.id.btnArms);
            btnSHOULDERS1 = (Button) findViewById(R.id.btnShoulders);
            btnCHEST1 = (Button)findViewById(R.id.btnChest);
            btnABS1 = (Button) findViewById(R.id.btnAbs);
        }


        public void newActivityButtonClick(View view){
            if( (view.getId() == R.id.btnLegs)){
                Intent i = new Intent(MainActivity.this, LegsClass.class);
                startActivity(i);
            }



        }















    }
