package com.example.pauli.beerlist;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class SearchActivity extends AppCompatActivity {







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
