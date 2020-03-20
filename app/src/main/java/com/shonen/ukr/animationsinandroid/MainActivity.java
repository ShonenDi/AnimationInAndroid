package com.shonen.ukr.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           txtHelloWorld = findViewById(R.id.txtHelloWorld);
           txtHiWorld = findViewById(R.id.txtHiWorld);
           txtHelloWorld.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
//                   Log.i("Mylog", "Button was clicked");
//                   txtHelloWorld.animate().rotation(90f).setDuration(1000);
                   txtHelloWorld.animate().alpha(0.f).setDuration(5000);
                   txtHiWorld.animate().alpha(1f).setDuration(3000);
               }
           });
    }
}
