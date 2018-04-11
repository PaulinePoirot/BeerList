package com.example.pauli.beerlist;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);



        TextView nameTextView = (TextView) this.findViewById(R.id.textViewName);
        TextView shortNameTextView = (TextView) this.findViewById(R.id.textViewShortName);
        TextView nameTextDescription = (TextView) this.findViewById(R.id.textViewDescription);

        nameTextView.setText(getIntent().getStringExtra("beer_name"));
        nameTextDescription.setText(getIntent().getStringExtra("beer_description"));
        shortNameTextView.setText(getIntent().getStringExtra("beer_shortName"));

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
