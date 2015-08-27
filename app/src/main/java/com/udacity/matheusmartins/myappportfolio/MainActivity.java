package com.udacity.matheusmartins.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button spotifyStreamerButton = (Button) findViewById(R.id.main_spotify_streamer_button_name);
        Button scoresAppButton = (Button) findViewById(R.id.main_scores_app_button_name);
        Button myLibraryButton = (Button) findViewById(R.id.main_library_app_button_name);
        Button buildItBiggerButton = (Button) findViewById(R.id.main_build_it_bigger_button_name);
        Button xyzReader = (Button) findViewById(R.id.main_xyz_reader_button_name);
        Button capstoneButton = (Button) findViewById(R.id.main_capstone_my_own_app_button_name);

        spotifyStreamerButton.setOnClickListener(onButtonClickListener);
        scoresAppButton.setOnClickListener(onButtonClickListener);
        myLibraryButton.setOnClickListener(onButtonClickListener);
        buildItBiggerButton.setOnClickListener(onButtonClickListener);
        xyzReader.setOnClickListener(onButtonClickListener);
        capstoneButton.setOnClickListener(onButtonClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    View.OnClickListener onButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button buttonClicked = (Button) v;
            String buttonName = buttonClicked.getText().toString();
            Toast.makeText(MainActivity.this, "This button will launch my "+buttonName+" app.", Toast.LENGTH_SHORT).show();
        }
    };
}
