package com.example.aayush.click;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        configurerepair();
        configuremedicines();
        configuregroceries();
    }
    private void configurerepair(){
        Button list = (Button)findViewById(R.id.repair);     //for medicine shops button on search page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Search.this, RepairShops.class));
            }
        });
    }
    private void configuremedicines(){
        Button list = (Button)findViewById(R.id.medicine);     //for medicine shops button on search page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Search.this, MedicineShop.class));
            }
        });
    }
    private void configuregroceries(){
        Button list = (Button)findViewById(R.id.grocery);     //for medicine shops button on search page
        list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Search.this, GroceryShop.class));
            }
        });
    }

}
