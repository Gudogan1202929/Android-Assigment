package com.example.assigment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tv = findViewById(R.id.lesson1_title);

        btn1 = findViewById(R.id.lesson1);
        btn2 = findViewById(R.id.lesson2);
        btn3 = findViewById(R.id.lesson3);
        btn4 = findViewById(R.id.lesson4);
        btn5 = findViewById(R.id.lesson5);
        btn6 = findViewById(R.id.lesson6);
        btn7 = findViewById(R.id.lesson7);
        btn8 = findViewById(R.id.lesson8);
        btn9 = findViewById(R.id.lesson9);
        btn10 = findViewById(R.id.lesson10);

        tv1 = findViewById(R.id.lesson1_text);
        tv2 = findViewById(R.id.lesson2_text);
        tv3 = findViewById(R.id.lesson3_text);
        tv4 = findViewById(R.id.lesson4_text);
        tv5 = findViewById(R.id.lesson5_text);
        tv6 = findViewById(R.id.lesson6_text);
        tv7 = findViewById(R.id.lesson7_text);
        tv8 = findViewById(R.id.lesson8_text);
        tv9 = findViewById(R.id.lesson9_text);
        tv10 = findViewById(R.id.lesson10_text);

        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        tv4.setMovementMethod(LinkMovementMethod.getInstance());
        tv5.setMovementMethod(LinkMovementMethod.getInstance());
        tv6.setMovementMethod(LinkMovementMethod.getInstance());
        tv7.setMovementMethod(LinkMovementMethod.getInstance());
        tv8.setMovementMethod(LinkMovementMethod.getInstance());
        tv9.setMovementMethod(LinkMovementMethod.getInstance());
        tv10.setMovementMethod(LinkMovementMethod.getInstance());

        btn1.setOnClickListener(v -> {

            if(tv1.getVisibility() == TextView.VISIBLE){
                tv1.setVisibility(TextView.GONE);
            }else{
                tv1.setVisibility(TextView.VISIBLE);
            }


            //create a toast message
            Toast.makeText(this, "حيفا والنورس تم", Toast.LENGTH_SHORT).show();

        });

        btn2.setOnClickListener(v -> {

            if(tv2.getVisibility() == TextView.VISIBLE){
                tv2.setVisibility(TextView.GONE);
            }else{
                tv2.setVisibility(TextView.VISIBLE);
            }
            Toast.makeText(this, "يوم الشجرة تم", Toast.LENGTH_SHORT).show();

        });

        btn3.setOnClickListener(v -> {

            if(tv3.getVisibility() == TextView.VISIBLE){
                tv3.setVisibility(TextView.GONE);
            }else{
                tv3.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "الراعي والذئب تم", Toast.LENGTH_SHORT).show();

        });

        btn4.setOnClickListener(v -> {

            if(tv4.getVisibility() == TextView.VISIBLE){
                tv4.setVisibility(TextView.GONE);
            }else{
                tv4.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "اخب ان اكون تم", Toast.LENGTH_SHORT).show();
        });

        btn5.setOnClickListener(v -> {

            if(tv5.getVisibility() == TextView.VISIBLE){
                tv5.setVisibility(TextView.GONE);
            }else{
                tv5.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "من اخلاقنا تم", Toast.LENGTH_SHORT).show();

        });

        btn6.setOnClickListener(v -> {

            if(tv6.getVisibility() == TextView.VISIBLE){
                tv6.setVisibility(TextView.GONE);
            }else{
                tv6.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "في ميناء غزة تم", Toast.LENGTH_SHORT).show();

        });

        btn7.setOnClickListener(v -> {

            if(tv7.getVisibility() == TextView.VISIBLE){
                tv7.setVisibility(TextView.GONE);
            }else{
                tv7.setVisibility(TextView.VISIBLE);
            }


            Toast.makeText(this, "الغراب والثعلب تم", Toast.LENGTH_SHORT).show();
        });

        btn8.setOnClickListener(v -> {

            if(tv8.getVisibility() == TextView.VISIBLE){
                tv8.setVisibility(TextView.GONE);
            }else{
                tv8.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "المبدهة الصغيرة تم", Toast.LENGTH_SHORT).show();

        });

        btn9.setOnClickListener(v -> {

            if(tv9.getVisibility() == TextView.VISIBLE){
                tv9.setVisibility(TextView.GONE);
            }else{
                tv9.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "ذكاء القاضي اياس تم", Toast.LENGTH_SHORT).show();

        });

        btn10.setOnClickListener(v -> {

            if(tv10.getVisibility() == TextView.VISIBLE){
                tv10.setVisibility(TextView.GONE);
            }else{
                tv10.setVisibility(TextView.VISIBLE);
            }

            Toast.makeText(this, "في حديقة الحيوان تم", Toast.LENGTH_SHORT).show();

        });



    }

    //
}