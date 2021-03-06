package edu.dtcc.cis282student.activity_life_cycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnCreate Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "Onstart Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnRestart Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnResume Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnPause Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnStop Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Snackbar
                .make(findViewById(android.R.id.content), "OnDestroy Snackbar", Snackbar.LENGTH_LONG)
                .show();
    }
}
