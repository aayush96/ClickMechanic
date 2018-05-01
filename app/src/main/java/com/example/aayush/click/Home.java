package com.example.aayush.click;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        configureabout();
        configuredev();
        configurementor();
        configuresearch();
    }
    private void configureabout(){
        Button list = (Button)findViewById(R.id.about);     //for about button on home page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Home.this, About.class));
            }
        });
    }
    private void configurementor(){
        Button list = (Button)findViewById(R.id.mentor);     //for mentor button on home page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Home.this, Mentor.class));
            }
        });
    }
    private void configuredev(){
        Button list = (Button)findViewById(R.id.developer);     //for developer button on home page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Home.this, Developer.class));
            }
        });
    }
    private void configuresearch(){
        Button list = (Button)findViewById(R.id.search);     //for search button on home page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Home.this, Search.class));
            }
        });
    }
}
//A Travel Companion Android Application that helps you with what Google Maps does not generally contain, including places of local use like medicine shops, local vehicle repair shops, and grocery stores.