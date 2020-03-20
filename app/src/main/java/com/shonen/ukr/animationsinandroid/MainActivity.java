package com.shonen.ukr.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView someTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           txtHelloWorld = findViewById(R.id.txtHelloWorld);
           txtHiWorld = findViewById(R.id.txtHiWorld);
           someTxtView = findViewById(R.id.someTxtView);
           txtHelloWorld.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
//                   Log.i("Mylog", "Button was clicked");
//                   txtHelloWorld.animate().rotation(90f).setDuration(1000);
                   if(txtHelloWorld.getAlpha()==1) {
                       txtHelloWorld.animate().alpha(0.f).setDuration(3000);
                       txtHiWorld.animate().alpha(1f).setDuration(3000);
                   }else{
                       txtHelloWorld.animate().alpha(1f).setDuration(3000);
                       txtHiWorld.animate().alpha(0f).setDuration(3000);
                   }
               }
           });

           someTxtView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
//                   someTxtView.animate().translationX(3000f).setDuration(3000);
//                   someTxtView.animate().translationY(-3000f).setDuration(3000);
                   someTxtView.animate().translationXBy(200f).setDuration(3000);
               }
           });
    }
}
