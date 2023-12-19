package com.example.customdrawablebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnToast;


    TextView tvSetTextForToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnToast = findViewById(R.id.btnToast);
        // first step is find id of the button and add set on click listener
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 2- step create layout for the toast and height or width must be match_parent


                // 3- create object of the Toast
                Toast toast = new Toast(getApplicationContext());

                //4 - Set Layout
                View viewSetter ;

                viewSetter = getLayoutInflater().inflate(R.layout.custom_layout_for_toast,(ViewGroup) findViewById(R.id.llToastId));

                toast.setView(viewSetter);



                // 5- find the id with the help of the view because this is not main file
                tvSetTextForToast = viewSetter.findViewById(R.id.tvSetTextForToast);
                tvSetTextForToast.setText("SHOW THE CUSTOM TEXT");
                //6- set duration

                toast.setDuration(Toast.LENGTH_LONG);


                toast.setGravity(Gravity.TOP , 0 , 0);


                // 7- then show text
                toast.show();

            }
        });
    }
}