package com.shablcu.shalu.menuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main, menu);
      //  return super.onCreateOptionsMenu(menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.create_new:
                Toast.makeText(getApplicationContext(), "i am create ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.open:
                Toast.makeText(getApplicationContext(), "i am open", Toast.LENGTH_LONG).show();

                return true;

            case R.id.file:
                Toast.makeText(getApplicationContext(), "i am file", Toast.LENGTH_LONG).show();

            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
