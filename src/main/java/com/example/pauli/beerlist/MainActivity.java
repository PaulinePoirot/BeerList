package com.example.pauli.beerlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }


    public void listActivity(View view){
        startActivity(new Intent(this, ListActivity.class));
    }



    public void searchActivity(View view){
        startActivity(new Intent(this, SearchActivity.class));
    }

}
