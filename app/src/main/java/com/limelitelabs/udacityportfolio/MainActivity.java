package com.limelitelabs.udacityportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;

    Toast toast;
    String toastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("My App Portfolio");

        Button viewSpotifyStreamerButton = (Button) findViewById(R.id.main_action_view_spotify_streamer);
        Button viewSuperduoFootballScoresButton = (Button) findViewById(R.id.main_action_view_superduo_football_scores);
        Button viewSuperduoLibraryButton = (Button) findViewById(R.id.main_action_view_superduo_library);
        Button viewBuildItBiggerButton = (Button) findViewById(R.id.main_action_view_build_it_bigger);
        Button viewXYZRecorderButton = (Button) findViewById(R.id.main_action_view_xyz_reader);
        Button viewCapstoneButton = (Button) findViewById(R.id.main_action_view_capstone);

        viewSpotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'Spotify Streamer' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        viewSuperduoFootballScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'Superduo: Football Scores' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        viewSuperduoLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'Superduo: Library' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        viewBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'Build it Bigger' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        viewXYZRecorderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'XYZ Recorder' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        viewCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMessage = "This opens the 'Capstone' project";
                if (toast != null) {
                    toast.setText(toastMessage);
                    toast.show();
                } else {
                    toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
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
}
