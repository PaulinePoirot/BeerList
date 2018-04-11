package com.example.pauli.beerlist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int DIALOG_ALERT = 10;


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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void toast() {
        Toast.makeText(getApplicationContext(), getString(R.string.health_notification), Toast.LENGTH_LONG).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.toast:
                toast();
            default:
                return super.onOptionsItemSelected(item);
        }
    }





}
