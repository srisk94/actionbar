package com.example.srima.action;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.add:
            Toast.makeText(this,"you selected plus", Toast.LENGTH_LONG).show();
            return(true);
        case R.id.reset:
            Toast.makeText(this, "you selected honeycomb", Toast.LENGTH_LONG).show();
            return(true);


    }
        return(super.onOptionsItemSelected(item));
    }
}
